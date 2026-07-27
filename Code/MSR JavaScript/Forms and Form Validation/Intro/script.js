let nm = document.querySelector('#name');
let form = document.querySelector('form');

form.addEventListener("submit", function(e) {
  e.preventDefault();

  
  if (nm.value.length <= 2) {
    document.querySelector("#hide").style.display = 'block';
  } else {
    document.querySelector("#hide").style.display = 'none';
  }
});



// regex

let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
let emailInput = document.getElementById('email');

form.addEventListener("submit",function(e){
    e.preventDefault();
    if(!emailPattern.test(emailInput.value)){
        alert("Please enter a valid email address! ");
    } else {
    alert("Email looks good!");
  }

    
});

