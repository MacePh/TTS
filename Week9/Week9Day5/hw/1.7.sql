SELECT 
    artists.name AS Artist,
    songs.name AS Song,
    songs.length AS Minutes,
	albums.name AS Album,
    albums.label AS Label,
    albums.year_released AS Released
FROM albums
INNER JOIN songs ON albums.id = songs.album_id 
INNER JOIN artists ON albums.artist_id = artists.id
GROUP BY albums.name
ORDER BY artists.name;