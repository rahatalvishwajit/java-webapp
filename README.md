# Java Web App
This project contains implementation of a web app where a user friendly UI is created to receive required data from the user. At the back end,  data will be updated on the database if any of the data is updated.

The project focuses on Java JDBC API and java servlet, and HTML. CRUD operations are performed on data using Java code and the changes are reflected on to the database.

The project implements a programmed solution to compute average assignment rating and overall rating for each student and/or subjects to measure effectiveness of learning.

There are multiple subjects and each subject has its own assignment categories - test, lab, project and quiz. Each student can give similar assignment different times. So each time when similar assignment category is entered for a student for a similar subject, the program automatically calculates the assignment number and appends at the end of the name of the category (For eg. test_1, test_2, test_3 and so on).

Whenever a particular assignment category is removed for a student, its particular data is deleted and overall score is updated for that particular student.

# To exectute code successfully.
MySQL database is used in this project. Its dependecy is written into the pom.xml file. If you want to use another database, provide relevant dependency in pom.xml file, and respective driver class, url, username and password for database in JDBCConnection.java file. Apache Tomcat port number is to be set to 8081.

Table Queries.txt contains the SQL queries to create database with different required tables.

App.java file contains main method. To run the program execute Index.html file.

# Home Page:

![Index](https://user-images.githubusercontent.com/73383343/136646974-6baf62ed-8dca-4cb4-aa7b-f75e264d957d.JPG)

# Add Student Information:

![Student Information](https://user-images.githubusercontent.com/73383343/136647014-27c96bdd-3a1f-4656-89ac-21d59f9aedd8.JPG)

# Add New Student Data:

![New Student Data](https://user-images.githubusercontent.com/73383343/136647039-4e3e254e-2c09-44e7-9a6d-f16adea36df2.JPG)

# View Student Data:

![View Data](https://user-images.githubusercontent.com/73383343/136647058-7d3eabf5-e9f6-49a4-a849-886a80f1936a.JPG)
