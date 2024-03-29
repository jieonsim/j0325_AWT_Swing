/* ------------------ */

create table imageInfor (
  idx  int not null auto_increment primary key,
  name varchar(20) not null,
  img  varchar(50) not null
);

desc imageInfor;

insert into imageInfor values (default,'사과','11.jpg');
insert into imageInfor values (default,'배','12.jpg');
insert into imageInfor values (default,'바나나','13.jpg');
insert into imageInfor values (default,'딸기','14.jpg');
insert into imageInfor values (default,'수박','15.jpg');
insert into imageInfor values (default,'참외','16.jpg');

select * from imageInfor;