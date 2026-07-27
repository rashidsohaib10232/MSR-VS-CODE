// Problem 2: The Blinking Warning Sign
// The Goal: Make an element flash on the screen to grab attention, 
// and give the user a way to stop it.

// Create an <h2> tag in your HTML that says "WARNING: Low Battery".

// Create a "Dismiss" button below it.

// In your JavaScript, as soon as the file loads, start a setInterval 
// that runs every 500 milliseconds (half a second).

// Inside the interval, make the text blink: if the text is currently visible,
//  hide it (e.g., set style.visibility = "hidden" or change its color to match 
// the background). If it is hidden, make it visible again.

// When the user clicks the "Dismiss" button, use clearInterval() to stop 
// the blinking entirely.

let warning = document.querySelector("h2");
let dismissBtn = document.querySelector("#dismiss");

let blink = setInterval(function() {
    if(warning.style.visibility ==='hidden'){
        warning.style.visibility = 'visible';
    } else {
        warning.style.visibility = 'hidden'
    };
}, 500);

dismissBtn.addEventListener('click',function(){
    clearInterval(blink);
    warning.style.visibility = 'visible'
})