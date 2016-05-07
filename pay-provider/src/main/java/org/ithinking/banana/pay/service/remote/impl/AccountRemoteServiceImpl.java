package org.ithinking.banana.pay.service.remote.impl;

import org.ithinking.banana.comm.BeanMapper;
import org.ithinking.banana.pay.Constant;
import org.ithinking.banana.pay.model.entity.Account;
import org.ithinking.banana.pay.service.AccountService;
import org.ithinking.banana.pay.service.remote.AccountRemoteService;
import org.ithinking.banana.pay.service.remote.dto.AccountDTO;
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
    public AccountDTO createAccount(Long ownerId) {
        Account account = accountService.createAccount(ownerId);
        AccountDTO AccountDTO = null;
        if (AccountDTO != null) {
            AccountDTO = BeanMapper.copyTo(account, AccountDTO.class);
        }
        return AccountDTO;
    }

    @Override
    public AccountDTO getAccount(Long accountId) {
        Account account = accountService.getAccountById(accountId);
        AccountDTO AccountDTO = null;
        if (AccountDTO != null) {
            AccountDTO = BeanMapper.copyTo(account, AccountDTO.class);
        }
        return AccountDTO;
    }

    @Override
    public List<AccountDTO> getAccountByOwnerId(Long ownerId) {
        List<Account> accountList = accountService.getAccountByOwnerId(ownerId);
        List<AccountDTO> resultList = null;
        if (accountList != null && !accountList.isEmpty()) {
            resultList = BeanMapper.copyListTo(accountList, AccountDTO.class);
        }
        return resultList;
    }
}
