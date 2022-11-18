
// Setting Constants.
const parentUL = document.getElementById('tdUl');
const deleteB = document.querySelector('span.deleteBtn')

function sbmt() {
    let myInput = document.getElementById("myInput").value;
    if (myInput === '') {
        alert("Fill in the box, silly!");
    } else {
        let newLI = document.createElement('li');//creates new list item
        newLI.tagName = "LI";
        let newBtn = document.createElement('span');//creates a button to go into new list item
        newBtn.innerHTML = (myInput);//.value;//pulls input form into the button text
        newBtn.className = "itemButton btn-sm list-group-item";//gives button appropriate class names
        newBtn.setAttribute("onclick", "deleteItem(event)");
        newLI.appendChild(newBtn);//puts newBtn into the list item
        parentUL.appendChild(newLI);//inserts complete button into the origninal UL
        document.getElementById("myInput").value = ""
        console.log(newLI)
    }
};



function deleteItem() {
    let d86 = event.target;
    let dPN86 = event.target.parentNode;
    parentUL.removeChild(dPN86);
}


    
