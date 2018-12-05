-- 2.
select item.title, avg(data.rating) avg_rating
from item
join data
on item.movieId=data.itemId
group by item.title
having avg_rating = 5
order by avg_rating desc;

-- 3.
select item.title, avg(data.rating) avg_rating
from item
join data
on item.movieId=data.itemId
group by item.title
having avg_rating < 2.0
order by avg_rating desc;

-- 4.
select item.title, count(data.rating) rating_count
from item
join data
on item.movieId=data.itemId
group by item.title
order by rating_count desc;

-- 5.
select distinct item.title, data.rating rating_count
from item
join data
on item.movieId=data.itemId
where item.comedy = 1
order by rating_count desc;