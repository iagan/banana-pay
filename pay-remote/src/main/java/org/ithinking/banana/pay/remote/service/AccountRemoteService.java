package org.ithinking.banana.pay.remote.service;

import org.ithinking.banana.pay.remote.vo.AccountVo;

/**
 * 账号服务
 *
 * @author agan
 * @date 2016-05-07
 */
public interface AccountRemoteService {

    AccountVo getAccount(Long accountNO);
}
