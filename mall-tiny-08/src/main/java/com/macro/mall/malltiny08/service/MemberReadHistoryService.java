package com.macro.mall.malltiny08.service;

import com.macro.mall.malltiny08.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/7 11:02
 * @Version: 1.0
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     * @param memberReadHistory
     * @return
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     * @param ids
     * @return
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览记录
     * @param memberId
     * @return
     */
    List<MemberReadHistory> list(Long memberId);
}
