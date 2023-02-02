select 
	count(mento_id) as mento_count,
    min(student_id) as min_student_id,
    max(student_id) as max,
    round(avg(student_id),1),
    sum(student_id),author_mst
	mento_id
from
	stuauthor_mstauthor_mstdent_mst
group by 
	mento_id
-- having
-- 	mento_count = 5;

