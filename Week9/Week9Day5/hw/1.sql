--************************PROMPT# 1*********************************************
	--UPDATE the favorite table (don't forget to set UpdatedAt to CURRENT_TIMESTAMP!) 
    --so that every record but two have a favorite song 
    --(SongID), genre (GenreID), artist (ArtistID), and album (AlbumID).
UPDATE Favorite 
SET SongID = 1,
GenreID = 1,
ArtistID = 1,
AlbumID = 1,
UpdatedAt = CURRENT_TIMESTAMP
WHERE UserID = 1;

UPDATE Favorite  
SET SongID = 2,
GenreID = 2,
ArtistID = 2,
AlbumID = 2,
UpdatedAt = CURRENT_TIMESTAMP
WHERE UserID = 2;

UPDATE Favorite  
SET SongID = 3,
GenreID = 3,
ArtistID = 3,
AlbumID = 3,
UpdatedAt = CURRENT_TIMESTAMP
WHERE UserID = 3;
 
UPDATE Favorite  
SET SongID = 4,
GenreID = 4,
ArtistID = 4,
AlbumID = 4,
UpdatedAt = CURRENT_TIMESTAMP
WHERE UserID = 4;

UPDATE Favorite  
SET SongID = 5,
GenreID = 5,
ArtistID = 5,
AlbumID = 5,
UpdatedAt = CURRENT_TIMESTAMP
WHERE UserID = 5;
 
UPDATE Favorite  
SET SongID = 6,
GenreID = 6,
ArtistID = 6,
AlbumID = 6,
 UpdatedAt = CURRENT_TIMESTAMP
 WHERE UserID = 6;
 
UPDATE Favorite  
SET SongID = 7,
GenreID = 7,
ArtistID = 7,
AlbumID = 7,
 UpdatedAt = CURRENT_TIMESTAMP
 WHERE UserID = 7;
 
UPDATE Favorite  
SET SongID = 8,
GenreID = 8,
ArtistID = 8,
AlbumID = 8,
 UpdatedAt = CURRENT_TIMESTAMP
 WHERE UserID = 8;