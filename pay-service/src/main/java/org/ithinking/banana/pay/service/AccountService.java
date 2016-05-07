package org.ithinking.banana.pay.service;

import org.ithinking.banana.pay.model.entity.Account;

import java.util.List;

/**
 * ${TITLE}
 *
 * @author agan
 * @date 2016-05-07
 */
public interface AccountService {

    /**
     * 创建账号
     *
     * @param ownerId
     * @return
     */
    Account createAccount(Long ownerId);

    /**
     * 根据账号获取账号信息
     *
     * @param accountId
     * @return
     */
    Account getAccountById(Long accountId);


    /**
     * 获取某人的账号信息列表
     *
     * @param ownerId
     * @return
     */
    List<Account> getAccountByOwnerId(Long ownerId);

    /**
     * 是否存在指定的账号
     *
     * @param accountId
     * @return
     */
    boolean existsAccount(Long accountId);

    /**
     * 判断用户是否有账号
     *
     * @param ownerId
     * @return
     */
    boolean hasAccountOf(Long ownerId);
}
