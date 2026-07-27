// setTimeout(callback, ms): Runs code ONCE after ms milliseconds

let h1 = document.querySelector("h1");

setTimeout(function() {
    console.log("2 second have passed");
    h1.textContent = `${x/1000} seconds have passed`;
}, x = 2000);


// setInterval(callback, ms): Runs code 
// REPEATEDLY every ms milliseconds.

// runs every 1 sec

let 