package com.macro.mall.malltiny01.service;

import com.macro.mall.malltiny01.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 16:45
 * @Version: 1.0
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(Integer pageNum, Integer pageSize);

    PmsBrand getBrand(Long id);

}
