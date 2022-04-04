# Write your MySQL query statement below
select distinct max(salary) as SecondHighestSalary
from Employee
where salary < (
    select distinct max(salary)
    from Employee
)
