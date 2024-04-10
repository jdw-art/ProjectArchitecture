package com.macro.mall.malltiny05.controller;

import com.macro.mall.malltiny05.common.api.CommonPage;
import com.macro.mall.malltiny05.common.api.CommonResult;
import com.macro.mall.malltiny05.nosql.elasticsearch.document.EsProduct;
import com.macro.mall.malltiny05.service.EsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/6 15:37
 * @Version: 1.0
 */
@Controller
@Api(tags = "EsProductController")
@Tag(name = "EsProductController", description = "商品搜索管理")
@RequestMapping("/esProduct")
public class EsProductController {

    @Autowired
    private EsProductService productService;

    @ApiOperation(value = "导入所有数据库商品到ES")
    @RequestMapping(value = "/importAll", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> importAllList() {
        int count = productService.importAll();
        return CommonResult.success(count);
    }

    @ApiOperation(value = "根据id删除商品")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> delete(@PathVariable Long id) {
        productService.delete(id);
        return CommonResult.success(null);
    }

    @ApiOperation(value = "根据id批量删除商品")
    @RequestMapping(value = "/delete/batch", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> delete(@RequestParam("ids") List<Long> ids) {
        productService.delete(ids);
        return CommonResult.success(null);
    }

    @ApiOperation(value = "根据id创建商品")
    @RequestMapping(value = "/create/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<EsProduct> create(@PathVariable Long id) {
        EsProduct esProduct = productService.create(id);
        if (esProduct != null) {
            return CommonResult.success(esProduct);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "简单搜索")
    @RequestMapping(value = "/search/simple", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsProduct>> search(@RequestParam(required = false) String keyword,
                                                      @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                      @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        Page<EsProduct> esProductPage = productService.search(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(esProductPage));
    }

}
