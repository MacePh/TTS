// let billAmount = 69.70
// function gratuity(billAmountArg) {
//     let gratuity= billAmountArg*0.2;
//     return withGratuity
// }
// function totalWithGrat(params) {
    
// }




// console.log()


// function add() {
// 	let sum = 0;
// 	for(let i = 0; i < arguments.length; i++) {
// 		sum += arguments[i];
// 	}
// 	return sum;
// }
	
// // add(1,2,3,4,5,6,7,8);
// let arrayOfMystery = [
//     ['anonymous','array'],
//     { name: 'anonymous object' },
//     function(){ return 'Anonymous Function!'}
// ];
// console.log(arrayOfMystery[0][1]); // array
// console.log(arrayOfMystery[1].name); // anonymous object
// console.log(arrayOfMystery[2]()); // anonymous function!

// let hands = ['Rock', 'Paper','Scissors'];
// function getComputerHand(parseInt(Math.random()*10) % 3) {
    
// }
// console.log(parseInt(Math.random()*10) % 3)
// function compare() {

// }
const kelvin = 293; //constant throughout the program
const celsius = kelvin - 273; // converts kelving to celsius
let fahrenheit = celsius * (9 / 5) + 32; //not constant, because it is dependent on celsius
fahrenheit = Math.floor(fahrenheit); //rounds to whole number
let newton = celsius * (33 / 100);
newton = Math.floor(newton);
console.log(
  `The temperature is ${fahrenheit} degrees Fahrenheit.`
);
console.log(
  `The temperature is ${newton} degrees Newton.`
);
