# Write your MySQL query statement below
select name
from SalesPerson
where sales_id not in (
    select ta.sales_id 
    from Orders ta
    left join Company tb
    on ta.com_id = tb.com_id
    where tb.name = 'RED'
)
