SELECT 
IFNULL(
(SELECT DISTINCT salary 
FROM Employee 
ORDER BY salary DESC 
LIMIT 1 OFFSET 1),
NULL
) AS SecondHighestSalary;


-- While returning the 2nd Highest One, there can be null values, duplicate values
-- For that use IFNULL for null values & DISTINCT for duplicate values