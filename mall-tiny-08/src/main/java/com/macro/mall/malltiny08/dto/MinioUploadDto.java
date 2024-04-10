package com.macro.mall.malltiny08.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/8 14:55
 * @Version: 1.0
 */
@Data
@EqualsAndHashCode
public class MinioUploadDto {
    @ApiModelProperty("文件访问URL")
    private String url;
    @ApiModelProperty("文件名称")
    private String name;
}
