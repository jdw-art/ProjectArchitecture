package com.macro.mall.malltiny02.service;

import com.macro.mall.malltiny02.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/5 13:19
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
