package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.dto.UmsMenuNode;
import com.macro.mall.tiny.mbg.mapper.UmsMenuMapper;
import com.macro.mall.tiny.mbg.model.UmsMenu;
import com.macro.mall.tiny.mbg.model.UmsMenuExample;
import com.macro.mall.tiny.service.UmsMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/22 20:06
 * @Version: 1.0
 */
@Service
public class UmsMenuServiceImpl implements UmsMenuService{
    private Logger LOGGER = LoggerFactory.getLogger(this.getClass().getName());
    @Autowired
    private UmsMenuMapper menuMapper;

    @Override
    public List<UmsMenuNode> treeList() {
        List<UmsMenu> menuList = menuMapper.selectByExample(new UmsMenuExample());
        List<UmsMenuNode> result = menuList.stream()
                .filter(menu -> menu.getParentId().equals(0L))
                .map(menu -> covertMenuNode(menu, menuList)).collect(Collectors.toList());
        return result;
    }

    /**
     * 将UmsMenu转化为UmsMenuNode并设置children属性
     */
    private UmsMenuNode covertMenuNode(UmsMenu menu, List<UmsMenu> menuList) {
        UmsMenuNode node = new UmsMenuNode();
        BeanUtils.copyProperties(menu, node);
        List<UmsMenuNode> children = menuList.stream()
                .filter(subMenu -> subMenu.getParentId().equals(menu.getId()))
                .map(subMenu -> covertMenuNode(subMenu, menuList)).collect(Collectors.toList());
        node.setChildren(children);
        return node;
    }
}
