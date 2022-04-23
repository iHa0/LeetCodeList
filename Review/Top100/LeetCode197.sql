# Write your MySQL query statement below
select b.id
from Weather a, Weather b
where datediff(b.recordDate, a.recordDate) = 1
and b.Temperature > a.Temperature
