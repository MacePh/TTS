// // Reduce
// Sometimes you want to calculate a single value based 
// on all the items in an array. The Array's Reduce function lets you 
// iterate over an array and calculate a value.

let students = [
	{name: 'Cam Newton', assignmentsCompleted: 6},
	{name: 'Ted Ginn', assignmentsCompleted: 10},
	{name: 'Greg Olsen', assignmentsCompleted: 8}
]

let totalAssignments = students.reduce(function(sum,current){
	return sum + current.assignmentsCompleted;
}, 0);

totalAssignments === 24;