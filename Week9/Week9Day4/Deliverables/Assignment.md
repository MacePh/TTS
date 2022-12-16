##Submit: Databases OR Homework/Challenge

Before we dive into working with a ton of SQL it's best to get a grasp on Databases, their structure, and how they should be built.


#####Read these resources to get familiar with all of the above:
 - https://en.wikipedia.org/wiki/Database_normalization
- https://www.essentialsql.com/get-ready-to-learn-sql-database-normalization-explained-in-simple-english/
- https://www.htmlgoodies.com/primers/database/article.php/3478051
- https://www.codeproject.com/Articles/878359/Data-modelling-using-ERD-with-Crow-Foot-Notation

#####For understanding dialect:
-    https://dev.mysql.com/doc/
-   https://www.sqlite.org/lang.html

Do Option 1 or Option 2:

##Option 1 :
1. Write down 5 aspects of databases and SQL that you think are important to software and applications.
2. Write down 5 questions you have on databases and SQL (stay away from syntax at the moment!).

###OR
##Option 2 :
1. SELECT everything from a table
2.  SELECT exactly one column from a table. 
3.  SELECT more than one but not all columns from a table
4.  SELECT everything from the songs table whose id numbers are even and greater than 50, or odd and less than ten.
5.  INSERT ten new records into the User table. They can be real or fictional individuals.
6.  UPDATE the User table and change some names. 
       - When you UPDATE, do not forget to put CURRENT_TIMESTAMP into UpdatedAt. That way, you always know when the last update was.
7. Use a TRANSACTION/ROLLBACK window to DELETE everything from the User table.
8.  For each user in the User table, add a record to the Favorite table, but only INSERT for UserID (the FK), and CreatedAt.
9.   Use a TRANSACTION/ROLLBACK window to DELETE everything from the Favorite table WHERE the FavoriteID is odd, or even but greater than 10Put "SELECT * FROM Favorite;" in the window to make sure you delete only those records you should!


