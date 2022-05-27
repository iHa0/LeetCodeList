# Write your MySQL query statement below
select ta.name, tb.bonus
from Employee ta
left join Bonus tb
on ta.empId = tb.empId
where tb.bonus < 1000 or tb.bonus is null
