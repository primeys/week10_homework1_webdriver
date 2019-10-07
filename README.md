# Week10_SQL-Home Work 

Q.1 Write a sql query to fetch all records from table 'products' where 'price' is 20 or 30

Ans. SELECT * FROM Products where Price = 20 or Price =30;

Q.2 Write a sql query to fetch all records from table 'products' where 'ProductName' starts with 'T' and end with 'e'

Ans. SELECT * FROM Products where ProductName like 't%e';

Q.3 Write a sql query to fetch all records from table 'Categories' having CategoryId in descending order

Ans. SELECT * FROM Categories order by CategoryID desc;

Q.4 Write a sql query to get an average of 'price' from table 'products'

Ans. SELECT avg (Price) FROM Products

Q.5 Write a sql query to get the total number of records in table 'Orders' 

Ans. SELECT *FROM Orders;

Q.6 Write a sql query to get unique list of 'productname' from table 'products'

Ans.  SELECT distinct ProductName FROM Products ;

Q.7 Write a sql query to get 'unit' of product name 'Tofu' from table 'products'

Ans. SELECT * from Products Where ProductName like 'tofu';

Q.8 Write a sql query to get sum of price of 'productid' being an odd number from table 'products'

Ans. SELECT sum (Price) FROM [Products] where ProductID in (select ProductID from Products where ProductID %2 <> 0);



