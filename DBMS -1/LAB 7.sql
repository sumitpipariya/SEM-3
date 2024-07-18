CREATE TABLE EMP(
	EID INT,
	ENAME VARCHAR(50),
	DEPARTMENT VARCHAR(50),
	SALARY DECIMAL(10,0),
	JOININGDATE DATETIME,
	CITY VARCHAR(50)
);

INSERT INTO EMP
VALUES
(101, 'Rahul', 'Admin',56000, '1-Jan-90', 'Rajkot'),
(102, 'Hardik', 'IT', 18000, '25-Sep-90', 'Ahmedabad'),
(103, 'Bhavin', 'HR', 25000, '14-May-91', 'Baroda'),
(104, 'Bhoomi', 'Admin', 39000, '8-Feb-91', 'Rajkot'),
(105, 'Rohit', 'IT', 17000, '23-Jul-90', 'Jamnagar'),
(106, 'Priya', 'IT', 9000, '18-Oct-90', 'Ahmedabad'),
(107, 'Bhoomi', 'HR' ,34000, '25-Dec-91', 'Rajkot')

SELECT * FROM EMP

------1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.-----

--2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal, respectively.--
--9. Count total number of cities of employee without duplication.--