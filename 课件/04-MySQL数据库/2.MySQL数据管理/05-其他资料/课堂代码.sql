#创建外键方式一：创建子表的同时创建外键
#年级表(id\年级名称)
CREATE TABLE IF NOT EXISTS grade(
	gradeid INT(10) PRIMARY KEY AUTO_INCREMENT,
	gradename VARCHAR(50) NOT NULL
);

#学生信息表(学号、姓名、性别、年级、手机号、地址、出生日期、邮箱、身份证号)
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


#创建外键方式二：创建子表完毕后，修改子表添加外键
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
#删除具有主外键关系的表时，要先删子表，后删主表

#删除外键
ALTER TABLE student DROP FOREIGN KEY FK_gradeid;
ALTER TABLE student DROP INDEX FK_gradeid;

#使用语句如何增加数据
INSERT INTO grade(gradename) VALUES('大一');
INSERT INTO grade VALUES(2,'大二');
INSERT INTO grade(gradename) VALUES('大三'),('大四');

#NOW()代表当前时间
INSERT INTO student(studentno,studentname,sex,gradeid,phone,address,borndate,email,identityCard) 
VALUES(1003,'张三',2,1,'18711765400',NULL,NOW(),NULL,'370123198803040007'),
(1004,'王五',DEFAULT,2,'1361178888','苏州',NOW(),'wangwu@163.com','370123199003040111');

#使用语句修改数据
#将李四的地址修改为中国南京
UPDATE student SET address='中国南京'
WHERE studentno=1001
#同时修改多列
UPDATE student SET address='中国南京',email='lisi@163.com'
WHERE studentno=1001;
#条件可以使用运算符
UPDATE student SET sex=1
WHERE studentno=1001 OR studentno=1002 OR studentno=1003;

UPDATE student SET sex=2
WHERE studentno>=1001 AND studentno<=1003;

UPDATE student SET sex=1
WHERE studentno BETWEEN 1001 AND 1003;
#使用函数
UPDATE student SET studentname=CONCAT("姓名：",studentname);

#删除数据
DELETE FROM grade WHERE gradeid=4












