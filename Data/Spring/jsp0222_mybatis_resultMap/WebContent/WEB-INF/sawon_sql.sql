create table dept(
deptno number(3),
dname varchar2(20) constraint dept_dname_nn not null,
loc varchar2(20),
constraint dept_deptno_pk primary key(deptno),
constraint dept_dname_uq unique(dname));

create sequence dept_seq
increment by 10
start with 10;
-- 부서 데이터는 입력폼에서 등록합시다.
--- SawonTable 만들기
create table sawon(
sabun number(3),
saname varchar2(12),
deptno number(3),
sajob varchar2(10),
sapay number(10),
sahire date default sysdate,
gender varchar2(6),
samgr number(3),
constraint sawon_sabun_pk primary key(sabun),
constraint sawon_deptno_fk foreign key(deptno)
references dept(deptno) on delete cascade,
constraint sawon_gender_ck check(gender='남자' or gender='여자'),
constraint sawon_samgr_fk foreign key(samgr)
references sawon(sabun));

create sequence sawon_seq
increment by 1 
start with 1;

-- sawonData 
Insert Into sawon Values(1,'김길동',10,'회장',5000,'1980/01/01','남자',null);
Insert Into sawon Values(2,'한국남',20,'부장',3000,'1988/11/01', '남자',1);
Insert Into sawon Values(3,'이순신',20,'과장',3500,'1985/03/01','남자', 2);
Insert Into sawon Values(5,'이순라',20,'사원',1200,'1990/05/01','여자', 3);
Insert Into sawon Values(7,'놀기만',20,'과장',2300,'1996/06/01','여자', 2);
Insert Into sawon Values(11,'류별나',20,'과장',1600,'1989/12/01','여자', 2);
Insert Into sawon Values(14,'채시라',20,'사원',3400,'1993/10/01','여자', 3);
Insert Into sawon Values(17,'이성계',30,'부장',2803,'1984/05/01','남자', 1);
Insert Into sawon Values(13,'무궁화',10,'부장',3000,'1996/11/01','여자', 1);
Insert Into sawon Values(19,'임꺽정',20,'사원',2200,'1988/04/01','남자', 7);
Insert Into sawon Values(20,'깨똥이',10,'과장',4500,'1990/05/01','남자', 13);
Insert Into sawon Values(6,'공부만',30,'과장',4003,'1995/05/01','남자', 17);
Insert Into sawon Values(8,'채송화',30,'대리',1703,'1992/06/01','여자', 17);
Insert Into sawon Values(12,'류명한',10,'대리',1800,'1990/10/01','남자', 20);
Insert Into sawon Values(9,'무궁화',10,'사원',1100,'1984/08/01','여자', 12);
Insert Into sawon Values(4,'이미라',30,'대리',2503,'1983/04/01','여자', 17);
Insert Into sawon Values(10,'공부해',30,'사원',1303,'1988/11/01','남자', 4);
Insert Into sawon Values(15,'구하라',10,'사원',2000,'1991/04/01','여자', 12);
Insert Into sawon Values(16,'김유신',30,'사원',400,'1981/04/01','남자', 4);
Insert Into sawon Values(18,'강감찬',30,'사원',1003,'1986/07/01','남자', 4);
Insert Into sawon Values(21,'김민희',50,'부장',4500,'2000/05/01','여자', 1);
Insert Into sawon Values(22,'홍실이',50,'과장',3500,'2001/11/01','여자', 21);
Insert Into sawon Values(23,'개발이',50,'대리',2500,'2002/08/01','남자', 22);
Insert Into sawon Values(24,'감수정',50,'사원',2000,'2010/05/11','남자', 23);
commit;

create table sawon_phone(
pnum number(3) constraint sawon_phone_pnum_pk primary key,
pmodel varchar2(30),
phnum varchar2(30),
p_date date,
constraint sawon_phone_pnum_fk foreign key(pnum)
references sawon(sabun)
);


Insert Into sawon_phone Values(1,'삼성Note9','010-3532-1217','2016/01/01');
Insert Into sawon_phone Values(2,'엘지G5','010-1233-1227','2016/02/01');
Insert Into sawon_phone Values(17,'엘지G5','010-1233-1227','2016/02/01');
Insert Into sawon_phone Values(13,'엘지G5','010-1213-1227','2016/02/01');
Insert Into sawon_phone Values(22,'엘지G5','010-1222-1227','2016/02/01');
Insert Into sawon_phone Values(3,'구글넥서스','010-1233-5627','2016/02/01');
Insert Into sawon_phone Values(5,'구글넥서스','010-8753-4327','2016/02/01');
Insert Into sawon_phone Values(7,'구글넥서스','010-9898-3535','2016/02/01');
Insert Into sawon_phone Values(11,'구글넥서스','010-6763-3535','2016/02/01');
Insert Into sawon_phone Values(20,'구글넥서스','010-5412-1299','2016/02/01');
Insert Into sawon_phone Values(6,'구글넥서스','010-9991-3422','2016/02/01');
commit;


