select class from courses 
group by 1 
having count(student)>4;