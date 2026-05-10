select p.product_name, sum(unit)as unit
from products p join orders o
on p.product_id = o.product_id
where o.order_date>'2020-01-31' and o.order_date<'2020-03-1'
group by p.product_id, p.product_name
having unit>=100
