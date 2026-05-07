select * from users
where email regexp '^[_0-9A-Za-z]+@[A-Za-z]+\\.com$'
order by user_id