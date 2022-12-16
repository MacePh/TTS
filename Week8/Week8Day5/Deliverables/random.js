// Write an asynchronous function and call it with async / await
// Write function called getRandomNumber that returns a promise
// In the promise, write a setTimeout() that will resolve the promise with a random number after .5 seconds
// Write an async function that invokes the getRandomNumber function, awaiting the random number, and printing that to the console.
// Invoke your async function
//

async function getRandomNumber() {
    let x=5;
    let promise = new Promise((resolve, reject) => {
        setTimeout(() => resolve(Math.floor(Math.random() * x)), 5000)
    });

    let result = await promise; // wait until the promise resolves (*)

    console.log("Random Number: " + result); // random number
    // alert("****************ALERT!**************** \n Random Number: " + result+" printed to console first!");
    
}

getRandomNumber();
    