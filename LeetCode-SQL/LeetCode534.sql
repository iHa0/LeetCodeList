# Write your MySQL query statement below
select t1.player_id, t1.event_date, sum(t2.games_played) as games_played_so_far
from Activity t1, Activity t2
where t1.player_id = t2.player_id
and t1.event_date >= t2.event_date
group by t1.player_id, t1.event_date;
