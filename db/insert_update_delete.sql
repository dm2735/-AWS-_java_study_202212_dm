/*
DML
C : insert / into 	 데이터 추가 
R : select / from	 데이터 조회
U : update / set 	 데이터 수정
D : delete / from	 데이터 삭제
*/

/*====================<<insert>>======================*/

insert into student_mst
values
	(1,'김동민',1),
    (2,'김두영',2),
    (3,'정진원',1),
    (4,'손지호',10),
	(5, '이강용',10),
	(6, '김준경',10),
	(7, '이현수',10),
	(8, '정의현',10);
    
    insert into university_mst
    values
		(1,'서울대'),
        (2,'부산대'),
        (3,'경상대'),
		(4,'신라대'),
        (5,'경성대');
        
        select * from university_mst;
        

/*==================================<<update>>===============================*/
/*멘토 아이디가 10인 학생들의 멘토 아이디를 1로 바꿔라*/
        
select * from university_mst;


update student_mst
set
	mento_id = 1
where
	mento_id = 10;
    
select * from student_mst;

/*========================<<delete>>========================*/
delete 
from 
	student_mst 
where 
	student_id = 4
and student_name = '손지호';

select * from student_mst;
 
 
 delete 
 from
	university_mst
where
	university_name = '경성대';

select * from university_mst;

