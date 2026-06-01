INSERT INTO Department_Master VALUES
    (10,'HR');

INSERT INTO Department_Master VALUES
    (20,'Finance');

INSERT INTO Department_Master VALUES
    (30,'IT');

INSERT INTO Department_Master VALUES
    (40,'Sales');

INSERT INTO Designation_Master VALUES
    (1,'Manager');

INSERT INTO Designation_Master VALUES
    (2,'Developer');

INSERT INTO Designation_Master VALUES
    (3,'Analyst');

INSERT INTO Designation_Master VALUES
    (4,'Tester');

CREATE TABLE Book_Transaction (
                                  Student_Code INT,
                                  Staff_code INT,
                                  Book_Code INT,
                                  Issue_Date DATE,
                                  Expected_Return_Date DATE
);

INSERT INTO Book_Transaction VALUES
    (1,NULL,1,'2026-05-01',CURRENT_DATE);

INSERT INTO Book_Transaction VALUES
    (NULL,101,2,CURRENT_DATE - INTERVAL '10 days',CURRENT_DATE + INTERVAL '5 days');

SELECT
    s.Staff_Name,
    s.Dept_code,
    d.Dept_name,
    s.Staff_sal
FROM Staff_Master s
         JOIN Department_Master d
              ON s.Dept_code = d.Dept_Code
WHERE s.Staff_sal > 20000;

SELECT
    s.Staff_code AS StaffNo,
    s.Staff_Name AS Staff,
    s.Mgr_code AS MgrNo,
    m.Staff_Name AS Manager
FROM Staff_Master s
         LEFT JOIN Staff_Master m
                   ON s.Mgr_code = m.Staff_code;

SELECT
    sm.Student_Code,
    sm.Student_name,
    d.Dept_name,
    mk.Subject1,
    mk.Subject2,
    mk.Subject3
FROM Student_Master sm
         JOIN Student_Marks mk
              ON sm.Student_Code = mk.Student_Code
         JOIN Department_Master d
              ON sm.Dept_Code = d.Dept_Code
WHERE sm.Dept_Code IN (10,20)
  AND mk.Subject1 >= 60
  AND mk.Subject2 >= 60
  AND mk.Subject3 >= 60;

SELECT
    sm.Student_Code,
    sm.Student_name,
    bm.Book_Code,
    bm.Book_Name
FROM Student_Master sm
         JOIN Book_Transaction bt
              ON sm.Student_Code = bt.Student_Code
         JOIN Book_Master bm
              ON bt.Book_Code = bm.Book_Code
WHERE bt.Expected_Return_Date = CURRENT_DATE;

SELECT
    s.Staff_code,
    s.Staff_Name,
    d.Dept_name,
    dg.Design_name,
    bm.Book_Code,
    bm.Book_Name,
    bt.Issue_Date
FROM Staff_Master s
         JOIN Department_Master d
              ON s.Dept_code = d.Dept_Code
         JOIN Designation_Master dg
              ON s.Design_code = dg.Design_code
         JOIN Book_Transaction bt
              ON s.Staff_code = bt.Staff_code
         JOIN Book_Master bm
              ON bt.Book_Code = bm.Book_Code
WHERE bt.Issue_Date >= CURRENT_DATE - INTERVAL '30 days';