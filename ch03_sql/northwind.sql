
-- Q1. All records from the customer table
SELECT * FROM Customers

-- Q2. All Customers from Paris

-- Q3. All Distinct Cities (in France)

-- Q4. All Customers with a Sales Representative

-- PRODUCTS TABLE
-- Q5. Get me the Pavlova!
SELECT * FROM products

-- Q6. Get all Products from Supplier 7

-- Q7. Get all products with 0 Units in Stock

-- Q8. Get all products with between 20 and 40 units in stock (that are not discontinued)

-- Q9. Get all products by 'Chef Anton' (you will need to use the LIKE keyword - see W3 Schools)

-- Q10. Get all products by Sold in Jars (you will need to use the LIKE keyword - see W3 Schools)

-- EMPLOYEES TABLE
-- Q11. Get all employees and have a look at the data
SELECT * FROM Employees


-- Q12. Without writing any SQL, tell me who the manager of Margaret Peacock is

-- Q13. Get all employees who were born before 1960 (< '1960-01-01')

-- Q14. Insert yourself as an Employee!! 


SELECT * 
FROM Customers  -- 91 customers
WHERE City = 'Paris'
--2 from paris

SELECT * 
FROM Customers  -- 91 customers
WHERE City != 'Paris' --89 not paris


SELECT * 
FROM Customers 
WHERE Region = 'BC' -- 2 ROWS

SELECT * 
FROM Customers 
WHERE Region != 'BC' --29 ROWS

SELECT * 
FROM Customers
WHERE REGION IS NOT NULL  -- 60 ROWS

--31 ROWS ACCOUNTED FOR
--60 ROWS MISSING
SELECT * 
FROM Customers -- 91 ROWS

SELECT * 
FROM Orders -- 830

SELECT * 
FROM [Order Details] --2155


-- -------------------  TABLE JOINS ------------------------------------
SELECT * 
FROM Categories  -- 8 rows


SELECT * 
FROM Products -- 77

SELECT * 
FROM Categories
INNER JOIN Products
ON Categories.CategoryID  = Products.CategoryID

SELECT CAT.CategoryName
, CAT.Description
, PROD.ProductName
FROM Categories AS CAT
INNER JOIN Products AS PROD 
ON CAT.CategoryID = PROD.ProductID
WHERE PROD.ProductName = 'Chai'
ORDER BY CAT.CategoryName ASC





-- Q20. Get Orders shipped to Germany that were placed in 1998
-- Show the columns
-- CustomerID, CustomerName, Country, OrderID, OrderDate and ShipCountry
SELECT *
FROM Customers AS CUST
INNER JOIN Orders AS ORD
ON CUST.CustomerID = ORD.CustomerID
WHERE ORD.ShipCountry = 'Germany'
AND ORD.OrderDate >= '1998-01-01'
AND ORD.OrderDate < '1999-01-01'

-- WHERE ORD.OrderDate LIKE '%1998%'



-- Customers 91 rows
-- Orders 830 rows



SELECT * 
FROM Customers
WHERE ContactTitle LIKE '%Manager%'



SELECT CUST.CompanyName
, ORD.OrderId 
, EMP.FirstName + ' ' + EMP.LastName AS 'Full Name'
FROM Customers AS CUST
INNER JOIN Orders AS ORD 
ON CUST.CustomerID = ORD.CustomerID
INNER JOIN Employees AS EMP
ON ORD.EmployeeID = EMP.EmployeeID
