let btn = document.querySelector("#btn");
let file = document.querySelector("#file");
btn.addEventListener('click',function(){
    file.click();
})

let N = document.querySelector('#name');


file.addEventListener("change",function(e){
    console.log(e.target.files[0].name)
    N.textContent = `${e.target?.files[0].name} uploaded`
});