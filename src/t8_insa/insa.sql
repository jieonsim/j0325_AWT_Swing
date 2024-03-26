show tables;

create table insa2 (
	idx int not null auto_increment primary key, /*고유번호*/
	name varchar(20) not null, /*이름*/
	age int default 20,	/*나이*/
	gender char(2) default '여자', /*성별*/
	ipsail datetime default now() /*입사일*/
);
desc insa2;
drop table insa2;

insert into insa2 values (default, '김말숙', default, '남자', default);
insert into insa2 values (default, '김말숙', default, default, default);
-- 디폴트가 많을 때는 아래와 같이 하는 게 편하다
insert into insa2 (name) values ('오하늘');

select * from insa2;