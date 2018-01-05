delete from pomos_tem;

insert into pomos_tem select distinct * from pomos;

delete from pomos;

insert into pomos select * from pomos_tem;