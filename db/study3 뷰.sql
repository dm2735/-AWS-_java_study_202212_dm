/*밑에 결과를 library_view 에 담겠다 (가짜테이블생성)*/

create view library_view as

select 
	/*그룹 내에서 순번을 줌 = partition by*/
	row_number() over(partition by 도서관명 order by 도서관명) as 도서관순번, 
	도서관명
from
	library_mst
group by
	도서관명;