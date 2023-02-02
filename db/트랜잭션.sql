show variables like 'AUTOCOMMIT';             /* AUTOCOMMIT이 on인 상태에서는 트랜잭션을 실행할 수 없다*/
set autocommit = 0;

start transaction;

savepoint sp3;

insert into user_mst
values (0,'jjj', '1234', '김준일', 'jjj@gmail.com');

select * from user_mst;

rollback to sp1;

commit;