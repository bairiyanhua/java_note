#创建一个demo_delete表
DROP TABLE IF EXISTS demo_delete;
CREATE TABLE IF NOT EXISTS  demo_delete(
	id  INT(10) NOT NULL    AUTO_INCREMENT,
	title  VARCHAR(32) NOT NULL,
	PRIMARY KEY(id)
) AUTO_INCREMENT = 5 ;

INSERT INTO demo_delete (title) VALUES ("aaaaa"),("bbbbb"),("cccccc"),("ddddd");

#TRUNCATE清除数据 
TRUNCATE  TABLE demo_delete;




# 与 用 delete 删除数据比较， AUTO_INCREMENT 的值有不同
# delete 删除的不会重置该值，从上次插入的主键ID开始累计
 delete   from  demo_delete;