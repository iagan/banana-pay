package org.ithinking.banana.pay.service;

import org.ithinking.banana.pay.model.entity.AccountFlow;

/**
 * 账号流水明细
 *
 * @author agan
 * @date 2016-05-09
 */
public interface AccountFlowService {

    /**
     * 新增账单流水
     *
     * @param accountFlow
     */
    void addAccountFlow(AccountFlow accountFlow);


    /**
     * 根据账单流水ID获取账单流水信息
     *
     * @param flowId
     * @return
     */
    AccountFlow getAccountFlowById(Long flowId);

}
