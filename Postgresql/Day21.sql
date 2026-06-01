INSERT INTO Student_Master VALUES
    (3,'Anil',10,'1983-03-20','Mumbai');

INSERT INTO Student_Master VALUES
    (4,'Kiran',40,'1982-01-25','Delhi');

CREATE TABLE Book_Master (
                             Book_Code INT,
                             Book_Name VARCHAR(50),
                             Book_pub_year INT,
                             Book_pub_author VARCHAR(50)
);

INSERT INTO Book_Master VALUES
    (1,'COMPLETE JAVA',2002,'James');

INSERT INTO Book_Master VALUES
    (2,'C & DATA',2003,'Ravi');

INSERT INTO Book_Master VALUES
    (3,'NETWORKS',2005,'John');

SELECT Staff_code,
       Staff_Name,
       Dept_code
FROM Staff_Master
WHERE EXTRACT(YEAR FROM AGE(HireDate)) >= 18
ORDER BY EXTRACT(YEAR FROM AGE(HireDate));

SELECT Staff_Name,
       Design_code,
       Staff_sal
FROM Staff_Master
WHERE Dept_code IN (10,30);

SELECT Student_name || ', ' || Dept_Code AS "Student Info"
FROM Student_Master;

SELECT *
FROM Staff_Master
WHERE Mgr_code IS NULL;

SELECT Student_name,
       Dept_Code,
       Student_dob
FROM Student_Master
WHERE Student_dob BETWEEN '1981-01-01' AND '1983-03-31'
ORDER BY Student_dob ASC;

SELECT *
FROM Book_Master
WHERE Book_pub_year BETWEEN 2001 AND 2004
   OR Book_Name LIKE '%&%';

SELECT *
FROM Book_Master
WHERE Book_Name LIKE '%COMP%';