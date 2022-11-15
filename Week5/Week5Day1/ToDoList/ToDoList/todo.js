const parentUL = document.querySelector('ul');
const sumbit = document.querySelector('button');

submit.addEventListener('click', function(event) {
	let newLI = document.createElement('li');
    newLI.innerHTML=document.getElementById('newToDo').value;
    parentUL.appendChild(newLI);
    document.getElementById("newToDo").value = ""});
    


