package org.ithinking.banana.pay.service.impl;

import org.ithinking.banana.comm.IdWorker;
import org.ithinking.banana.comm.exception.MultiUpdateException;
import org.ithinking.banana.pay.mapper.AccountMapper;
import org.ithinking.banana.pay.model.entity.Account;
import org.ithinking.banana.pay.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * ${TITLE}
 *
 * @author agan
 * @date 2016-05-07
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Resource(type = IdWorker.class)
    private IdWorker idWorker;

    @Override
    public Account createAccount(Long ownerId) {

        Account account = new Account();

        account.setAccountId(idWorker.nextId());
        account.setOwnerId(ownerId);
        account.setVersion(1);
        account.setBalance(0L);
        account.setBlocked(false);
        account.setCreateTime(new Date());
        account.setLastUpdateTime(account.getCreateTime());
        account.setPasswd("123456");

        accountMapper.addAcount(account);
        return account;
    }

    @Override
    public Account getAccountById(Long accountId) {
        Account account = accountMapper.getAccountById(accountId);
        return account;
    }

    @Override
    public List<Account> getAccountByOwnerId(Long ownerId) {
        return accountMapper.getAccountByOwnerId(ownerId);
    }

    @Override
    public boolean existsAccount(Long accountId) {
        int n = accountMapper.existsAccount(accountId);
        return n > 0;
    }

    @Override
    public boolean hasAccountOf(Long ownerId) {
        int n = accountMapper.hasAccountOf(ownerId);
        return n > 0;
    }

    @Override
    public boolean updateAccount(Account account) {
        int count = accountMapper.updateAccount(account);
        if (count > 1) {
            throw new MultiUpdateException();
        }
        return count == 1;
    }

    @Override
    public boolean updateBalance(Account account) {
        int count = accountMapper.updateBalance(account);
        if (count > 1) {
            throw new MultiUpdateException();
        }
        return count == 1;
    }
}
