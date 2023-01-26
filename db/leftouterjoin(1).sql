select
	*
from
	course_mst cm
		left outer join student_mst sm on (sm.student_id = cm.student_id)
        left outer join mento_mst mm on (mm.mento_id = sm.mento_id)
        left outer join lecture_mst lm on(lm.lecture_id = cm.lecture_id)
        left outer join instructor_mst im on (im.instructor_id = cm.instructor_id)
		left outer join university_mst um on (um.university_id = im.university_id)
        