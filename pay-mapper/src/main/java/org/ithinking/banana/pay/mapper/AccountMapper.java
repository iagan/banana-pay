package org.ithinking.banana.pay.mapper;

import org.ithinking.banana.pay.model.entity.Account;

import java.util.List;

/**
 * ${TITLE}
 *
 * @author agan
 * @date 2016-05-07
 */
public interface AccountMapper {
    /**
     * 根据账号获取账号信息
     * @param accountId
     * @return
     */
    Account getAccountById(Long accountId);

    /**
     * 新增账号信息
     * @param account
     * @return
     */
    int addAcount(Account account);

    /**
     * 保存账号信息
     *
     * @param account
     * @return
     */
    int saveAccount(Account account);

    /**
     * 获取开户人所有账号
     *
     * @param ownerId
     * @return
     */
    List<Account> getAccountByOwnerId(Long ownerId);

}
