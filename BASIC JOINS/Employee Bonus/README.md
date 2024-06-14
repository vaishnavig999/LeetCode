# 577. Employee Bonus

### Table: Employee

| Column Name | Type    |
| ----------- | ------- |
| empId       | int     |
| name        | varchar |
| supervisor  | int     |
| salary      | int     |

`empId` is the column with unique values for this table.  
Each row of this table indicates the name and the ID of an employee in addition to their salary and the ID of their manager.

### Table: Bonus

| Column Name | Type |
| ----------- | ---- |
| empId       | int  |
| bonus       | int  |

`empId` is the column of unique values for this table.  
`empId` is a foreign key (reference column) to `empId` from the `Employee` table.  
Each row of this table contains the ID of an employee and their respective bonus.

## Problem Statement

Write a solution to report the name and bonus amount of each employee with a bonus less than 1000.

Return the result table in any order.

## Example 1

### Input

**Employee table:**

| empId | name   | supervisor | salary |
| ----- | ------ | ---------- | ------ |
| 3     | Brad   | null       | 4000   |
| 1     | John   | 3          | 1000   |
| 2     | Dan    | 3          | 2000   |
| 4     | Thomas | 3          | 4000   |

**Bonus table:**

| empId | bonus |
| ----- | ----- |
| 2     | 500   |
| 4     | 2000  |

### Output

| name | bonus |
| ---- | ----- |
| Brad | null  |
| John | null  |
| Dan  | 500   |

### Explanation

- Employee with ID 3 (Brad) does not have a bonus record, so the bonus is null.
- Employee with ID 1 (John) does not have a bonus record, so the bonus is null.
- Employee with ID 2 (Dan) has a bonus of 500, which is less than 1000.
- Employee with ID 4 (Thomas) has a bonus of 2000, which is not less than 1000, so it is not included in the output.
