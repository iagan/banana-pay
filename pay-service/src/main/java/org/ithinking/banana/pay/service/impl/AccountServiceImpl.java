package org.ithinking.banana.pay.service.impl;

import org.ithinking.banana.pay.model.entity.Account;
import org.ithinking.banana.pay.service.AccountService;

/**
 * ${TITLE}
 *
 * @author agan
 * @date 2016-05-07
 */
public class AccountServiceImpl implements AccountService{

    @Override
    public Account getAccount(Long accountNo) {
        Account account = new Account();
        return account;
    }
}
