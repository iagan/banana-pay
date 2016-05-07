package org.ithinking.banana.pay.service.remote.dto;

import java.util.Date;

/**
 * ${TITLE}
 *
 * @author agan
 * @date 2016-05-07
 */
public class AccountDTO {
    // 账号ID
    private Long accountId;
    // 开户人ID
    private Long ownerId;
    // 账号余额(以分为单位)
    private Long balance;
    // 账号冻结标志
    private Boolean blocked;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date lastUpdateTime;
    // 记录版本号
    private Integer version;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
