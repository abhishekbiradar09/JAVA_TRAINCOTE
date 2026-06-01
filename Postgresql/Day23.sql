INSERT INTO Staff_Master VALUES
    (104,'Anands',4,20,'2000-05-12','1978-02-10','Mumbai',101,25000);

INSERT INTO Staff_Master VALUES
    (105,'Nitin',2,30,'2001-07-18','1980-04-22','Delhi',102,18000);

INSERT INTO Staff_Master VALUES
    (106,'A_N_S',3,40,'2002-08-25','1981-09-15','Chennai',NULL,22000);

SELECT *
FROM Staff_Master
WHERE
    (Staff_Name LIKE 'A%S')
   OR
    (Staff_Name LIKE '_N%N')
   OR
    (Staff_Name LIKE '__N%S');

SELECT Staff_Name
FROM Staff_Master
WHERE Staff_Name LIKE '%\_%' ESCAPE '\';