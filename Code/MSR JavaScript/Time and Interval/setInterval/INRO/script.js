// The setInterval function executes a block of code repeatedly,
//  pausing for a set amount of time between each execution.

let startBtn = document.getElementById("startBtn");
let stopBtn = document.getElementById("stopBtn");
let countDisplay = document.getElementById("count");

let counter = 0;
let intervalId = null; // Variable to store our interval ID

// START BUTTON
startBtn.addEventListener("click", function() {
    // Prevent multiple intervals from running at the same time
    if (intervalId !== null) return; 

    intervalId = setInterval(function() {
        counter++; // Increase the number
        countDisplay.innerText = counter; // Update the screen
    }, 1000); // Run every 1000ms (1 second)
});

// STOP BUTTON
stopBtn.addEventListener("click", function() {
    clearInterval(intervalId); // Stop the loop
    intervalId = null; // Reset the ID variable
});