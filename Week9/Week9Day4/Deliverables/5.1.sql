--************************PROMPT# 5.1*********************************************
			--Creating User and Favorite Tables
CREATE TABLE User
(
	UserID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 
	FullName VARCHAR NOT NULL,
	Birthplace VARCHAR NOT NULL,
	CreatedAt DATETIME NOT NULL,
	UpdatedAt DATETIME NULL
);

CREATE TABLE Favorite 
(
	FavoriteID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 
	UserID INTEGER NOT NULL,
	ArtistID INTEGER, 
	AlbumID INTEGER,
	SongID INTEGER,
	GenreID INTEGER,
	CreatedAt DATETIME NOT NULL,
	UpdatedAt DATETIME NULL,
	FOREIGN KEY (UserID) REFERENCES User (UserID),
	FOREIGN KEY (ArtistID) REFERENCES artists (id),
	FOREIGN KEY (AlbumID) REFERENCES albums (id),
	FOREIGN KEY (SongID) REFERENCES songs (id),
	FOREIGN KEY (GenreID) REFERENCES genres (id)
);
-- CREATE TABLE User
-- (
-- 	UserID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 
-- 	FirstName VARCHAR NOT NULL,
-- 	LastName VARCHAR NOT NULL,
-- 	Birthplace VARCHAR NOT NULL,
-- 	CreatedAt DATETIME NOT NULL,
-- 	UpdatedAt DATETIME NULL
-- );

-- CREATE TABLE Favorite 
-- (
-- 	FavoriteID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 
-- 	UserID INTEGER NOT NULL,
-- 	ArtistID INTEGER, 
-- 	AlbumID INTEGER,
-- 	SongID INTEGER,
-- 	GenreID INTEGER,
-- 	CreatedAt DATETIME NOT NULL,
-- 	UpdatedAt DATETIME NULL,
-- 	FOREIGN KEY (UserID) REFERENCES User (UserID),
-- 	FOREIGN KEY (ArtistID) REFERENCES artists (id),
-- 	FOREIGN KEY (AlbumID) REFERENCES albums (id),
-- 	FOREIGN KEY (SongID) REFERENCES songs (id),
-- 	FOREIGN KEY (GenreID) REFERENCES genres (id)
-- );