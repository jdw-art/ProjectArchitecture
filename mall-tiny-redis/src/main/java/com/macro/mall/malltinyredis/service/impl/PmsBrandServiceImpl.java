package com.macro.mall.malltinyredis.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.malltinyredis.config.RedisConfig;
import com.macro.mall.malltinyredis.mbg.mapper.PmsBrandMapper;
import com.macro.mall.malltinyredis.mbg.model.PmsBrand;
import com.macro.mall.malltinyredis.mbg.model.PmsBrandExample;
import com.macro.mall.malltinyredis.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/5 14:32
 * @Version: 1.0
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper brandMapper;

    @Override
    public int create(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

    @CacheEvict(value = RedisConfig.REDIS_KEY_DATABASE, key = "'pms:brand:'+#id")
    @Override
    public int update(Long id, PmsBrand brand) {
        brand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @CacheEvict(value = RedisConfig.REDIS_KEY_DATABASE, key = "'pms:brand:'+#id")
    @Override
    public int delete(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Cacheable(value = RedisConfig.REDIS_KEY_DATABASE, key = "'pms:brand:'+#id", unless = "#result==null")
    @Override
    public PmsBrand getItem(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public List<PmsBrand> ListAll() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }
}
