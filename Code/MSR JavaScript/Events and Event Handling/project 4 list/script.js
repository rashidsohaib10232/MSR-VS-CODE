let ol = document.querySelector('ol');

ol.addEventListener('click',function(e){
    console.log('click')
    //e.target.style.textDecoration = 'line-through';
    e.target.classList.toggle('lt');
})