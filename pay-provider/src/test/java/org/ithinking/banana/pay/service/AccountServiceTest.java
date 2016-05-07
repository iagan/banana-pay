package org.ithinking.banana.pay.service;

import org.ithinking.banana.pay.Application;
import org.ithinking.banana.pay.model.entity.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    @Test
    public void testCreateAccount(){
        Long ownerId = 1111111L;
        boolean has = accountService.hasAccountOf(ownerId);
        if(!has){
            Account account = accountService.createAccount(ownerId);
            Assert.assertNotNull(account);
        }
    }
}
