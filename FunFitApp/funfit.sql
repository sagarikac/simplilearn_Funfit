create database funfit;
use funfit;

create table batch
(bid int primary key auto_increment, typeofbatch enum('morning','evening'), time varchar(30));
desc batch;
insert into batch(typeofbatch, time)
values('evening', '9pm');

create table participant
(pid int primary key auto_increment, pname varchar(30), age int, bid int, foreign key(bid) references batch(bid) on delete cascade); 
desc participant;
insert into participant(pname, age, bid)
values('rahul',23,4);