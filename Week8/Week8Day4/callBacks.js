// asynchronus
// synchronus
//anonymous function


// setTimeout(function () {
//     console.log("This message is shown after 3 seconds.")
// }, 3000);
//arrow function

// setTimeout(()=> {
//     console.log("This message is shown after 3 seconds.")
// }, 3000);

// 
window.onload = function () {

    document.querySelector("#callback-btn-1").addEventListener("click", function () {
        console.log("User has clicked the button")
    })
}


// Asynchronus
function order(url, callback) {
    setTimeout(() => {
        // script to download the picture here
        console.log(`Downloading ${url} ...`);

        // process the picture once it is completed
        callback(url);
    }, 1000)
}



function process(picture) {
    console.log(`Processing ${picture}`);
}
window.onload = function () {

    document.querySelector("#callback-btn-2").addEventListener("click", function () {
        let url = 'https://wwww.javascripttutorial.net/pic.jpg';
        download(url, process);
    }



// Asynchronus
// function order(url, callback) {
//     setTimeout(() => {
//         // script to download the picture here
//         console.log(`Downloading ${url} ...`);

//         // process the picture once it is completed
//         callback(url);
//     }, 1000);
// }

// function process(picture) {
//     console.log(`Processing ${picture}`);
// }

// let url = 'https://wwww.javascripttutorial.net/pic.jpg';
// download(url, process);