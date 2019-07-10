#外键：创建表时添加外键约束
#年级表：年级编号、年级名称
CREATE TABLE grade(
	gradeid INT(10) PRIMARY KEY AUTO_INCREMENT,
	gradename VARCHAR(50) NOT NULL
);

#学生表：学号、姓名、性别、年级、手机号、地址、出生日期、邮箱、身份证
CREATE TABLE student(
	studentno INT(4) PRIMARY KEY,
	studentname VARCHAR(20) NOT NULL DEFAULT '匿名',
	sex TINYINT(1) DEFAULT 1,
	gradeid INT(10),
	phone VARCHAR(50) NOT NULL,
	address VARCHAR(255),
	borndate DATETIME,
	email VARCHAR(50),
	identityCard VARCHAR(18) NOT NULL,
	CONSTRAINT FK_gradeid FOREIGN KEY(gradeid) REFERENCES grade(gradeid) 	
);
#删除表时，先删除子表，再删除主表

#外键：创建表后，添加外键约束
CREATE TABLE grade(
	gradeid INT(10) PRIMARY KEY AUTO_INCREMENT,
	gradename VARCHAR(50) NOT NULL
);

#学生表：学号、姓名、性别、年级、手机号、地址、出生日期、邮箱、身份证
CREATE TABLE student(
	studentno INT(4) PRIMARY KEY,
	studentname VARCHAR(20) NOT NULL DEFAULT '匿名',
	sex TINYINT(1) DEFAULT 1,
	gradeid INT(10),
	phone VARCHAR(50) NOT NULL,
	address VARCHAR(255),
	borndate DATETIME,
	email VARCHAR(50),
	identityCard VARCHAR(18) NOT NULL	
);

ALTER TABLE student
ADD CONSTRAINT FK_gradeid FOREIGN KEY(gradeid) REFERENCES grade(gradeid);

#删除外键(补充)
ALTER TABLE student DROP FOREIGN KEY FK_gradeid;
ALTER TABLE student DROP INDEX FK_gradeid;

SHOW CREATE TABLE student;

INSERT INTO grade
VALUES(1,'大一')
INSERT INTO student
VALUES(1,'zhangsan',1,1,'131099304','北京',NOW(),'zs@163.com','370111190008074311')




