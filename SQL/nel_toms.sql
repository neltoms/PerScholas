--1.
select customers.customerName as "Customer Name", concat(employees.lastName,", ", employees.firstName) as "Sales Rep"
from customers
join employees
on customers.salesRepEmployeeNumber=employees.employeeNumber
order by customers.customerName;

--2.
select p.productName as "Product Name", od.quantityOrdered as "Total # Ordered", (od.quantityOrdered*od.priceEach) as Total_Sale
from products p
join orderdetails od
on p.productCode=od.productCode
order by Total_Sale desc;

--3.
select o.status as Order_Status, count(o.orderNumber) as "# of Orders"
from orders o
group by Order_Status
order by Order_Status;

--4.
select p.productLine as Product_Line, o.quantityOrdered as "# Sold"
from products p
join orderdetails o
on o.productCode=p.productCode
order by o.quantityOrdered desc;

--5.
select distinct(concat(e.lastName, ", ", e.firstName)) as Sales_Rep, count(ifnull(o.orderNumber,0.00)) as '# of Orders', sum(od.quantityOrdered*od.priceEach) as Total_Sales
from employees e
join customers c
on e.employeeNumber=c.salesRepEmployeeNumber
join orders o
on c.customerNumber=o.customerNumber
join orderdetails od
on od.orderNumber=o.orderNumber
where e.jobTitle='Sales Rep'
group by Sales_Rep
order by Total_Sales desc;

--6.
select monthname(o.orderDate) as Month, extract(year from o.orderDate) as Year, sum(round((od.quantityOrdered*od.priceEach),2)) as Payments_Received
from orders o
join orderdetails od
on o.orderNumber=od.orderNumber
group by Month, Year;












