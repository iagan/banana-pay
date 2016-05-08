package org.ithinking.banana.pay.service;

import org.ithinking.banana.comm.IdWorker;
import org.ithinking.banana.pay.Application;
import org.ithinking.banana.pay.model.entity.AccountFlow;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;

/**
 * ${TITLE}
 *
 * @author agan
 * @date 2016-05-09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class AccountFlowServiceTest {

    @Resource
    private AccountFlowService accountFlowService;
    @Resource
    private IdWorker idWorker;

    private Long flowId = 1111111L;
    private Long ownerId = 1111111L;
    private Long accountId = 1111111L;
    private String fromAccountId = "222222";

    @Test
    public void testGetAccountFlowById() {
        AccountFlow accountFlow = accountFlowService.getAccountFlowById(flowId);
        System.out.println(accountFlow);
    }

    @Test
    public void testAddAccountFlow() {

        boolean exists = accountFlowService.existsAccountFlow(flowId);
        if (!exists) {
            AccountFlow accountFlow = new AccountFlow();
            //
            accountFlow.setFlowId(flowId);
            accountFlow.setAccountId(accountId);
            accountFlow.setAmount(new Random().nextLong());
            accountFlow.setBalance(new Random().nextLong());
            accountFlow.setFromAccountId(fromAccountId);
            accountFlow.setRemark("测试");
            accountFlow.setCreateTime(new Date());

            accountFlowService.addAccountFlow(accountFlow);
        }
        System.out.println("addAccountFlow OK!");
    }
}
