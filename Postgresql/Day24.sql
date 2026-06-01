SELECT
    Staff_Name,
    LPAD(Staff_sal::TEXT,15,'$') AS Salary
FROM Staff_Master;

SELECT
    Student_name,
    TO_CHAR(Student_dob,'Month, DD YYYY') AS Date_Of_Birth
FROM Student_Master
WHERE EXTRACT(DOW FROM Student_dob) IN (0,6);

SELECT
    Staff_Name,
    ROUND(
            EXTRACT(YEAR FROM AGE(CURRENT_DATE,HireDate))*12
                +
            EXTRACT(MONTH FROM AGE(CURRENT_DATE,HireDate))
    ) AS "Months Worked"
FROM Staff_Master
ORDER BY "Months Worked";