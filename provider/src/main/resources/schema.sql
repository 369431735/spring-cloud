drop table  if EXISTS user;
create table user (id bigint NOT NULL AUTO_INCREMENT ,username VARCHAR (40),name VARCHAR (20),age int(3),balance DECIMAL(10,2),PRIMARY key(id));

