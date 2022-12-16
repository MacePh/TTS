--************************PROMPT# 4*********************************************
			--SELECT everything from the songs table whose id numbers are even and greater than 50, or odd and less than ten.
select *
from SONGS
where id > 50 and id % 2 = 0
or id % 2 <> 0 and id < 11
ORDER BY ID ASC;