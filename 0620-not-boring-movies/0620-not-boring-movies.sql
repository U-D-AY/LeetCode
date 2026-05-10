select * from cinema
where id%2 <> 0 and description <> 'boring'
order by rating desc
#select * from cinema where id&1=1 and description <> 'boring' order by rating DESC