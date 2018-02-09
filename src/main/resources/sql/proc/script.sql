DROP PROCEDURE IF EXISTS delete_duplicated_record;
DELIMITER;;
CREATE PROCEDURE  delete_duplicated_record (INT para BIGINT)
BEGIN

delete from pomos_tem;

insert into pomos_tem select distinct * from pomos;

delete from pomos;

insert into pomos select * from pomos_tem;

END