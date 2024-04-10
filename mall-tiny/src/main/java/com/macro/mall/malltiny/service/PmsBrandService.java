package com.macro.mall.malltiny.service;

import com.macro.mall.malltiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: PmsBrandService接口
 * @Date: 2024/2/8 16:58
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
