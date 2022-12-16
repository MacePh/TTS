	--************************PROMPT# 7*********************************************
    	--Use a TRANSACTION/ROLLBACK window to DELETE everything from the User table.
--end TRANSACTION;
BEGIN TRANSACTION;

  DELETE FROM User; 

  SELECT * FROM User; 
  --this SELECT is here to help you see what would have happened in the delete statement.
  --You don't need it in order to delete. 

ROLLBACK;