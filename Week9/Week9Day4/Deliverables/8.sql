--************************PROMPT# 8*********************************************
	--For each user in the User table, add a record to the Favorite table, but only INSERT for UserID (the FK), and CreatedAt.
INSERT INTO Favorite (UserID, CreatedAt)
SELECT userid, CURRENT_TIMESTAMP from user
WHERE userid > 0;
