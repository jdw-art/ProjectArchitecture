package com.macro.mall.malltiny01.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.malltiny01.mbg.mapper.PmsBrandMapper;
import com.macro.mall.malltiny01.mbg.model.PmsBrand;
import com.macro.mall.malltiny01.mbg.model.PmsBrandExample;
import com.macro.mall.malltiny01.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 16:47
 * @Version: 1.0
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
