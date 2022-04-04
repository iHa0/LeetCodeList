# Write your MySQL query statement below
select distinct a.Num as ConsecutiveNums
from
    Logs a,
    Logs b,
    Logs c
where a.Id = b.Id - 1
and b.Id = c.Id - 1
and a.Num = b.Num
and b.Num = c.Num
