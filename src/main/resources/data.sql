drop table user;
create table user (
       id integer not null,
        available_balance float,
        last_login_date_time timestamp,
        username varchar(255),
        primary key (id)
    );
insert into user(id,username,available_balance,last_login_date_time) values(123,'bankingUser',10000,sysdate);