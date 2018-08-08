CREATE DATABASE ssm
  DEFAULT CHARACTER SET utf8;
USE ssm;

CREATE TABLE t_user (
  user_id  BIGINT AUTO_INCREMENT,
  username VARCHAR(32) COMMENT '用户名',
  userpass VARCHAR(32) COMMENT '用户密码',
  PRIMARY KEY (user_id)
);