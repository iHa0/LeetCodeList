# Write your MySQL query statement below
select question_id as survey_log
from SurveyLog
group by question_id
order by sum(if(action = 'answer', 1, 0)) / sum(if(action = 'show', 1, 0)) desc, question_id asc
limit 1;
