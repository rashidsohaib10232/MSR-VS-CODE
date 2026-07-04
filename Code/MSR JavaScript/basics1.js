//var
let name = "Sohaib Rashid";
name = "MSR"
console.log(name);

let age = 18;
console.log(name,age);


gen = "obc"               //just like py

console.log(gen)

// function

function fun(){
    let age = 19;
    console.log(age)
}
fun();                 //is function call?

//datatype
//primitive data type

//number

let a = 30;
let b = 20;
console.log(a+b)

//string

let str = "hello javaScript";
let str2 = "Hello Java and Python";
console.log(str, str2);


//boolean

let user = true;
console.log(user);
console.log(typeof user);

//undefined

let user2 ;
console.log(user2 , user);
console.log(typeof user2);

//bigint

let num = 2777717298233716355532757664272351253755567125536352694n;
console.log(num , typeof num);

//
let num2 = 2777717298233716355532757664272351253755567125536352;  //exp
console.log(num2);
// why 2.7777172982337164e+51 of this o/p           i get it.

//null
let n = null;
console.log(n,typeof n)


//Symbol

let sym = Symbol("msr123");
console.log(sym, typeof sym)


// non primitive datatype

//arrey

let arr = [10,30,19,'msr' ,true,'77&&77'];
console.log(arr, typeof arr)

arr.push(909090)
console.log(arr)
arr.pop()
console.log(arr)
console.log(arr[0])

arr[0]=909;
console.log(arr)



//key-value paired

let user3 = {
    name : "Sohaib Rashid",
    roll_No : 32,
    stream : "PCM+CS",   
    class : 12,

};
console.log(user3);

user3.name = "Sulem";
console.log(user3);