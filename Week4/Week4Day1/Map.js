// Map
// The Array's Map function lets you iterate 
// over an array and produce another array with 
// a new value for each item, essentially transforming
//  each element in the array. Note that this is a 1:1 transformation, 
//  so each element that existed in the original array will 
//  produce some value in the new array.
let students = [
	{firstName: 'Cam', lastName: 'Newton'},
	{firstName: 'Ted', lastName: 'Ginn'},
	{firstName: 'Greg', lastName: 'Olsen'}
]

let fullNames = students.map(function(student){
	return `${student.firstName} ${student.lastName}`;
})

fullNames === ["Cam Newton", "Ted Ginn", "Greg Olsen"]

[                                             [
    {firstName: 'Cam', lastName: 'Newton'},       "Cam Newton"
    {firstName: 'Ted', lastName: 'Ginn'},   ==>   "Ted Ginn"
    {firstName: 'Greg', lastName: 'Olsen'}        "Greg Olsen"
  ]                                             ]