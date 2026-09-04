let form = document.querySelector(".form");
let uname = document.getElementById("uname");
let uage = document.getElementById("uage");
let uemail = document.getElementById("uemail");
let uprofile = document.getElementById("uprofile"); 
let occup = document.getElementById("occup");

form.addEventListener("submit", function(e) {
    e.preventDefault();

    uname.textContent = document.getElementById("name").value;
    uage.textContent = document.getElementById("age").value;
    uemail.textContent = document.getElementById("email").value;
    uoccup.textContent = document.getElementById('occup').value;

    
    let photoLink = document.getElementById("pp").value;
    if (photoLink) {
        uprofile.src = photoLink;
    }
});
