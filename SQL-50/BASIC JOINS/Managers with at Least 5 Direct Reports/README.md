# 570. Managers with at Least 5 Direct Reports

## Problem Description

You are given a table `Employee`, where each row indicates the name of an employee, their department, and the ID of their manager. If `managerId` is null, then the employee does not have a manager. No employee will be the manager of themselves.

### Table: Employee

| Column Name | Type    |
|-------------|---------|
| id          | int     |
| name        | varchar |
| department  | varchar |
| managerId   | int     |

- `id` is the primary key (column with unique values) for this table.
- Each row of this table contains the name of an employee, their department, and the ID of their manager.

## Task

Write a solution to find managers with at least five direct reports.

### Example

#### Input

**Employee table:**

| id  | name  | department | managerId |
|-----|-------|------------|-----------|
| 101 | John  | A          | null      |
| 102 | Dan   | A          | 101       |
| 103 | James | A          | 101       |
| 104 | Amy   | A          | 101       |
| 105 | Anne  | A          | 101       |
| 106 | Ron   | B          | 101       |

#### Output

| name |
|------|
| John |

### Explanation

John is the only manager with at least five direct reports (Dan, James, Amy, Anne, and Ron).
