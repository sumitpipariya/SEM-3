CREATE TABLE CRICKET(
	NAME VARCHAR(50),
	CITY VARCHAR(50),
	AGE INT
);

INSERT INTO CRICKET
VALUES ('Sachin Tendulkar', 'Mumbai',30)

INSERT INTO CRICKET
VALUES ('Rahul Dravid', 'Bombay',35)

INSERT INTO CRICKET
VALUES ('M. S. Dhoni', 'Jharkhand ',31)

INSERT INTO CRICKET
VALUES ('Suresh Raina', 'Gujarat',30)

SELECT * INTO Worldcup FROM CRICKET
SELECT * FROM WORLDCUP 

SELECT * INTO T20 FROM CRICKET WHERE 1=0
SELECT * FROM T20

SELECT * INTO IPL FROM CRICKET WHERE 1=0
SELECT * FROM IPL


CREATE TABLE EMPLOYEE(
	NAME VARCHAR(50),
	CITY VARCHAR(50),
	AGE INT
);

INSERT INTO EMPLOYEE
VALUES('Jay Patel','Rajkot',30)

INSERT INTO EMPLOYEE
VALUES('Rahul Dave','Baroda',35)

INSERT INTO EMPLOYEE
VALUES('Jeet Patel ','Surat',31)

INSERT INTO EMPLOYEE
VALUES('Vijay Raval','Rajkot',30)

SELECT * FROM EMPLOYEE

SELECT *INTO  Employee_detail FROM EMPLOYEE

SELECT * INTO EMPLOYEE_DATA FROM EMPLOYEE WHERE 1=0
SELECT * FROM EMPLOYEE_DATA

SELECT * INTO EMPLOYEE_INFO FROM EMPLOYEE WHERE 1=0
SELECT * FROM EMPLOYEE_INFO

INSERT INTO EMPLOYEE_INFO 
SELECT * FROM EMPLOYEE 
WHERE CITY = 'RAJKOT'

SELECT * FROM EMPLOYEE_INFO

INSERT INTO EMPLOYEE_INFO
SELECT * FROM EMPLOYEE
WHERE AGE>32

SELECT * FROM EMPLOYEE_INFO


----------UPADTE OPERATION-----------

UPDATE DEPOSIT SET AMOUNT = 5000
WHERE AMOUNT = 3000
SELECT * FROM DEPOSIT

UPDATE BORROW SET BNAME = 'C.G. ROAD' 
WHERE CNAME = 'ANIL'

UPDATE DEPOSIT SET ACTNO = 111 ,AMOUNT = 5000
WHERE CNAME = 'SANDIP'

UPDATE DEPOSIT SET AMOUNT = 7000
WHERE CNAME = 'KRANTI'

UPDATE BRANCH SET BNAME = 'ANDHERI WEST'
WHERE BNAME = 'ANDHERI'

UPDATE DEPOSIT SET CNAME = 'NEHRU PLACE'
WHERE CNAME = 'MEHUL'

UPDATE DEPOSIT SET AMOUNT = 5000
WHERE ACTNO BETWEEN 103 AND 107

UPDATE DEPOSIT SET ADATE =  '1-4-95'
WHERE CNAME = 'ANIL'
SELECT * FROM DEPOSIT

UPDATE DEPOSIT SET AMOUNT = 10000
WHERE CNAME = 'MINU'

UPDATE DEPOSIT SET AMOUNT = 5000, ADATE = '1-4-96'
WHERE CNAME = 'PRAMOD'
