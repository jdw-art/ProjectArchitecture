package com.macro.mall.malltiny08.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/8 10:59
 * @Version: 1.0
 */
@Data
@EqualsAndHashCode
@Builder
public class BucketPolicyConfigDto {

    private String Version;
    private List<Statement> Statement;

    @Data
    @EqualsAndHashCode
    @Builder
    public static class Statement {
        private String Effect;
        private String Principal;
        private String Action;
        private String Resource;

    }
}
