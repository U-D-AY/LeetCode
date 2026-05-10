select e1.name as Employee
from employee e1 
join employee e2
on e1.managerId = e2.id
and e1.salary > e2.salary
#select a.name as Employee from employee a join employee b on a.managerid = b.id where a.salary > b.salary