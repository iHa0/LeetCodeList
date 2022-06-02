# Write your MySQL query statement below
select ta.dept_name, count(tb.student_id) as student_number
from Department ta
left join Student tb
on ta.dept_id = tb.dept_id
group by ta.dept_name
order by count(tb.student_id) desc, ta.dept_name asc;
