#创建一个test01表格

CREATE TABLE IF NOT EXISTS `test01`(id int(11) not null);

#删除表

DROP TABLE  `test01`;

# 如果表名不存在会报错
# ERROR 1051 (42S02): Unknown table 'test011'

#最好加上 IF 判断
DROP TABLE IF EXISTS `test01`;