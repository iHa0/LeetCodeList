CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    set N := N - 1;
  RETURN (
      # Write your MySQL query statement below.
      select salary 
      from Employee
      group by salary
      order by salary desc
      limit N, 1
  );
END
