// Problem 1: The 5-Second Countdown
// The Goal: Create a timer that counts backward and stops itself when it hits zero.

// Create a <div> or <h1> in your HTML that displays the number 5.

// Create a "Start Countdown" button.

// In your JavaScript, when the button is clicked, use setInterval to 
// decrease the number by 1 every second (1000ms).

// Crucial step: Inside your interval, check if the number has reached 0.
//  If it hits 0, use clearInterval() to stop the timer, and change the 
// text to say "Time's up!".


let timer = document.querySelector("#timer");  // to show 
let btn = document.querySelector("#btn");


btn.addEventListener("click",function(){
    btn.textContent = "Timer start...";
    btn.disabled = true;

    let count =10;
    timer.textContent = count;
    let time = setInterval(function() {
        count--;
        timer.textContent = count;

        if(count<=0) {
            clearInterval(time);
            btn.textContent = "Time's up!";
            btn.disabled = false;
        }
    },1000);
});
