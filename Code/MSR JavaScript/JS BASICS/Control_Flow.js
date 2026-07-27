let marks = 98;

if(marks >= 90){
    console.log("A");
} else if (marks >= 75){
    console.log("B");
} else {
    console.log("C");
}

// switch

switch(2){
    case 1:
        console.log("hye heye")
        break;
    case 2:
        console.log("hello this is case 2")
        break;
    case 3:
        console.log("this case 3");
        break;
    default:
        console.log("not a case")
}



let fruit = "apple";
switch (fruit) {
    case "banana":
        console.log("Yellow");
        break;
    case "apple":
        console.log("Red");
        break;
    default:
        console.log("Unknown");
}


//  Early Return Pattern

function checkAge(age) {
    if (age < 18) return "Denied";
    return "Allowed";
}

console.log(checkAge(88));

let val = 89;
function getval(val) {
    if (val >= 90) return "A";
    else if (val >= 75) return "B";
    else if (val >= 50) return "C";
    else return "D";
}

console.log(getval(val));


// write a func getGrade(score) 

function getGrade(score){
    if (score >= 90 && score <= 100) return "A+";
    else if(score >= 80 && score <= 89) return "A";
    else if(score >= 70 && score <= 79) return "B";
    else if(score >= 60 && score <= 69) return "C";
    else if(score >= 33 && score <= 59) return "D";
    else if(score >= 0 && score <= 32) return "Fail";

    else return "Invalid marks";



}

console.log(getGrade(-0.5));


// rock-paper-scissors logic
function rps(user, comp) {
    // 1. Check for a tie (both choose the same thing)
    if (user === comp) {
        return "It's a tie!";
    }
    
    // 2. User winning conditions
    else if (
        (user === 'rock' && comp === 'scissors') ||
        (user === 'paper' && comp === 'rock') ||
        (user === 'scissors' && comp === 'paper')
    ) {
        return 'user wins';
    }
    
    // 3. If it's not a tie and the user didn't win, the computer wins
    else {
        return 'comp wins';
    }
}

// Test examples:
console.log(rps('rock', 'scissors')); // Output: user wins
console.log(rps('paper', 'rock'));     // Output: user wins
console.log(rps('rock', 'rock'));     // Output: It's a tie!
console.log(rps('paper', 'scissors')); // Output: comp wins