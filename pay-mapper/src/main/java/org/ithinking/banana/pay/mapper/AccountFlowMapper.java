package org.ithinking.banana.pay.mapper;

import org.ithinking.banana.pay.model.entity.AccountFlow;

/**
 * 账号变更流水
 *
 * @author agan
 * @date 2016-05-09
 */
public interface AccountFlowMapper {

    /**
     * 新增账号流水
     *
     * @param accountFlow
     */
    void addAccountFlow(AccountFlow accountFlow);

    /**
     * 获取账号流水
     *
     * @param flowId
     * @return
     */
    AccountFlow getAccountFlowById(Long flowId);
}
