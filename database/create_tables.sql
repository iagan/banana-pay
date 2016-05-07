
/**
 * 账号信息表
 */
CREATE TABLE pay_account(
  account_id       BIGINT(20) NOT NULL COMMENT '账号',
  owner_id         BIGINT(20) NOT NULL COMMENT '所属者ID',
  balance          BIGINT(20) NOT NULL DEFAULT 0 COMMENT '账号余额(单位为分)',
  blocked          CHAR(1) NOT NULL DEFAULT '0' COMMENT '是否冻结(0:否; 1:是)',
  passwd           CHAR(32) NOT NULL COMMENT '账号密码/支付密码',
  create_time      DATETIME NOT NULL COMMENT '创建时间',
  last_update_time DATETIME NOT NULL COMMENT '最后更新时间',
  version          INT(11) NOT NULL DEFAULT 1 COMMENT '数据版本号',
  PRIMARY KEY (account_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '账号信息表';