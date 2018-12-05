select cc.transaction_type as 'Transaction Type', sum(cc.transaction_value) as 'Transaction Value'
from cdw_sapp_customer c
join cdw_sapp_creditcard cc
on c.ssn=cc.cust_ssn
where cc.credit_card_no = 4210653397569102 and cc.month = 7 and cc.year = 2018
group by transaction_type;


select cdw_sapp_creditcard.transaction_id as id, cdw_sapp_creditcard.month as Month, 
cdw_sapp_creditcard.day as Day, cdw_sapp_creditcard.year as Year, 
cdw_sapp_creditcard.transaction_type as Type
FROM cdw_sapp_creditcard
WHERE cdw_sapp_creditcard.credit_card_no = (
   SELECT cdw_sapp_creditcard.credit_card_no
   FROM cdw_sapp_customer 
   WHERE cdw_sapp_creditcard.cust_ssn = cdw_sapp_customer.ssn
);

SELECT c.first_name as 'First Name', c.last_name as 'Last Name'
FROM cdw_sapp_customer c
WHERE c.ssn = ( SELECT distinct cust_ssn FROM cdw_sapp_creditcard where credit_card_no =4210653397569102);

select c.ssn, cc.transaction_id, cc.transaction_type 
from cdw_sapp_creditcard cc
join cdw_sapp_customer c
on c.ssn = cc.cust_ssn
where (cc.year between 2017 and 2018) and (cc.month between 2 and 7)
and (cc.day between 5 and 10)
order by year, month desc;

select cc.year as year, cc.month as month, cc.day as day, c.ssn as ssn, 
cc.transaction_id as id, cc.transaction_type as Type
from cdw_sapp_creditcard cc
join cdw_sapp_customer c
on c.ssn = cc.cust_ssn
where c.ssn = ? and (cc.month between 2 and 5)
and (cc.day between 5 and 10)
order by month, day desc

select cc.year as year, cc.month as month, cc.day as day, c.ssn as ssn, c.first_name, c.last_name,
cc.transaction_value as value,
cc.transaction_id as id, cc.transaction_type as Type
from cdw_sapp_creditcard cc
join cdw_sapp_customer c
on c.ssn = cc.cust_ssn
where c.ssn = 123459155 and (cc.month between 1 and 2)
and (cc.day between 3 and 4)
order by month, day desc;