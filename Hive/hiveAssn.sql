create database uspto;

-- move file from local file system to vm file system
scp -P 2222 apat63_99.txt root@localhost:~

-- mkdir patent_temp to hold data on hdfs
hdfs dfs -mkdir /user/maria_dev/patent_temp/

-- move file from vm local file system to hdfs
hdfs dfs -copyFromLocal apat63_99.txt /user/maria_dev/patent_temp

use uspto;

drop table if exists patents; create table patents ( patent INT, gyear INT, gdate INT , appyear INT,
country CHAR (2), postate CHAR (2), assignee INT, asscode INT, claims INT, nclass INT, cat INT, subcat INT,
cmade INT, creceive INT, ratiocit INT, general INT, original INT, fwdaplag INT, bckgtlag INT, selfctub INT,
selfctlb INT, secdupbd INT, secklwbd INT )
row format delimited fields terminated by ',' 
escaped by '"' 
lines terminated by '\n'
stored as textfile
tblproperties ("skip.header.line.count"="1");


load data inpath "/user/maria_dev/patent_temp/apat63_99.txt" overwrite into table patents;

SET hive.exec.dynamic.partition=true;
SET hive.exec.dynamic.partition.mode=nonstrict;



drop table if exists tmp_pat; create external table tmp_pat ( patent INT, gdate INT , appyear INT,
country CHAR (2), postate CHAR (2), assignee INT, asscode INT, claims INT, nclass INT, cat INT, subcat INT,
cmade INT, creceive INT, ratiocit INT, general INT, original INT, fwdaplag INT, bckgtlag INT, selfctub INT,
selfctlb INT, secdupbd INT, secklwbd INT )
partitioned by (gyear INT)
row format delimited fields terminated by ',' 
escaped by '"' 
lines terminated by '\n'
stored as textfile
location '/user/maria_dev/ext_pat';

from patents pt
insert overwrite table tmp_pat partition (gyear)
select pt.patent, pt.gdate, pt.appyear, pt.country, pt.postate, pt.assignee, pt.asscode, 
pt.claims, pt.nclass, pt.cat, pt.subcat, pt.cmade, pt.creceive, pt.ratiocit, pt.general, pt.original,
pt.fwdaplag, pt.bckgtlag, pt.selfctub, pt.selfctlb, pt.secdupbd, pt.secklwbd, pt.gyear;

-- C. Find out number of patents granted in year 1963.
select count(gyear) from tmp_pat where gyear=1963;

-- D. Find out number of patents granted in each country in year 1999
select country, count(patent) from tmp_pat where gyear=1999 group by country;
















