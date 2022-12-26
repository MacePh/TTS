--You can use multiple JOIN clauses in the same query:

SELECT 
    artists.name AS Artist,
    artists.id AS ArtistID,
    songs.name AS Song,
    songs.id AS SongID,
    --genres.name AS Genre,
     genres.ID AS genreid,
    songs.length AS Minutes,
	albums.name AS Album,
    albums.label AS Label,
    albums.year_released AS Released
FROM albums
INNER JOIN songs ON albums.id = songs.album_id 
INNER JOIN artists ON albums.artist_id = artists.id
GROUP BY albums.name
ORDER BY artists.name;