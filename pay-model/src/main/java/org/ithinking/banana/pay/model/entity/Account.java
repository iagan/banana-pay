package org.ithinking.banana.pay.model.entity;

/**
 * 账号实体类
 *
 * @author agan
 * @date 2016-05-07
 */
public class Account {
    private Long accountNO;
    private Long ownerId;
    private Long ammount;

    public Long getAccountNO() {
        return accountNO;
    }

    public void setAccountNO(Long accountNO) {
        this.accountNO = accountNO;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getAmmount() {
        return ammount;
    }

    public void setAmmount(Long ammount) {
        this.ammount = ammount;
    }
}
