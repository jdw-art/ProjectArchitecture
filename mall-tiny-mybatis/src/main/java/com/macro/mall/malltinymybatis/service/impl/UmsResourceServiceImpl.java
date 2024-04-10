package com.macro.mall.malltinymybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.macro.mall.malltinymybatis.dao.UmsResourceDao;
import com.macro.mall.malltinymybatis.model.UmsResource;
import com.macro.mall.malltinymybatis.service.UmsResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/3 17:51
 * @Version: 1.0
 */
@Service
public class UmsResourceServiceImpl implements UmsResourceService {

    @Autowired
    private UmsResourceDao umsResourceDao;

    @Override
    public PageInfo<UmsResource> page(Integer pageNum, Integer pageSize, Long categoryId) {
        PageHelper.startPage(pageNum,pageSize);
        List<UmsResource> resourceList = umsResourceDao.selectListByCategoryId(categoryId);
        PageInfo<UmsResource> pageInfo = new PageInfo<>(resourceList);
        return pageInfo;
    }
}
