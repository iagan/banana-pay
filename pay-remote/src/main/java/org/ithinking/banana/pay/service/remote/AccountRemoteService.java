package org.ithinking.banana.pay.service.remote;

import org.ithinking.banana.pay.service.remote.dto.AccountDTO;

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
    AccountDTO createAccount(Long ownerId);

    /**
     * 根据账号获取账号信息
     *
     * @param accountNO
     * @return
     */
    AccountDTO getAccount(Long accountNO);


    /**
     * 获取某人的账号信息列表
     *
     * @param ownerId
     * @return
     */
    List<AccountDTO> getAccountByOwnerId(Long ownerId);
}
