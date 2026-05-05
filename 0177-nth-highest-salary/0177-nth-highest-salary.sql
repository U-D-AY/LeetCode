CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    declare m int;
    set m = n - 1;
  RETURN (
      select distinct salary from employee
      order by salary DESC
      limit 1 offset m
  );
END