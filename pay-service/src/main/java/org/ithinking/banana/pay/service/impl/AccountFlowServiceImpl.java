package org.ithinking.banana.pay.service.impl;

import org.ithinking.banana.pay.mapper.AccountFlowMapper;
import org.ithinking.banana.pay.model.entity.AccountFlow;
import org.ithinking.banana.pay.service.AccountFlowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 账单流水明细
 *
 * @author agan
 * @date 2016-05-09
 */
@Service("accountFlowService")
public class AccountFlowServiceImpl implements AccountFlowService {

    @Resource
    private AccountFlowMapper accountFlowMapper;

    @Override
    public void addAccountFlow(AccountFlow accountFlow) {
        accountFlowMapper.addAccountFlow(accountFlow);
    }

    @Override
    public AccountFlow getAccountFlowById(Long flowId) {
        AccountFlow accountFlow = accountFlowMapper.getAccountFlowById(flowId);
        return accountFlow;
    }

    @Override
    public boolean existsAccountFlow(Long flowId) {
        int count = accountFlowMapper.existsAccountFlow(flowId);
        return count > 0;
    }
}
