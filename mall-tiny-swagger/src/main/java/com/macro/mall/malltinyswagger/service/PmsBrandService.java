package com.macro.mall.malltinyswagger.service;

import com.macro.mall.malltinyswagger.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 17:52
 * @Version: 1.0
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
