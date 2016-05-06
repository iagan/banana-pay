package org.ithinking.banana.pay.service.remote.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.ithinking.banana.pay.remote.service.AccountRemoteService;
import org.ithinking.banana.pay.remote.vo.AccountVo;

/**
 * ${TITLE}
 *
 * @author agan
 * @date 2016-05-07
 */
@Service(registry = "pay", interfaceClass = AccountRemoteService.class)
public class AccountRemoteServiceImpl implements AccountRemoteService {

    @Override
    public AccountVo getAccount(Long accountNO) {
        AccountVo accountVo = new AccountVo();
        return accountVo;
    }
}
