package com.macro.mall.tiny.domain;

import com.macro.mall.tiny.mbg.model.UmsResource;
import com.macro.mall.tiny.mbg.model.UmsResourceCategory;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 12:59
 * @Version: 1.0
 */
public class ResourceWithCateDto extends UmsResource {

    private UmsResourceCategory resourceCategory;

    public UmsResourceCategory getResourceCategory() {
        return resourceCategory;
    }

    public void setResourceCategory(UmsResourceCategory resourceCategory) {
        this.resourceCategory = resourceCategory;
    }

}
