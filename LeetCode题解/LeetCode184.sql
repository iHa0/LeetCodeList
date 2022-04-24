# Write your MySQL query statement below
# select b.name, a.name, a.salary
# from Employee as a
# left join Department as b
# on a.departmentId = b.id
# where salary = (
#     select max(salary)
#     from Employee as a
#     left join Department as b
#     on a.departmentId = b.id
#     order by a.departmentId
# )
select b.name as Department, a.name as Employee, a.salary as Salary
from Employee a
left join Department b
on a.departmentId = b.id
where (a.departmentId, a.salary) in (
    select departmentId, max(salary)
    from Employee
    group by departmentId
)
