CREATE TABLE Customer (
                          Cust_id INT,
                          Cust_name VARCHAR(50),
                          Cust_address VARCHAR(100),
                          Gender CHAR(1),
                          Age INT,
                          Phone VARCHAR(20),
                          Balance NUMERIC(10,2)
);

INSERT INTO Customer VALUES
    (6000,'John','#115 Chicago','M',25,'7878776',10000);

INSERT INTO Customer VALUES
    (6001,'Jack','#116 France','M',25,'434524',20000);

INSERT INTO Customer VALUES
    (6002,'James','#114 New York','M',45,'431525',15000.50);

SAVEPOINT SP1;

INSERT INTO Customer VALUES
    (6003,'John','#114 Chicago','M',45,'439525',19000.60);

ROLLBACK TO SP1;

SELECT * FROM Customer;

COMMIT;