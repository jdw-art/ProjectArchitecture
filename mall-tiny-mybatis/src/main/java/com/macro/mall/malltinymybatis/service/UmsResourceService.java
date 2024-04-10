package com.macro.mall.malltinymybatis.service;

import com.github.pagehelper.PageInfo;
import com.macro.mall.malltinymybatis.model.UmsResource;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/3 17:49
 * @Version: 1.0
 */
public interface UmsResourceService {

    PageInfo<UmsResource> page(Integer pageNum, Integer pageSize, Long categoryId);

}
