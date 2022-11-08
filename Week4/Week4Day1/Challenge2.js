let players = [
	{firstName: 'Cam', lastName: 'Newton', position: 'QB', touchdowns: 32},
	{firstName: 'Derek', lastName: 'Anderson', position: 'QB', touchdowns: 0},
	{firstName: 'Jonathan', lastName: 'Stewart', position: 'RB', touchdowns: 12},
	{firstName: 'Mike', lastName: 'Tolbert', position: 'RB', touchdowns: 8},
	{firstName: 'Fozzy', lastName: 'Whittaker', position: 'RB', touchdowns: 3},
	{firstName: 'Ted', lastName: 'Ginn', position: 'WR', touchdowns: 9},
	{firstName: 'Devin', lastName: 'Funchess', position: 'WR', touchdowns: 2}
];

// Find a player with the name 'Mike'
// Get an array of all players with position 'RB'
// Get an array of all the players lastNames
// Get an array of the full names of all the running backs with more than 5 touchdowns
// Get the number of touchdowns scored by Running backs

// Find a player with the name 'Mike'
	
console.log(players.find(function(player){
	return player.firstName === 'Mike'
}));
// Get an array of all players with position 'RB'
	
players.filter(function(player){
	return player.position === 'RB';
});
// Get an array of all the players lastNames
	
players.map(function(player){
	return player.lastName;
});
// Get an array of the full names of all the running backs with more than 5 touchdowns
players.filter(function(player){
    return player.touchdowns > 5 && player.position == 'RB';
}).map(function(player){
    return `${player.firstName} ${player.lastName}`;
});
// Get the number of touchdowns scored by Running backs
players.filter(function(player){
    return player.position =='RB';
}).reduce(function(total, player){
    total += player.touchdowns;
},0);

