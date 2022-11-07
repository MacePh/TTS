let i;
// for (i = 0; i < 3; i = i + 1)
// {
//     console.log(i);
// };
for (let i = 0; i < 3; i++) {
    console.log(i);
}

let myArray = ["A", "B", "C"];
for (let i = 0; i < myArray.length; i++) {
    console.log("The member of myArray in index " + i + " is " + myArray[i]);
}

for (let myArray = 0; i < myArray.length; i++) {
    console.log("The member of myArray in indedx " + i + " is " + myArray[i]);

}

// while//
// let i = 99;
// while (i > 0)
// {
//     console.log(i + " bottles of beer on the wall");
//     i -= 1;
// }
let h = 99;
while (h > 0) {
    console.log(h + " bottles of beer on the wall");
    h -= 1;
}

// break and continue statements//
let j = 99;
while (true) {
    console.log(j + " bottles of tape on the wall");
    j -= 1;
    if (j == 0) {
        break;
    }
}

// continue//
for (let i = 0; i < 100; i++) {
    // check that the number is even
    if (i % 2 == 0) {
        continue;
    }
    // if we got here, then i is odd.
    console.log(i + " is an odd number.");
}

// break and continue statements//
for (let bottle = 99; bottle >= 0; bottle--) { 
    if (bottle === 0) { console.log("Hey! Go buy more root beer!");
 } else { console.log(bottle + " bottles of root beer on the wall");
 } 
}