package com.macro.mall.malltinymybatis.test;

import cn.hutool.crypto.digest.BCrypt;
import com.macro.mall.malltinymybatis.dao.UmsAdminDao;
import com.macro.mall.malltinymybatis.model.UmsAdmin;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;


/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/3 12:51
 * @Version: 1.0
 */
@SpringBootTest
public class MyBatisBaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger((MyBatisBaseTest.class));

    @Autowired
    private UmsAdminDao umsAdminDao;

    @Test
    void testSelectByIdSimple() {
        UmsAdmin umsAdmin = umsAdminDao.selectByIdSimple(1L);
        LOGGER.info("testSelectByIdSimple result={}",umsAdmin);
    }

    @Test
    void testSelectById() {
        UmsAdmin umsAdmin = umsAdminDao.selectById(1L);
        LOGGER.info("testSelectByIdSimple result={}",umsAdmin);
    }

    @Test
    void testInsert(){
        UmsAdmin admin = new UmsAdmin();
        admin.setUsername("newTest");
        admin.setPassword(BCrypt.hashpw("123456"));
        admin.setEmail("newTest@qq.com");
        admin.setNickName("tester");
        admin.setCreateTime(new Date());
        admin.setStatus(1);
        int result = umsAdminDao.insert(admin);
        LOGGER.info("testInsert id={},result={}",admin.getId(),result);
    }

    @Test
    void testUpdateById(){
        UmsAdmin admin = new UmsAdmin();
        admin.setId(14L);
        admin.setUsername("test666");
        admin.setPassword(BCrypt.hashpw("123456"));
        admin.setEmail("test666@qq.com");
        admin.setNickName("tester");
        admin.setCreateTime(new Date());
        admin.setStatus(1);
        int result  = umsAdminDao.updateById(admin);
        LOGGER.info("testUpdateById result={}",result);
    }

    @Test
    void testDeleteById(){
        int result = umsAdminDao.deleteById(14L);
        LOGGER.info("testDeleteById result={}",result);
    }



}
