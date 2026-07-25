// Step 1: Selecting Elements

const heading = document.getElementById('heading');
console.log(heading);

const para = document.querySelector('.para');
console.log(para);

const btn = document.getElementById('btn');
console.log(btn);

const btn2 = document.querySelector('#btn');
console.log(btn2);


// Step 2: Content Modification

heading.textContent = 'Change by JS!';
console.log(heading.textContent);

// para.innerHTML = "This is <b>bold</b> text";
// console.log(para.innerHTML);

btn.textContent = 'Submit';
console.log(btn.textContent);

para.innerHTML = 'This is <i>italic</i>';
console.log(para.innerHTML);

// Step 3: Attribute Handling

const img = document.getElementById('myImg');
console.log(img.getAttribute('src'));

img.setAttribute('src', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvN_qRY547rYsGcQzKb-Q7NmKajB6BnY_OMuLwIZ2wQ&s=10');
console.log(img.getAttribute('src')); // NOW this shows the new value



// Finishing Step

img.classList.add('hidden-img');

img.classList.remove('hidden-img');



// Step 4A: Creating Elements — Part 1


//create step 1
const newPara = document.createElement('p'); // step 1: create (in memory only)
console.log(newPara); // logs <p></p> — empty, and NOT on the page yet

//fill step 2 
newPara.textContent = "I was created by JavaScript!";
console.log(newPara.textContent);

//attach step 3
document.body.appendChild(newPara);


// Step 4B: Where you attach it matters - part 2


const container = document.getElementById('container');
const newPara2 = document.createElement('p');

newPara2.textContent = "This one goes inside the container! "
container.appendChild(newPara2);

const newPara3 = document.createElement('p');
newPara3.textContent = "I was added SECOND, using appendChild";
container.appendChild(newPara3);

const newPara4 = document.createElement('p');
newPara4.textContent = "I was added THIRD, using prepend";
container.prepend(newPara4);

newPara4.remove();

// Step 5: Event Handling — Part 1

// btn.addEventListener('click',function() {
//     console.log('Button was clicked ! ')
// });


//Step 5, Part 2: The Event Object

// btn.addEventListener('click', function(e) {
//   console.log(e);
//   console.log(e.target);
// });


// Step 5, Part 3: preventDefault()

// const link = document.getElementById('myLink');
// link.addEventListener('click', function(e) {
//     e.preventDefault();
//     console.log('Link click blocked ! ')
// }) ;


// Common Events — one at a time, hands-on like before

// 1. dblclick

// Fires only on a double-click, not single.

// btn.addEventListener('dblclick', function(){
//     console.log("Double Clicked!")
// })


// 2. mouseover and mouseout
// Fire when the mouse enters an element (mouseover) and 
// when it leaves (mouseout) — no clicking needed, just hovering.

// btn.addEventListener('mouseover',function(){
//     console.log("Mouse entered the button");
// })

// btn.addEventListener('mouseout',function(){
//     console.log("Mouse left the button");
// })

// 3. keydown and keyup

// Fire when a keyboard key is pressed down (keydown) and
//  released (keyup) — these need an input field to test properly 
// (or you can attach to document to catch any key anywhere on the page).


const input = document.getElementById('myInput');

// input.addEventListener('keydown',function(e){
//     console.log('Key down : ',e.key);
// });

// input.addEventListener('keyup', function(e){
//     console.log('Key up : ',e.key);
// });

// 4. input vs change

// Both fire when a field's value changes, but at different moments:
// input → fires on every single keystroke, immediately
// change → fires only after you leave the field (lose focus / click elsewhere)

// input.addEventListener('input',function(e){
//     console.log('input event : ',e.target.value);
// });

// input.addEventListener('change',function(e) {
//     console.log("change event :", e.target.value);
// });

// 5. focus and blur

// focus → fires the moment an element becomes 
// active/selected (you click into it)

// blur → fires the moment it loses that active state (you click away)

// input.addEventListener('focus',function(){
//     console.log("Input focused");
// });

// input.addEventListener('blur',function(){
//     console.log("Input blurred");
// });


// 6. submit


// Fires specifically on a <form> element when it's submitted 
// — either by clicking a submit button or pressing Enter inside 
// a form field. You already saw the concept with preventDefault()
//  on the link earlier — submit is the same idea, applied to forms.


// const form = document.getElementById('myForm');

// form.addEventListener('submit', function(e) {
//   e.preventDefault(); // stops page reload
//   console.log('Form submitted!');
// });


// 7. load and DOMContentLoaded

// Last two — these aren't for buttons/inputs,
//  they fire on the page itself (window object).

// DOMContentLoaded → fires when the HTML is fully parsed 
// (elements exist), but images/CSS may still be loading

// load → fires when literally everything is 
// done — HTML, images, CSS, all loaded

document.addEventListener('DOMContentLoaded', function(){
    console.log("HTML is ready! ");

});

window.addEventListener("load",function(){
    console.log("Everything (img too) is loaded !");
});



// Event Bubbling & Delegation
