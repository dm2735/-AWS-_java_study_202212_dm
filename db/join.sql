select 
	순번, 
    도서관명, 
    구분, 
    도서명, 
    저작자, 
    (select author_name 
	 from author_mst am 
	 where lm.저작자 = am.author_id) as 저작자명 , 
	출판사,
    (select publisher_name from publisher_mst pm where lm.출판사 = pm.publisher_id) as 출판사명,
    (select publisher_year from publisher_mst where 출판사 = publisher_id) as  출판사설립일,
    발행연도, 
    청구기호
    
from library_mst lm ;






select 
	lm.순번, 
    lm.도서관명, 
    lm.구분, 
    lm.도서명, lm.
    저작자, 
    am.author_name as 저작자명, 
    출판사, 
    pm.publisher_name as 출판사명, 
    pm.publisher_year as 출판사설립일,
    발행연도, 
    청구기호
from library_mst lm
	left outer join publisher_mst pm on ( lm.출판사 = pm.publisher_id)
	left outer join author_mst am on( lm.저작자 = am.author_id);


insert into library_mst
values ( 0, '테스트도서관', '999(테스트)', ' 테스트도서명', '9999', '9999', '2023', '999.9-테99ㅌ');


select 
* 
from 
	library_mst lm 
	inner join publisher_mst pm on (pm.publisher_id = lm.출판사)
order by
	lm.순번 desc;
    
select 
 lm.순번,
 lm.도서관명,
 lm.구분,
 lm.도서명,
 lm.출판사,
 pm.publisher_name,
 pm.publisher_year
from 
	library_mst lm 
	left outer join publisher_mst pm on (pm.publisher_id = lm.출판사)
order by
	lm.순번 desc;