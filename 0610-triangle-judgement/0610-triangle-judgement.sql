# Write your MySQL query statement below
select * ,if(x+y>z and z+y>x and x+z>y,'Yes', 'No')  as triangle from triangle;