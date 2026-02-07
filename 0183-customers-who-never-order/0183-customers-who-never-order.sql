select c.name as Customers 
from Customers as c 
left join Orders o on c.id = o.customerId 
where o.customerid is null