# Write your MySQL query statement below
select tb.name as Department, ta.name as Employee, ta.salary as Salary
from Employee as ta
left join Department as tb
on ta.departmentId = tb.id
where (ta.departmentId, ta.salary) in (
    select departmentId, max(salary)
    from Employee
    group by departmentId
)
