SELECT 
	albums.name,
	songSubSelect.name, 
    songSubSelect.genres,
	songSubSelect.length AS Minutes 
FROM albums 
INNER JOIN 
(
	SELECT * FROM songs
) songSubSelect ON albums.id = songSubSelect.album_id;