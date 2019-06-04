create database afei;
CREATE TABLE afei.tb_order_taobao (
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id int(11) NOT NULL COMMENT '姓名',
  order_no varchar(32) NOT NULL COMMENT '订单号',
  order_time datetime NOT NULL COMMENT '订单时间',
  merchant varchar(16) NOT NULL COMMENT '商户名称',
  UNIQUE KEY uk_order_no (order_no)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE afei.tb_order_tmall (
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id int(11) NOT NULL COMMENT '姓名',
  order_no varchar(32) NOT NULL COMMENT '订单号',
  order_time datetime NOT NULL COMMENT '订单时间',
  merchant varchar(16) NOT NULL COMMENT '商户名称',
  UNIQUE KEY uk_order_no (order_no)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE afei.tb_order_aliyun (
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id int(11) NOT NULL COMMENT '姓名',
  order_no varchar(32) NOT NULL COMMENT '订单号',
  order_time datetime NOT NULL COMMENT '订单时间',
  merchant varchar(16) NOT NULL COMMENT '商户名称',
  UNIQUE KEY uk_order_no (order_no)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE afei.tb_config (
  id bigint(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `key` varchar(32) NOT NULL ,
  `value` varchar(32) NOT NULL ,
  UNIQUE KEY uk_key (`key`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

insert into tb_config(id, `key`,`value`)values(1, 'blog', '公众号：阿飞的博客');

create database pay_taobao;
CREATE TABLE pay_taobao.tb_order (
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id int(11) NOT NULL COMMENT '姓名',
  order_no varchar(32) NOT NULL COMMENT '订单号',
  order_time datetime NOT NULL COMMENT '订单时间',
  merchant varchar(16) NOT NULL COMMENT '商户名称',
  UNIQUE KEY uk_order_no (order_no)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

create database pay_tmall;
CREATE TABLE pay_tmall.tb_order (
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id int(11) NOT NULL COMMENT '姓名',
  order_no varchar(32) NOT NULL COMMENT '订单号',
  order_time datetime NOT NULL COMMENT '订单时间',
  merchant varchar(16) NOT NULL COMMENT '商户名称',
  UNIQUE KEY uk_order_no (order_no)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

create database pay_aliyun;
CREATE TABLE pay_aliyun.tb_order (
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id int(11) NOT NULL COMMENT '姓名',
  order_no varchar(32) NOT NULL COMMENT '订单号',
  order_time datetime NOT NULL COMMENT '订单时间',
  merchant varchar(16) NOT NULL COMMENT '商户名称',
  UNIQUE KEY uk_order_no (order_no)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;