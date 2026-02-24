CREATE DATABASE IF NOT EXISTS purchase_report;
USE purchase_report;

CREATE TABLE Purchase_Order (
    ID INT PRIMARY KEY,
    User VARCHAR(100) NOT NULL,
    Company VARCHAR(150) NOT NULL
);

CREATE TABLE Purchase_Detail (
    ID INT,
    Product VARCHAR(100),
    Quantity INT NOT NULL,
    FOREIGN KEY (ID) REFERENCES Purchase_Order(ID)
);

CREATE TABLE Product_Detail (
    Product VARCHAR(100) PRIMARY KEY,
    Cost DECIMAL(10,2) NOT NULL
);
