# Write your MySQL query statement below
select b.name as Department, a.name as Employee, a.salary as Salary
from Employee a
left join Department b
on a.departmentId = b.id
where (a.departmentId, a.salary) in (
    select departmentId, max(salary)
    from Employee
    group by departmentId
)
