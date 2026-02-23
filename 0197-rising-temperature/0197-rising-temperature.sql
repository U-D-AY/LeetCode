# Write your MySQL query statement below
select w.id from weather w join weather w2
on w.recorddate = date_add(w2.recorddate, interval 1 day)
where w.temperature>w2.temperature