package com.macro.mall.malltinyredis.service;

import com.macro.mall.malltinyredis.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/5 14:32
 * @Version: 1.0
 */
public interface PmsBrandService {

    int create(PmsBrand brand);

    int update(Long id, PmsBrand brand);

    int delete(Long id);

    PmsBrand getItem(Long id);

    List<PmsBrand> list(Integer pageNum, Integer pageSize);

    List<PmsBrand> ListAll();
}
