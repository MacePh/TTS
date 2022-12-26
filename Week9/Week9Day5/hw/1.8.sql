SELECT 
	albums.name as album,
	songs.name as song,
	songs.length AS Minutes 
FROM albums 
LEFT JOIN songs ON albums.id = songs.album_id
ORDER BY albums.name, Minutes;