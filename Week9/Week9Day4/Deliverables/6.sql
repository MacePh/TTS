--************************PROMPT# 6*********************************************
	--UPDATE the User table and change some names.
		--When you UPDATE, do not forget to put CURRENT_TIMESTAMP into UpdatedAt. That way, you always know when the last update was.
UPDATE User 
SET FirstName = 'Jordan',
	LastName = 'Micheals',
	UpdatedAt = CURRENT_TIMESTAMP
WHERE UserID = 2
