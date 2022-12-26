--************************PROMPT# 2*********************************************
	--Starting from the User table, 
    --get the name of every User and that user's 
    --favorite song, genre, artist, and album. 
    --This will involve some JOINs!
SELECT User.name AS User_Name, 
songs.name as Favorite_Song, 
genres.name AS Genre, 
artists.name AS Artist_Name, 
albums.name AS Album_Name
From (((((
	INNER JOIN User on Favorite.UserID = User.UserID)
	INNER JOIN songs on Favorite.SongID = songs.id)
	INNER JOIN genres on Favorite.GenreID = genres.id)
	INNER JOIN artists on Favorite.ArtistID = artists.id)
	INNER JOIN albums on Favorite.AlbumID = albums.id);