# Simple Student Information System using Java Swing and MySQL (CRUD)
## Computer Programming 2 : Final Project
### How to Run:
1. Run `git clone https://github.com/Ryanali23/ComputerProgramming2-Finals.git`
2. After cloning, Run your Netbeans 8.2 and open the project.
3. Download the [MySQL Connector ][0] then right-click `Library and add new JAR`.
4. Select your MySQL Connector directory.
5. Enjoy :heart:

[0]: https://dev.mysql.com/downloads/connector/j/5.1.html "MySQL Connector for JAVA"

## Resources 
- [RS2XML for Easy jTable Population.][1]

[1]: https://sourceforge.net/projects/finalangelsanddemons/ "RS2XML can be downloader from sourceforge.net"
- [jDateChooser][2]

[2]: http://plugins.netbeans.org/plugin/658/jdatechooser-1-2 "DatePicker for netbeans."
- [MySQL Connector ][0]

## Database Schema 
The system has mostly used varchar() for primary key as data type and int auto-increment. It has two tables that are for users and students. Since this is a simple project , I have not spent time normalizing the tables and there is actually nothing  to normalize. I want it to become as simple as possible. I spent my time more on the abstraction of system than normalizing.  Assuming you have already a database, The following schema is : 
###### User table
```sql
CREATE TABLE Users (
id int(6) AUTO_INCREMENT PRIMARY KEY,
username varchar(30) NOT NULL,
userPassword varchar(30) NOT NULL
)
```
###### Student table
```sql
CREATE TABLE Students(
studentId INT(6) AUTO_INCREMENT PRIMARY KEY,
studentFirstName VARCHAR(30) NOT NULL,
studentLastname VARCHAR(30) NOT NULL,
studentGender VARCHAR(30) NOT NULL,
studentGrade VARCHAR(30) NOT NULL,
Birthday VARCHAR(30) NOT NULL
)
```







