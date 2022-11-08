// FIND//
// Find works just like filter, except instead of returning 
// an array of values for which the function returns true, 
// it returns only the first element of the array that outputs true.



let students = [
	{name: 'John Lennon', average: 90},
	{name: 'Ringo Starr', average: 58},
	{name: 'Paul McCartney', average: 82}
];

let passingStudents = students.find(function(student){
	return student.average > 50;
});

passingStudents === [
	{name: 'John Lennon', average: 90}
];