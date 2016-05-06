package org.ithinking.banana.pay.service.remote.impl;

import org.ithinking.banana.pay.Constant;
import org.ithinking.banana.pay.remote.service.AccountRemoteService;
import org.ithinking.banana.pay.remote.vo.AccountVo;
import org.springframework.stereotype.Service;

/**
 * 账号-远程服务实现
 *
 * @author agan
 * @date 2016-05-07
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(registry = Constant.DUBBO_REGISTRY, interfaceClass = AccountRemoteService.class)
public class AccountRemoteServiceImpl implements AccountRemoteService {

    @Override
    public AccountVo getAccount(Long accountNO) {
        AccountVo accountVo = new AccountVo();
        return accountVo;
    }
}
