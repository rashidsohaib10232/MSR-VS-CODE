// Problem 1: The "Loading" Button
// The Goal: Simulate a network request (like fetching data from a database).

// Create a button in HTML that says "Fetch Data".

// When the user clicks the button, immediately change the button's text to "Loading..." and disable the 
// button so it cannot be clicked again.

// Use setTimeout to wait for exactly 2 seconds (2000 milliseconds).

// After 2 seconds, change the button's text to "Data Loaded!" and change the button's background color to green.

let btn = document.querySelector("#btn");

btn.addEventListener('click',function(){
    btn.textContent = "Loadin...";
    btn.disabled = true;
    btn.style.backgroundColor = "blue";
    setTimeout(function() {
        btn.textContent = "Data Loaded!";
        btn.style.backgroundColor = "green";
    },2000);
});

