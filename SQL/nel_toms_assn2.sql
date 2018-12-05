--Nel Toms

--1.
select lo.name as name, count(distinct sl.staid) as sta
from stationbylocation sl
join location lo
on lo.locationid=sl.locid
group by name
having sta >= 100
order by sta desc limit 10;

--2.
select lo.name as name, min(st.elevation) as min_elevation, max(st.elevation) as max_elevation,
	round(avg(st.elevation),1) as avg_elevation, count(distinct sl.staid) as sta
from stationbylocation sl
join location lo
on lo.locationid=sl.locid
join station st
on st.stationid=sl.staid
group by name
having sta >= 100
order by avg_elevation desc;

--3.
select lc.name as Category, lo.name as Location, sn.name as Station, sn.elevation as Elevation
from locationcategory lc
join locationbycategory lbc
on lc.lcid=lbc.catid
join location lo
on lbc.locid=lo.locationid
join stationbylocation sbl 
on lo.locationid=sbl.locid
join station sn 
on sn.stationid=sbl.staid
order by sn.elevation desc limit 5;

--4a.
select station.elevation as elevation,  abs(station.latitude) as latitude, avg(distinct(tminmax.tmin+tminmax.tmax)/2) as avg_temp
from station
join tminmax
on station.stationid=tminmax.stationid
where tminmax.year >= 2008
group by elevation, latitude
order by station.elevation, latitude
limit 50;

--4b1.
select station.name as name, avg(station.elevation) as elevation,  avg(abs(station.latitude)) as latitude, avg(distinct(tminmax.tmin+tminmax.tmax)/2) as avg_temp
from station
join tminmax
on station.stationid=tminmax.stationid
where tminmax.year >= 2008
group by station.elevation 
order by station.elevation desc 
limit 50;

--4b2.
select avg(station.elevation) as elevation,  avg(abs(station.latitude)) as latitude, avg(distinct(tminmax.tmin+tminmax.tmax)/2) as avg_temp
from station
join tminmax
on station.stationid=tminmax.stationid
where tminmax.year >= 2008
group by elevation 
order by station.elevation 
limit 50;

--4b3.
 select avg(station.elevation) as elevation,  avg(abs(station.latitude)) as latitude, avg(distinct(tminmax.tmin+tminmax.tmax)/2) as avg_temp
 from station 
 join tminmax 
 on station.stationid=tminmax.stationid 
 where tminmax.year >= 2008 
 group by station.latitude
 order by station.latitude
 limit 50;

--4b4.
 select avg(station.elevation) as elevation,  avg(abs(station.latitude)) as latitude, avg(distinct(tminmax.tmin+tminmax.tmax)/2) as avg_temp
 from station 
 join tminmax 
 on station.stationid=tminmax.stationid 
 where tminmax.year >= 2008 
 group by station.latitude
 order by station.latitude desc 
 limit 50;

--4b5.
Station Category		Avg_elevation 		Avg_Latitude 		Avg_Temp
-------------------------------------------------------------------------
High Elevation 					  4701			  38.37				10.60

Low Elevation 					 -59.9			  36.46				23.84

Low Latitudes						 0				 90			   -47.76

High Altitudes					    22			  80.60				-9.73

--4c.
--Yes, the results suggest that the hypothesis has merit. On avg as the latitude
--10 degrees the temperature increases 5 degrees.

--5a.
select distinct station.name as name, count(station.stationid) as sta_id, station.maxdate
from station
join tminmax
on station.stationid = tminmax.stationid
where tminmax.year >=2000
group by name, station.maxdate
having year(station.maxdate) < max(tminmax.year);

--5b.
select distinct location.name as name, count(location.locationid) as loc_id, station.maxdate
from station
join tminmax
on station.stationid = tminmax.stationid
join stationbylocation
on stationbylocation.staid=station.stationid
join location
on location.locationid=stationbylocation.locid
where tminmax.year>=2000
group by name, station.maxdate
having year(station.maxdate) < max(tminmax.year);


--6A.
select round(avg(tobs),3) as T_mean, round((tmax-tmin),3) as Amplitude
from tminmax
where stationid=1115;

select round(avg(tobs),3) as T_mean, round((tmax-tmin),3) as Amplitude, year 
from tminmax 
where stationid=1115 and tobs not in (999)
group by Amplitude 
order by year desc;

--6B1.
select round(avg(tobs),3), year 
from tminmax 
where stationid=1115 and year>=2008 and tobs not in (999) 
group by tmax, tmin, year 
order by year desc;

--6B2.
select round(avg(tobs),3) as tb, dayofyear, (select min(tobs) from tminmax
	where stationid=1115 and year>=2008) as sub
from tminmax 
where stationid=1115 and year>=2008 and tobs not in (999) 
group by sub 
order by tb desc;






