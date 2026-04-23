select employee_id, 
case
    when count(*)>1 then
        max(case  when primary_flag = 'Y' then department_id end)
    else max(department_id )
    end as department_id
from employee 
group by employee_id