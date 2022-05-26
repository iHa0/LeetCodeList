# Write your MySQL query statement below
select round(avg(b.player_id is not null), 2) as fraction
from (
    select player_id, min(event_date) as login
    from Activity
    group by player_id
) a
left join Activity b
on a.player_id = b.player_id and datediff (b.event_date, a.login) = 1
