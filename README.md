**Technical Assessment Solutions** :

**Tools & IDE Used**

Java programs: Developed and tested using **IntelliJ IDEA**

SQL queries: Tested using online SQL **fiddle** editor

This repository contains my solutions for the technical assessment tasks, covering:
Algorithmic Problem Solving
Custom Sorting Logic
SQL Data Aggregation & Joins

All solutions are implemented with clean structure, readable code, and proper documentation.

**Problem 1**: A palindrome is a sequence that reads the same backward as forward. Write a function to find the biggest palindrome by multiplying two 3-digit numbers



**Approach**
Iterate from 999 down to 100.
Multiply each pair.
Check if the product is a palindrome.
Track and return the maximum palindrome found.

**Final Sorted Output**
Largest Palindrome: 906609
Factors: 993 x 913

Key Concepts
Nested loops optimization
String reversal / numeric palindrome check
Time complexity considerations


**Problem 2**: Sort the array below by the longest word first, then by alphabetical order:
(“apple”, “mango”, “pomegranate”, “pear”, “avocado”, “pumpkin”)

**Approach**
Use custom comparator:
Compare by length (descending)
If equal → compare lexicographically

**Final Sorted Output**

pomegranate

avocado

pumpkin
apple

mango

pear

Key Concepts
Comparator logic
Multi-condition sorting
Clean functional implementation

**Problem 3**: Write a query to get the total amount spent for each company
🔎 Database Tables
Purchase_Order
Purchase_Detail
Product_Detail
🎯 Objective
Write a SQL query to calculate the total amount spent for each company.
💡 Solution Strategy
Join all three tables
Multiply Quantity × Cost
Group by company
Use SUM aggregation

**SQL Query**

SELECT 
    po.Company,
    SUM(pd.Quantity * pr.Cost) AS Total_Amount_Spent
FROM Purchase_Order po
JOIN Purchase_Detail pd 
    ON po.ID = pd.ID
JOIN Product_Detail pr 
    ON pd.Product = pr.Product
GROUP BY po.Company;

🚀 Key Concepts
INNER JOIN
GROUP BY
Aggregate functions (SUM)
Data normalization understanding

🛠️ Project Structure
├── src/
│   ├── LargestPalindrome.java
│   ├── LengthAlphaSorter.java
│
├── sql/
│   └── total_amount_spent.sql
│
└── README.md

**👨‍💻 Author : 
Abshar Rafique |
Full Stack Developer  |
MySQL | Java | Problem Solving | Database Design**
