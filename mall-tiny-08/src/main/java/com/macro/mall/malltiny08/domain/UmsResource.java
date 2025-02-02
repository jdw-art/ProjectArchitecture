package com.macro.mall.malltiny08.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @Author: Jacob
 * @Description: 后台资源表
 * @Date: 2024/2/5 17:08
 * @Version: 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UmsResource对象", description="后台资源表")
@Builder
public class UmsResource {
    private Long id;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "资源名称")
    private String name;

    @ApiModelProperty(value = "资源URL")
    private String url;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "资源分类ID")
    private Long categoryId;
}
