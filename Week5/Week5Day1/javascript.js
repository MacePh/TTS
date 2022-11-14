//Get a single node
let el = document.getElementById('username');
//Get all inputs
let inputs = document.getElementsByTagName('input');
let inError = document.getElementsByClassName('error');

console.log(inputs.length); //2
console.log(inError.length); //1
//Get all inputs
let firstButton = document.querySelector('button');
let inError = document.querySelectorAll('input.error');

console.log(firstButton); //single button node
console.log(inError); //Node list of inputs with class 'error'

// Slide 7
let links = document.querySelectorAll('a');

//Works!
let linkCount = links.length;
let firstLink = links[0];

//Doesn't work!
links.forEach(function(link){
	//do something with link
});

// Slide 8 
// Traversing the DOM
let listItems = document.querySelector('ul').children;
console.log(listItems.length); //2

// Slide 9
let selectedItem = document.querySelector('li.selected');
let first = selectedItem.previousElementSibling;
let last = selectedItem.nextElementSibling;
let list = selectedItem.parentElement;
let header = selectedItem.parentElement.parentElement;
let section = selectedItem.parentElement.parentElement.nextElementSibling;

// Slide 10 
// Excersise 1
//Laziness is your friend...

// Slide 11
// Solution
let q = document.querySelector.bind(document)
let qa = document.querySelectorAll.bind(document);


q('header');
qa('section');
q('section.current');
q('section.current').nextElementSibling;
q('section.current').previousElementSibling.children[0];
q('h2.highlight').parentElement.parentElement;

let foo = Array.from(qa('section h2'))
    .map(function(headline){
        return headline.parentElement;
    });

// Slide 12
// Editing a Node
//Get all inputs
let div = document.querySelector('div');
let a = document.querySelector('a');

console.log(a.innerHTML); //"click me"
console.log(div.innerHTML); //'<a href="#">Click me</a>'

a.innerHTML = "Updated link text";

