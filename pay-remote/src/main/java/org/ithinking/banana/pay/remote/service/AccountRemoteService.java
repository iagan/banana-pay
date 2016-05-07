package org.ithinking.banana.pay.remote.service;

import org.ithinking.banana.pay.remote.vo.AccountVo;

import java.util.List;

/**
 * 账号服务
 *
 * @author agan
 * @date 2016-05-07
 */
public interface AccountRemoteService {

    /**
     * 创建账号
     *
     * @param ownerId
     * @return
     */
    AccountVo createAccount(Long ownerId);

    /**
     * 根据账号获取账号信息
     *
     * @param accountNO
     * @return
     */
    AccountVo getAccount(Long accountNO);


    /**
     * 获取某人的账号信息列表
     *
     * @param ownerId
     * @return
     */
    List<AccountVo> getAccountByOwnerId(Long ownerId);
}
