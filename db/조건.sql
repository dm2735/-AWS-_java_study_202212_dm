SELECT
	순번,	
	도서관명,
	구분,
	도서명,
	저작자,
	출판사,
    발행연도,
    case
		when 발행연도 is null then '2050'
        when 발행연도 = '' then '2090'
        else 발행연도											 /*한개의 조건에 여러개의 데이터가 필요할 경우 case when을 사용한다*/
	end as 발행연도1,
	if(ifnull(발행연도, '') = '', '2023', 발행연도) as 발행연도2,   /*발행연도가 널이면 공백으로 바꿔준다  = > 만약에 널이면 발행연도를 ''로 바꿔준다.*/
    nullif(발행연도, '') as 발행연도3,                   		 /* 발행연도가 공백이면 null로 바꿔준다 => 발행연도와 ''가 같으면 null로 바꿔준다.*/
    if(청구기호 = '', '기호없음', 청구기호) as 청구기호
FROM 
	library_mst
where
/*	발행연도 like '2%';*/
	발행연도 like '199_';

    
 
update 
	library_mst
set
	발행연도 = ''
where
	발행연도 = '2009';
    
select * from library_mst;


