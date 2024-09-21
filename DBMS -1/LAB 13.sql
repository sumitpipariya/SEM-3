CREATE TABLE City (
    CityID INT PRIMARY KEY,
    Name VARCHAR(100) UNIQUE,
    Pincode INT NOT NULL,
    Remarks VARCHAR(255)
);

CREATE TABLE Village (
    VID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    CityID INT,
    FOREIGN KEY (CityID) REFERENCES City(CityID)
);

INSERT INTO City (CityID, Name, Pincode, Remarks) VALUES
(1, 'Rajkot', 360005, 'Good'),
(2, 'Surat', 335009, 'Very Good'),
(3, 'Baroda', 390001, 'Awesome'),
(4, 'Jamnagar', 361003, 'Smart'),
(5, 'Junagadh', 362229, 'Historic'),
(6, 'Morvi', 363641, 'Ceramic');

INSERT INTO Village (VID, Name, CityID) VALUES
(101, 'Raiya', 1),
(102, 'Madhapar', 1),
(103, 'Dodka', 3),
(104, 'Falla', 4),
(105, 'Bhesan', 5),
(106, 'Dhoraji', 5);


--1. Display all the villages of Rajkot city. 
SELECT Village.Name
FROM City JOIN Village
ON City.CityID = Village.CityID
WHERE City.Name = 'RAJKOT'

--2. Display city along with their villages & pin code. 
SELECT City.Name,
		Village.Name,
		City.Pincode
FROM City JOIN Village
ON City.CityID = Village.CityID

--3. Display the city having more than one village. 
SELECT COUNT(City.CityID) AS MORE_THEN_VILLEGES,
		City.Name	
FROM City JOIN Village
ON City.CityID = Village.CityID
GROUP BY CITY.NAME
HAVING COUNT(City.CityID)>1

--4. Display the city having no village. 
SELECT City.Name
FROM City
LEFT JOIN Village 
ON City.CityID = Village.CityID
WHERE Village.VID IS NULL;

--5. Count the total number of villages in each city. 
SELECT City.Name,
		COUNT(City.CityID) AS COUNT_VILLEGES
FROM City JOIN Village
ON City.CityID = Village.CityID
GROUP BY CITY.NAME

--6. Count the number of cities having more than one village. 
SELECT COUNT(*)
FROM (
  SELECT CityID
  FROM Village
  GROUP BY CityID
  HAVING COUNT(*) > 1) AS MORE_VILLEGES;


CREATE TABLE STU_MASTER(
	Rno INT,
	Name VARCHAR(10),
	Branch VARCHAR(10),
	SPI DECIMAL(3,2),
	Bklog INT
);

INSERT INTO STU_MASTER(Rno,Name,Branch,SPI,Bklog)
VALUES
	(101, 'Raju', 'CE', 8.80, 0),
	(102, 'Amit', 'CE', 2.20, 3 ),
	(103, 'Sanjay', 'ME', 1.50, 6),
	(104, 'Neha', 'EC', 7.65, 0 ),
	(105, 'Meera', 'EE', 5.52, 2),
	(106, 'Mahesh',DEFAULT, 4.50, 3);

--4. Try to update SPI of Raju from 8.80 to 12.
UPDATE STU_MASTER
SET SPI = 12.5
WHERE NAME = 'RAJU'

--5. Try to update Bklog of Neha from 0 to -1.
UPDATE STU_MASTER
SET Bklog = -1
WHERE NAME = 'Neha'
