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
    int updateAccount(Account account);

    /**
     * 更新账号余额
     *
     * @param account
     * @return
     */
    int updateBalance(Account account);

    /**
     * 获取开户人所有账号
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
    int existsAccount(Long accountId);

    /**
     * 判断用户是否有账号
     *
     * @param ownerId
     * @return
     */
    int hasAccountOf(Long ownerId);

}
