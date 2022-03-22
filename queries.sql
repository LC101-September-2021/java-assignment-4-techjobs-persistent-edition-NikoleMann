-- Part 1: Test it with SQL
    --list the columns and their data types of table "job"
select COLUMN_NAME, data_type
from INFORMATION_SCHEMA.COLUMNS
where TABLE_NAME = 'job'


-- Part 2: Test it with SQL
    --Write a query to list the names of employers in STL
SELECT name
FROM employer
WHERE (location = 'St. Louis')

-- Part 3: Test it with SQL
    --write a SQL statement to remove the job table
DROP TABLE job

-- Part 4: Test it with SQL
    --write a query that returns a list of the names and descriptions of all skills attached to a job
