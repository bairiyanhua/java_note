drop table if exists demo01 ;
create table if not exists demo01(
	id  int(10) not null auto_increment,
	name varchar(32) not null,
	primary key(id)
);
/*修改表名*/
alter table  demo01 rename as  demo02;

/*修改字段*/
alter table demo02   change name username varchar(32) not null;

/*添加字段*/
alter table demo02 add password varchar(32) not null; 

/*删除字段*/
alter table demo02 drop password;