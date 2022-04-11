# Write your MySQL query statement below
select Email
from (
    select Email, count(Email) as num
    from Person
    group by Email
) as n
where n.num > 1
