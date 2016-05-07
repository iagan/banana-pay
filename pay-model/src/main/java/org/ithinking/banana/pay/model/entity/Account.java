package org.ithinking.banana.pay.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 账号实体类
 *
 * @author agan
 * @date 2016-05-07
 */
@Entity
@Table(name = "pay_account")
public class Account {
    private Long accountId;
    private Long ownerId;
    private Long ammount;

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

    @Column(name = "ammount", nullable = false)
    public Long getAmmount() {
        return ammount;
    }

    public void setAmmount(Long ammount) {
        this.ammount = ammount;
    }
}
