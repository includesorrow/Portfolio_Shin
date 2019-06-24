drop sequence image_info_seq;
drop table image_info;
purge recyclebin;
create table image_info(
ibun number(10) constraint image_info_ibun_pk primary key,
ilabel varchar2(30),
ifile varchar2(150) constraint image_info_ifile_nn not null,
idate date,
constraint image_info_uq unique(ifile)
);
create sequence image_info_seq start with 1 increment by 1;