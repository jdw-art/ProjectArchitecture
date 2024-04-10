package com.macro.mall.malltiny08.nosql.mongodb.repository;

import com.macro.mall.malltiny08.nosql.mongodb.document.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 会员商品历史浏览Repository
 * @Date: 2024/2/7 10:59
 * @Version: 1.0
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String> {
    /**
     * 根据会员ID按时间倒叙获取浏览记录
     * @param memberId
     * @return
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
