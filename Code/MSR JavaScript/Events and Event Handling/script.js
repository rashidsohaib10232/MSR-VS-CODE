let h1 = document.querySelector("h1");
h1.addEventListener("click", function(){
    h1.style.color = "#FF6347"; // Tomato Red
});

let lorem = document.querySelector(".lorem");
lorem.addEventListener("mouseover", function(){
    lorem.style.color = "#00CED1"; // Dark Turquoise
});
lorem.addEventListener("mouseout", function(){
    lorem.style.color = "#FFD700"; // Gold
});

let dob = document.querySelector('.dob');

dob.addEventListener("dblclick", function(){
   dob.style.backgroundColor = "#191970"; // Midnight Blue
   dob.style.color = "#FFD700"; // Gold text for contrast
});


let btn = document.querySelector(".btn");
btn.addEventListener("dblclick", function(){
    btn.style.backgroundColor = "#FFD700"; // Gold text for contrast
    btn.style.color = "#00FF7F"; // Spring Green
});


let txt = document.querySelector('.txt');

let display =document.querySelector('#display');

txt.addEventListener('keyup',function(){
    let typed = txt.value;
    display.textContent = "You typed : "+typed;
});

let txt1 = document.querySelector('.txt1');

txt1.addEventListener('input',function(dets){
    if (dets.data !== null){
        display.textContent = dets.data;
        console.log(dets.data);
    }
})

let h2 = document.querySelector("h2");

let lap = document.querySelector('#laptopb'); 
lap.addEventListener('change', function(e){
    h2.textContent = `Laptop Brand Selected: ${e.target.value}`;
});
