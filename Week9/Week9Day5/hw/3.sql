--************************PROMPT# 3*********************************************
	--Starting from the albums table, 
    --SELECT every album name 
    --and its respective ID that are longer than 5 minutes 
    --(this will involve a JOIN).

SELECT albums.id,
albums.name,
songs.length
FROM songs
INNER JOIN albums on songs.album_id = album.id
WHERE songs.length >5;