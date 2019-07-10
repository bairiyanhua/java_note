#创建一个demo_delete表
DROP TABLE IF EXISTS demo_delete;
CREATE TABLE IF NOT EXISTS  demo_delete(
	id  INT(10) NOT NULL    AUTO_INCREMENT,
	title  VARCHAR(32) NOT NULL,
	PRIMARY KEY(id)
);

INSERT INTO demo_delete (title) VALUES ("aaaaa"),("bbbbb"),("cccccc"),("ddddd");

#带where条件的删除数据

DELETE  FROM demo_delete  WHERE  title  = "aaaa";


#不加where条件的删除数据

DELETE  FROM demo_delete;