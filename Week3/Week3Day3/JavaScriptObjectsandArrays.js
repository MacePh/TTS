let teachers = ['Shane', 'Zack'];
console.log(teachers[0]) //'Shane'
// Get Array Length
teachers.length;  //2
// Push and Pop
let teachers = ['Assaf', 'Shane'];
teachers.push('Zack'); //['Assaf', 'Shane', 'Zack']
let teacher1 = teachers.pop(); //teacher1 == 'Zack', teachers == ['Assaf', 'Shane']
// Shift and Unshift (from the Front)
let teachers = ['Assaf', 'Shane'];
teachers.unshift('Zack'); // ['Zack', Assaf', 'Shane']
let teacher = teachers.shift(); //teacher == 'Zack', teachers = ['Assaf', Shane']

// You can also predefine the index in where you want to add or edit an item.
// teachers[4] = 'James Taylor'; // ['Assaf', 'Shane', 'Zack', undefined, 'James Taylor'];
teachers[4] = 'Billy Joel'; // ['Assaf', 'Shane', 'Zack', undefined, 'Billy Joel'];

// Finding an item
let a = [10,11,20];
a.indexOf(11); //1
a.indexOf(50); //-1

// Slice and Splice
let a = [1,2,3,4];

//Slice - doesn't mutate array, slice(start,end)
a.slice(0,2); //[1,2]
'abcd'.slice(1,3) // 'bc'

//Splice - splice(start,numToRemove,...items to add) - this does mutate
a.splice(1,2,'a','b'); //a is [1,'a','b',4]


//Iterating over Arrays using for loop and forEach
let teachers = ['Assaf', 'Shane', 'Zack']
for(let i = 0; i < teachers.length; i++) {
	console.log(teachers[i]);
}

//Uses a function
teachers.forEach(function(item, index) {
	console.log(item, index);
});

//Stringifying
teachers = ['Assaf', 'Shane'];
teachers.toString(); 'Assaf,Shane';
teachers.join('&'); 'Assaf&Shane';

let a = [2, 1, 3]
a.sort(); //[1,2,3]

a.reverse(); //[3,2,1]

//Sorting
let a = [2, 1, 3]
a.sort(); //[1,2,3]

a.reverse(); //[3,2,1]

//Alternatively a.sort(mySortFunction); 