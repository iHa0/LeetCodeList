# Write your MySQL query statement below
select a.player_id, a.event_date, sum(b.games_played) as games_played_so_far
from Activity a, Activity b
where a.player_id = b.player_id
and a.event_date >= b.event_date
group by a.player_id, a.event_date
