select b.name as name
from Employee a 
left join Employee b
on a.managerId = b.id
group by b.name
having count(b.name) >= 5
