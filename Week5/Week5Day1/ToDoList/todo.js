const parentUL = document.querySelector('ul');
let button = document.querySelector("submit");

button.addEventListener('click', function(event) {
	let newLI = document.createElement('li');
    newLI.innerHTML=document.getElementById('newToDo');
    parentUL.appendChild(newLI)});