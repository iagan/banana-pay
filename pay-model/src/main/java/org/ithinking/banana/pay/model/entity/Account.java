package org.ithinking.banana.pay.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 账号实体类
 *
 * @author agan
 * @date 2016-05-07
 */
@Entity
@Table(name = "pay_account")
public class Account {
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

    @Id
    @Column(name = "account_id", nullable = false)
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Column(name = "owner_id", nullable = false)
    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Column(name = "balance", nullable = false)
    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    @Column(name = "blocked", nullable = false)
    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    @Column(name = "create_time", nullable = false)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "last_update_time", nullable = false)
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Column(name = "version", nullable = false)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
