--Write your MySQL query statement below
SELECT product_name, YEAR, price FROM Sales s LEFT JOIN Product p
ON s.product_id = p.product_id ORDER BY YEAR