// let amountRaisedSoFar = 1000; 
// let donation = prompt("How much would you like to donate?"); 
// amountRaisedSoFar = Number(donation) + amountRaisedSoFar; 
// console.log("We have now raised: " + amountRaisedSoFar + "!");

//Comparison If Statement//
// let temp = 60;
// if (temp > 45) {
//     console.log("I'm going hiking!");} 
// else {
//     console.log("It's too cold to go hiking");
// }

// let x = parseInt("10");
//  // 10x = parseFloat("10.55"); 
//  // 10.55x = toString(10.55); 
//  // "10.55";
//  console.log(x)

//  let greeting = "Hello";
//  let name = "world";
//  console.log(greeting +" "+name);

let name = "Shane";
let age = 25;
console.log(`Happy Birthday ${name}! How is ${age+1} treating you?`);
	
let something; //undefined variable being declared.
console.log(typeof something) // "undefined"

// foo does not exist, it is not defined and has never been initialized:
let foo=null
console.log(foo); // "ReferenceError: foo is not defined" // foo is known to exist now but it has no type or value:let foo = null; 
console.log(foo);// "null"

//Simple if statement
// let x = true;
// if(x) {
// 	console.log(true);
// } else if (x == true) {
// 	console.log("this won't run");
// } else {
// 	console.log(false);}
// 
//Comparison If Statement//
let temp = 60;
if (temp > 45) {
    console.log("I'm going hiking!");
} 
else {
    console.log("It's too cold to go hiking");
}

let x = 10;
if(x == '10') { //Type coersion is happening here!	console.log(true);
     //true} if(x === '10') {	console.log(true); //false}
}