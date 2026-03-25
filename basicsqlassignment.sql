DROP DATABASE IF EXISTS EcommerceDB;
CREATE DATABASE EcommerceDB;
USE EcommerceDB;

CREATE TABLE Customers (
    CustomerId INT,
    CustomerName VARCHAR(100),
    City VARCHAR(50),
    Email VARCHAR(100)
);

CREATE TABLE Products (
    ProductId INT,
    ProductName VARCHAR(100),
    Category VARCHAR(50),
    Price DECIMAL(10,2)
);

CREATE TABLE Orders (
    OrderId INT,
    CustomerId INT,
    OrderDate DATE,
    TotalAmount DECIMAL(10,2)
);

CREATE TABLE OrderItems (
    OrderItemId INT,
    OrderId INT,
    ProductId INT,
    Quantity INT
);

ALTER TABLE Customers ADD PRIMARY KEY (CustomerId);
ALTER TABLE Products ADD PRIMARY KEY (ProductId);
ALTER TABLE Orders ADD PRIMARY KEY (OrderId);
ALTER TABLE OrderItems ADD PRIMARY KEY (OrderItemId);




ALTER TABLE Orders
ADD FOREIGN KEY (CustomerId) REFERENCES Customers(CustomerId);

ALTER TABLE OrderItems
ADD FOREIGN KEY (OrderId) REFERENCES Orders(OrderId);

ALTER TABLE OrderItems
ADD FOREIGN KEY (ProductId) REFERENCES Products(ProductId);


INSERT INTO Customers (CustomerId, CustomerName, City, Email) VALUES
(1,'Amit','Delhi','amit@gmail.com'),
(2,'Anita','Bangalore','anita@gmail.com'),
(3,'Arjun','Chennai','arjun@gmail.com'),
(4,'Meena','Mumbai','meena@gmail.com'),
(5,'Kiran','Chennai',NULL);

INSERT INTO Products (ProductId, ProductName, Category, Price) VALUES
(1,'Mobile','Electronics',15000),
(2,'Laptop','Electronics',50000),
(3,'Chair','Furniture',3000),
(4,'Table','Furniture',7000),
(5,'Mouse','Accessories',500);

INSERT INTO Orders (OrderId, CustomerId, OrderDate, TotalAmount) VALUES
(1,1,'2024-02-10',20000),
(2,2,'2024-03-15',60000),
(3,3,'2024-01-20',8000),
(4,4,'2024-04-01',30000),
(5,2,'2024-05-05',15000);

INSERT INTO OrderItems (OrderItemId, OrderId, ProductId, Quantity) VALUES
(1,1,1,2),
(2,1,5,1),
(3,2,2,1),
(4,3,3,2),
(5,4,4,3),
(6,5,1,1);

SELECT Quantity * 1000 AS EstimatedTotal FROM OrderItems;
SELECT ProductName, Price + 500 AS IncreasedPrice FROM Products;
SELECT ProductName, Price - 200 AS ReducedPrice FROM Products;
SELECT Quantity * 2 AS DoubleQuantity FROM OrderItems;
SELECT TotalAmount / 2 AS HalfAmount FROM Orders;

SELECT * FROM Orders WHERE TotalAmount > 10000;
SELECT * FROM Products WHERE Price < 5000;
SELECT * FROM Orders WHERE TotalAmount >= 25000;
SELECT * FROM Products WHERE Price <= 8000;
SELECT * FROM Customers WHERE City = 'Chennai';
SELECT * FROM Customers WHERE City != 'Delhi';

SELECT * FROM Customers WHERE City='Bangalore' AND CustomerName LIKE 'A%';
SELECT * FROM Products WHERE Category='Electronics' OR Category='Furniture';
SELECT * FROM Orders WHERE TotalAmount > 5000 AND TotalAmount < 70000;
SELECT * FROM Customers WHERE City != 'Mumbai';
SELECT * FROM Products WHERE Category != 'Accessories';

SELECT * FROM Products WHERE Category IN ('Electronics','Furniture');
SELECT * FROM Customers WHERE City NOT IN ('Chennai','Bangalore');
SELECT * FROM Orders WHERE TotalAmount BETWEEN 5000 AND 60000;
SELECT * FROM Orders WHERE TotalAmount NOT BETWEEN 5000 AND 60000;
SELECT * FROM Customers WHERE CustomerName LIKE '%a';
SELECT * FROM Products WHERE ProductName LIKE 'M%';
SELECT * FROM Customers WHERE Email IS NULL;
SELECT * FROM Customers WHERE Email IS NOT NULL;

SELECT * FROM Customers WHERE City='Chennai';
SELECT * FROM Orders WHERE OrderDate > '2024-02-01';
SELECT * FROM Products WHERE Price > 10000;
SELECT * FROM OrderItems WHERE Quantity = 1;
SELECT * FROM Customers WHERE Email IS NULL;

SELECT * FROM Orders ORDER BY TotalAmount DESC;
SELECT * FROM Customers ORDER BY CustomerName ASC;
SELECT * FROM Products ORDER BY Price DESC;
SELECT * FROM Orders ORDER BY OrderDate ASC;

SELECT CustomerId, COUNT(*) AS TotalOrders FROM Orders GROUP BY CustomerId;
SELECT CustomerId, SUM(TotalAmount) AS Revenue FROM Orders GROUP BY CustomerId;
SELECT CustomerId, AVG(TotalAmount) AS AvgOrder FROM Orders GROUP BY CustomerId;
SELECT ProductId, SUM(Quantity) AS TotalSold FROM OrderItems GROUP BY ProductId;
SELECT Category, COUNT(*) AS ProductCount FROM Products GROUP BY Category;

SELECT CustomerId, SUM(TotalAmount)
FROM Orders GROUP BY CustomerId
HAVING SUM(TotalAmount) > 50000;

SELECT CustomerId, COUNT(*)
FROM Orders GROUP BY CustomerId
HAVING COUNT(*) > 1;

SELECT ProductId, SUM(Quantity)
FROM OrderItems GROUP BY ProductId
HAVING SUM(Quantity) > 1;

SELECT Category, COUNT(*)
FROM Products GROUP BY Category
HAVING COUNT(*) > 1;

SELECT CustomerId, AVG(TotalAmount)
FROM Orders GROUP BY CustomerId
HAVING AVG(TotalAmount) > 20000;

SELECT c.CustomerName, o.TotalAmount
FROM Customers c
JOIN Orders o ON c.CustomerId = o.CustomerId;

SELECT p.ProductName, oi.Quantity
FROM Products p
JOIN OrderItems oi ON p.ProductId = oi.ProductId;

SELECT c.CustomerName, o.OrderDate, o.TotalAmount
FROM Customers c
JOIN Orders o ON c.CustomerId = o.CustomerId;

SELECT oi.OrderId, p.ProductName, oi.Quantity
FROM OrderItems oi
JOIN Products p ON oi.ProductId = p.ProductId;

SELECT *
FROM Customers c
JOIN Orders o ON c.CustomerId = o.CustomerId
JOIN OrderItems oi ON o.OrderId = oi.OrderId
JOIN Products p ON oi.ProductId = p.ProductId;

SELECT CustomerId, SUM(TotalAmount) AS Revenue
FROM Orders GROUP BY CustomerId ORDER BY Revenue DESC;

SELECT ProductId, SUM(Quantity) AS Sold
FROM OrderItems GROUP BY ProductId ORDER BY Sold DESC;

SELECT * FROM Customers WHERE Email IS NULL;

SELECT MONTH(OrderDate) AS Month, SUM(TotalAmount) AS Revenue
FROM Orders GROUP BY MONTH(OrderDate);

SELECT * FROM Orders WHERE TotalAmount > 20000;

SELECT * FROM Products
WHERE ProductId NOT IN (SELECT ProductId FROM OrderItems);

SELECT * FROM Customers
WHERE CustomerId NOT IN (SELECT CustomerId FROM Orders);

SELECT CustomerId, SUM(TotalAmount) AS Revenue
FROM Orders GROUP BY CustomerId ORDER BY Revenue DESC LIMIT 3;

SELECT p.Category, SUM(oi.Quantity) AS TotalSales
FROM Products p
JOIN OrderItems oi ON p.ProductId = oi.ProductId
GROUP BY p.Category;

SELECT CustomerId, AVG(TotalAmount) AS AvgOrderValue
FROM Orders GROUP BY CustomerId;