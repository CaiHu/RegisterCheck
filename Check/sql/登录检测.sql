create table user1 (
      id number(4) primary key,
      name varchar2(20) not null,
      pwd varchar2(20) not null
);

create sequence user1id_id start with 1;

insert into user1 values(userid_id.nextval,'a','1');
insert into user1 values(userid_id.nextval,'ab','1');


select * from user1;

select name from user1 where name='a' and pwd='1';

commit;
