package org.ithinking.banana.pay.service;

import org.ithinking.banana.pay.Application;
import org.ithinking.banana.pay.model.entity.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * ${TITLE}
 *
 * @author agan
 * @date 2016-05-07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    private Long ownerId = 1111111L;

    @Test
    public void testCreateAccount() {
        boolean has = accountService.hasAccountOf(ownerId);
        if (!has) {
            Account account = accountService.createAccount(ownerId);
            Assert.assertNotNull(account);
        }
    }

    @Test
    public void testUpdateAccount() {
        List<Account> accountList = accountService.getAccountByOwnerId(ownerId);
        Account account;
        for (int i = 0, size = accountList == null ? 0 : accountList.size(); i < size; i++) {
            account = accountList.get(i);
            account.setBalance((long) new Random().nextInt(1000));
            account.setLastUpdateTime(new Date());
            boolean ok = accountService.updateAccount(account);
            Assert.assertEquals(true, ok);
        }
    }

    @Test
    public void testUpdateBalance() {
        List<Account> accountList = accountService.getAccountByOwnerId(ownerId);
        Account account;
        for (int i = 0, size = accountList == null ? 0 : accountList.size(); i < size; i++) {
            account = accountList.get(i);
            account.setBalance((long) new Random().nextInt(1000));
            account.setLastUpdateTime(new Date());
            boolean ok = accountService.updateBalance(account);
            Assert.assertEquals(true, ok);
        }
    }
}
