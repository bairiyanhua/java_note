drop table if exists demo02 ;
create table if not exists demo02(
	id  int(10) not null auto_increment,
	name varchar(32) not null,
	primary key(id)
)ENGINE=MyISAM;
 
 #或
drop table if exists demo02 ;
create table if not exists demo02(
	id  int(10) not null auto_increment,
	name varchar(32) not null,
	primary key(id)
)ENGINE=InnoDB;