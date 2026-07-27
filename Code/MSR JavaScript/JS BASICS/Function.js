let fnc = function(){
    console.log("heyhey hey heyyyyyeye hu j");
};

// fnc();

// fat arrow func

let ab = ()=>{
    console.log("heyheyhey")
}

function abs(){
    console.log('heyhyhhhehhhhhhhhhhhhhhhhhhh')
}

function dance(v1){
    console.log(`${v1} naach raha hai`);
}

// dance("ghoda");
// dance("cheel")

function sum(x = 0,y=0){   // <--- parameter
    console.log(x+y);
}
// sum();
// sum(2,2);
// sum(23,90);    // <--- arguments

function abcd(...val){
    console.log(val);
}
// abcd(1,2,3,4,55,3234,0)



// use rest papra. to accept any no. of score nd return total.

function getScore(...val){
    let total =0;
    val.forEach(function(val){
        total = total + val;
    });
    return total;
}

// console.log(getScore(1,99,45,));