package com.macro.mall.malltiny08.config;

import com.macro.mall.malltiny08.domain.AdminUserDetails;
import com.macro.mall.malltiny08.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/5 17:11
 * @Version: 1.0
 */
@Configuration
public class MallSecurityConfig {

    @Autowired
    private UmsAdminService umsAdminService;

    @Bean
    public UserDetailsService userDetailsService() {
        // 获取登录用户信息
        return username -> {
            AdminUserDetails admin = umsAdminService.getAdminByUsername(username);
            if (admin != null) {
                return admin;
            }
            throw new UsernameNotFoundException("用户名或密码错误");
        };
    }

}
