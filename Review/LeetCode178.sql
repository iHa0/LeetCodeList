# Write your MySQL query statement below
select score, (
    select count(distinct b.score)
    from Scores b
    where b.score >= a.score
) as 'rank'
from Scores a
order by score desc
