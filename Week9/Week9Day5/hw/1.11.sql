CREATE TEMPORARY TABLE MusicNames 
(
  MusicNameID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  ArtistName VARCHAR NOT NULL,
  SongName VARCHAR NOT NULL,
  AlbumName VARCHAR NOT NULL,
  GenreName VARCHAR NOT NULL
);

INSERT INTO MusicNames 
(
  ArtistName,
  SongName,
  AlbumName,
  GenreName 
)
SELECT 
    art.name,
   	s.name,
    al.name,
    g.name
FROM albums al
INNER JOIN songs s ON al.id = s.album_id 
INNER JOIN genres g ON al.genre_id = g.id 
INNER JOIN artists art ON al.artist_id = art.id; 
--Notice that I did not use 'AS' before the alias. 
--Yes, that is allowed!

SELECT * 
FROM MusicNames mn
INNER JOIN genres ON mn.GenreName = genres.name; 
--select whatever you want!