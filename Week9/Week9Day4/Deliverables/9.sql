--************************PROMPT# 9*********************************************
	--Use a TRANSACTION/ROLLBACK window to DELETE everything from the Favorite table WHERE the FavoriteID is odd, 
    --or even but greater than 10Put "SELECT * FROM Favorite;" in the window to make sure you delete only those records you should!
--end TRANSACTION;
BEGIN TRANSACTION;
  DELETE from Favorite
  	where favoriteid % 2 <> 0
	or favoriteid % 2 = 0 and favoriteid > 10;

ROLLBACK;