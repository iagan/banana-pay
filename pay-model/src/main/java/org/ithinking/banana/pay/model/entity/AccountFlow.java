package org.ithinking.banana.pay.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 账号流水
 *
 * @author agan
 * @date 2016-05-07
 */
@Entity
@Table(name = "pay_account_flow")
public class AccountFlow {
    // 流水Id
    private Long flowId;
    // 账号ID
    private Long accountId;
    // 转入/转出来源账号
    private String fromAccountId;
    // 转入/转出金额(交易金额)
    private Long amount;
    // 转入/转后账号余额(以分为单位)
    private Long balance;
    // 备注
    private String remark;
    // 记录创建时间
    private Date createTime;

    @Id
    @Column(name = "flow_id", nullable = false)
    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    @Column(name = "flow_id", nullable = false)
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Column(name = "from_account_id", nullable = false)
    public String getFromAccountId() {
        return fromAccountId;
    }

    public void setFromAccountId(String fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

    @Column(name = "amount", nullable = false)
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Column(name = "flow_id", nullable = false)
    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "create_time", nullable = false)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
