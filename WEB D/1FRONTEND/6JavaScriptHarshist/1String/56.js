// important array methods

// for each
// map
// filter

const numbers =[4,3,5,8];

// function multiptyBy2(number, index){
//     console.log("index is ",index);
//     console.log(`${number}*2 = ${number*2}`);
// }

// multiptyBy2(numbers[0], 0);
// multiptyBy2(numbers[1], 1);

// for(let i = 0;i<numbers.length;i++){
//     // console.log(i);
//     multiptyBy2(numbers[i],i);
// }

// numbers.forEach(multiptyBy2);

// numbers.forEach(function(number, index){
//     console.log("index is ",index);
//     console.log(`${number}*2 = ${number*2}`);
// });

const users = [
    {firstName: "harshit", age: 23},
    {firstName: "mohit", age: 21},
    {firstName: "nitish", age: 22},
    {firstName: "garima", age: 25},
]

// users.forEach(function(user){
//     console.log(user.firstName);
// });

users.forEach(user =>{  // arrow function
    console.log(user.firstName);
})