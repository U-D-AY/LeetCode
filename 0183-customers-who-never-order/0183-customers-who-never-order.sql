select c.name as Customers 
from Customers as c 
where not exists 
(    select 1 
from Orders o 
where c.id = o.CustomerId)