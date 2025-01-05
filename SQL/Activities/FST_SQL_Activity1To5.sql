REM   Script: Activity_1-5
REM   Activity 1, 2, 3, 4 & 5 scripts

create table salesman (salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

Desc salesman


INSERT ALL 
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman where salesman_city = 'Paris';

SELECT salesman_id, salesman_city FROM salesman where salesman_name = 'Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 where salesman_city = 'Rome';

UPDATE salesman SET grade=300 where salesman_name = 'Nail Knite';

UPDATE salesman SET salesman_name='Pierre' where salesman_name = 'McLyon';

SELECT * FROM salesman;

