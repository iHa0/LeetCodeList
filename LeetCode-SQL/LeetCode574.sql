# Write your MySQL query statement below
select name
from (
    select candidateId as id
    from Vote
    group by candidateId 
    order by count(candidateId) desc
    limit 1
) as win, Candidate a
where win.id = a.id
