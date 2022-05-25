# Write your MySQL query statement below
select a.dept_name, count(b.student_id) as student_number
from Department a
left join Student b
on a.dept_id = b.dept_id
group by dept_name
order by student_number desc, dept_name asc
