

create table sawon_phone(

pnum number(3) constraint sawon_phone_pnum_pk primary key,
pmodel varchar2(30),
phnum varchar2(30),
p_date date,
constraint sawon_phone_pnum_fk foreign key (pnum)
references sawon(sabun)
);


Insert Into sawon_phone Values(1,'»ï¼ºNote9','010-3532-1217','2016/01/01');
Insert Into sawon_phone Values(2,'¿¤ÁöG5','010-1233-1227','2016/02/01');
Insert Into sawon_phone Values(17,'¿¤ÁöG5','010-1233-1227','2016/02/01');
Insert Into sawon_phone Values(13,'¿¤ÁöG5','010-1213-1227','2016/02/01');
Insert Into sawon_phone Values(22,'¿¤ÁöG5','010-1222-1227','2016/02/01');
Insert Into sawon_phone Values(3,'±¸±Û³Ø¼­½º','010-1233-5627','2016/02/01');
Insert Into sawon_phone Values(5,'±¸±Û³Ø¼­½º','010-8753-4327','2016/02/01');
Insert Into sawon_phone Values(7,'±¸±Û³Ø¼­½º','010-9898-3535','2016/02/01');
Insert Into sawon_phone Values(11,'±¸±Û³Ø¼­½º','010-6763-3535','2016/02/01');
Insert Into sawon_phone Values(20,'±¸±Û³Ø¼­½º','010-5412-1299','2016/02/01');
Insert Into sawon_phone Values(6,'±¸±Û³Ø¼­½º','010-9991-3422','2016/02/01');
commit;