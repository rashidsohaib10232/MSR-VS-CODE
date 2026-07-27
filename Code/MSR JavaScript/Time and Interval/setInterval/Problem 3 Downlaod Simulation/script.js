let btn = document.querySelector("button");
let bar = document.querySelector("#bar");
let h1 = document.querySelector("h1");
let count = 0;
btn.addEventListener("click",function(){
    btn.textContent = "Downaloading..."
    btn.disabled =true;

    let time = setInterval(function(){
        if (count<100){
            count++;
            bar.style.width = `${count}%`;
        }
    
        
       if(count===100){
        clearInterval(time);
        btn.textContent ="Downlaoded!"
        btn.disabled=false;
         
            
            
       }
    },200)
    
});