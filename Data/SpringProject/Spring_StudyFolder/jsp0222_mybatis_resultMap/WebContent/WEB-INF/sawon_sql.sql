create table dept(
deptno number(3),
dname varchar2(20) constraint dept_dname_nn not null,
loc varchar2(20),
constraint dept_deptno_pk primary key(deptno),
constraint dept_dname_uq unique(dname));

create sequence dept_seq
increment by 10
start with 10;
-- �μ� �����ʹ� �Է������� ����սô�.
--- SawonTable �����
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
constraint sawon_gender_ck check(gender='����' or gender='����'),
constraint sawon_samgr_fk foreign key(samgr)
references sawon(sabun));

create sequence sawon_seq
increment by 1 
start with 1;

-- sawonData 
Insert Into sawon Values(1,'��浿',10,'ȸ��',5000,'1980/01/01','����',null);
Insert Into sawon Values(2,'�ѱ���',20,'����',3000,'1988/11/01', '����',1);
Insert Into sawon Values(3,'�̼���',20,'����',3500,'1985/03/01','����', 2);
Insert Into sawon Values(5,'�̼���',20,'���',1200,'1990/05/01','����', 3);
Insert Into sawon Values(7,'��⸸',20,'����',2300,'1996/06/01','����', 2);
Insert Into sawon Values(11,'������',20,'����',1600,'1989/12/01','����', 2);
Insert Into sawon Values(14,'ä�ö�',20,'���',3400,'1993/10/01','����', 3);
Insert Into sawon Values(17,'�̼���',30,'����',2803,'1984/05/01','����', 1);
Insert Into sawon Values(13,'����ȭ',10,'����',3000,'1996/11/01','����', 1);
Insert Into sawon Values(19,'�Ӳ���',20,'���',2200,'1988/04/01','����', 7);
Insert Into sawon Values(20,'������',10,'����',4500,'1990/05/01','����', 13);
Insert Into sawon Values(6,'���θ�',30,'����',4003,'1995/05/01','����', 17);
Insert Into sawon Values(8,'ä��ȭ',30,'�븮',1703,'1992/06/01','����', 17);
Insert Into sawon Values(12,'������',10,'�븮',1800,'1990/10/01','����', 20);
Insert Into sawon Values(9,'����ȭ',10,'���',1100,'1984/08/01','����', 12);
Insert Into sawon Values(4,'�̶̹�',30,'�븮',2503,'1983/04/01','����', 17);
Insert Into sawon Values(10,'������',30,'���',1303,'1988/11/01','����', 4);
Insert Into sawon Values(15,'���϶�',10,'���',2000,'1991/04/01','����', 12);
Insert Into sawon Values(16,'������',30,'���',400,'1981/04/01','����', 4);
Insert Into sawon Values(18,'������',30,'���',1003,'1986/07/01','����', 4);
Insert Into sawon Values(21,'�����',50,'����',4500,'2000/05/01','����', 1);
Insert Into sawon Values(22,'ȫ����',50,'����',3500,'2001/11/01','����', 21);
Insert Into sawon Values(23,'������',50,'�븮',2500,'2002/08/01','����', 22);
Insert Into sawon Values(24,'������',50,'���',2000,'2010/05/11','����', 23);
commit;

create table sawon_phone(
pnum number(3) constraint sawon_phone_pnum_pk primary key,
pmodel varchar2(30),
phnum varchar2(30),
p_date date,
constraint sawon_phone_pnum_fk foreign key(pnum)
references sawon(sabun)
);


Insert Into sawon_phone Values(1,'�ＺNote9','010-3532-1217','2016/01/01');
Insert Into sawon_phone Values(2,'����G5','010-1233-1227','2016/02/01');
Insert Into sawon_phone Values(17,'����G5','010-1233-1227','2016/02/01');
Insert Into sawon_phone Values(13,'����G5','010-1213-1227','2016/02/01');
Insert Into sawon_phone Values(22,'����G5','010-1222-1227','2016/02/01');
Insert Into sawon_phone Values(3,'���۳ؼ���','010-1233-5627','2016/02/01');
Insert Into sawon_phone Values(5,'���۳ؼ���','010-8753-4327','2016/02/01');
Insert Into sawon_phone Values(7,'���۳ؼ���','010-9898-3535','2016/02/01');
Insert Into sawon_phone Values(11,'���۳ؼ���','010-6763-3535','2016/02/01');
Insert Into sawon_phone Values(20,'���۳ؼ���','010-5412-1299','2016/02/01');
Insert Into sawon_phone Values(6,'���۳ؼ���','010-9991-3422','2016/02/01');
commit;


