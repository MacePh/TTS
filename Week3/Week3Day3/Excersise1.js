// #1
let list = ['pop tarts', 'ramen noodles', 'chips', 'salsa', 'coffee'];
// #2
list.push('fruit loops');
// #3
list[4] = 'fair trade coffee'
// #4
// list[2]='rice';
// list[3]='beans';
list.splice(2, 2, 'rice', 'beans');
console.log(list);

// #5
let cart = [];
// #6
cart.push(list.pop());
// #7
cart.push(list.shift());
// #8
while (list.length > 0) 
    cart.push(list.pop());

    // #9
cart.sort().reverse();
console.log("My cart contains: ", cart.join(','));
