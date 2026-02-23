# Write your MySQL query statement below
select w2.id from weather w join weather w2
on datediff(w2.recorddate, w.recorddate)=1 where w2.temperature>w.temperature