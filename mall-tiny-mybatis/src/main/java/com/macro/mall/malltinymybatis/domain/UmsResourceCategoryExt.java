package com.macro.mall.malltinymybatis.domain;

import com.macro.mall.malltinymybatis.model.UmsResource;
import com.macro.mall.malltinymybatis.model.UmsResourceCategory;
import lombok.Data;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/3 16:59
 * @Version: 1.0
 */
@Data
public class UmsResourceCategoryExt extends UmsResourceCategory {

    private List<UmsResource> resourceList;

}
