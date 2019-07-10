#查看数据库的定义
SHOW CREATE DATABASE school;
#查看数据表的定义
SHOW CREATE TABLE student;
#显示表结构
DESC student;

/*
设置数据库、表、字段的字符集
CREATE DATABASE `school` /*!40100 DEFAULT CHARACTER SET utf8 

CREATE TABLE `student` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '主键，学号',
  `pwd` VARCHAR(20) NOT NULL DEFAULT '123456' COMMENT '密码',
  `name` VARCHAR(30) NOT NULL DEFAULT '匿名' COMMENT '学生姓名',
  `sex` VARCHAR(2) NOT NULL DEFAULT '男',
  `birthday` DATETIME DEFAULT NULL,
  `address` VARCHAR(100) DEFAULT NULL,
  `email` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8

create table a(
	address char(5) character set gbk
)
*/


#创建一个测试表
CREATE TABLE test(
	col1 INT(4) ZEROFILL NOT NULL
)
#设置严格检查模式
SET sql_mode='strict_trans_tables';

CREATE TABLE tab1(
	id INT(4) PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(20) NOT NULL 
)

#自增列：默认初始值1   步长1
#能否改变自增列的初始值？ 100
#只影响当前表
CREATE TABLE tab1(
	id INT(4) PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(20) NOT NULL 
)AUTO_INCREMENT=100;
#能否改变自增列的步长？   5
#影响所有使用自增列的表
SET @@auto_increment_increment=5;

#同一个列可以被多个属性修饰，但是注意属性的顺序
CREATE TABLE tab2(
	id INT(4) ZEROFILL NOT NULL 
)ENGINE=INNODB

#查看mysql所支持的引擎类型（表类型）
SHOW ENGINES;
#查看默认引擎
SHOW VARIABLES LIKE 'storage_engine'; 



CREATE TABLE tab3(
	id INT(4) ZEROFILL NOT NULL 
)ENGINE=MYISAM

#重命名表
ALTER TABLE tab1 RENAME AS table1;
#为表添加列
ALTER TABLE table1 ADD address VARCHAR(100) DEFAULT '中国北京';
#修改表
ALTER TABLE table1 MODIFY address VARCHAR(500) DEFAULT '中国北京朝阳区';

ALTER TABLE table1 CHANGE address 地址 VARCHAR(100) DEFAULT '中国北京朝阳区';

#删除字段
ALTER TABLE tab4 DROP `name`;

CREATE TABLE tab4(
	id INT(4) ZEROFILL NOT NULL ,
	NAME VARCHAR(50)
)ENGINE=MYISAM

#删除表
DROP TABLE IF EXISTS tab4;



