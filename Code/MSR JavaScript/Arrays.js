let marks = [29,90,92,88,34,77];
// // for each
// marks.forEach(function name(val) {
//     console.log(val**2);
    
// })


// map for making a new arr

// let mapArray = marks.map(p=>p*2)

// console.log(mapArray)

// // filter()

// let even = marks.filter(n=> n%2==0);
// console.log(even);

// // reduce()

// let total = marks.reduce((acc, val) => acc + val, 0);

// console.log(total)

// let ans = marks.reduce(function(acc,val){
//     return acc + val;
// }, 0);

// console.log(ans);


// // some

// let any = marks.some(function(val){
//     return val>90;
    
// });

// console.log(any)


// // every

// let any = marks.every(function(val){
//     return val>50;
// })
// console.log(any)

//  Destructuring & Spread 

let [a,b,,,,e,,,,] = marks;
console.log(marks)