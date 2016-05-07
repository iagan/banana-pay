package org.ithinking.banana.pay.service.remote.impl;

import org.ithinking.banana.comm.BeanMapper;
import org.ithinking.banana.pay.Constant;
import org.ithinking.banana.pay.model.entity.Account;
import org.ithinking.banana.pay.service.remote.AccountRemoteService;
import org.ithinking.banana.pay.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账号-远程服务实现
 *
 * @author agan
 * @date 2016-05-07
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = AccountRemoteService.class, registry = Constant.DUBBO_REGISTRY)
public class AccountRemoteServiceImpl implements AccountRemoteService {

    @Autowired
    private AccountService accountService;

    @Override
    public AccountVo createAccount(Long ownerId) {
        Account account = accountService.createAccount(ownerId);
        AccountVo accountVo = null;
        if (accountVo != null) {
            accountVo = BeanMapper.copyTo(account, AccountVo.class);
        }
        return accountVo;
    }

    @Override
    public AccountVo getAccount(Long accountId) {
        Account account = accountService.getAccount(accountId);
        AccountVo accountVo = null;
        if (accountVo != null) {
            accountVo = BeanMapper.copyTo(account, AccountVo.class);
        }
        return accountVo;
    }

    @Override
    public List<AccountVo> getAccountByOwnerId(Long ownerId) {
        List<Account> accountList = accountService.getAccountByOwnerId(ownerId);
        List<AccountVo> resultList = null;
        if (accountList != null && !accountList.isEmpty()) {
            resultList = BeanMapper.copyListTo(accountList, AccountVo.class);
        }
        return resultList;
    }
}
