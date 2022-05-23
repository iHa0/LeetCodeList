# Write your MySQL query statement below
select round(avg(a.event_date is not null), 2) as fraction 
from (
    select player_id, min(event_date) as login
    from Activity
    group by player_id
) as b
left join Activity a
on b.player_id = a.player_id and datediff(a.event_date, b.login) = 1
