// hoisting

// hello(); // we can call the function declare in func decla
// function hello(){  // function declaration
//     console.log("hello");
// }

// helloWorld(); // we cannot call before the function declare in func expression
// const  helloWorld =function(){ //function expression
//     console.log("Hello Worlds")
// }

console.log(hello); // when we use var then it is undefined 
// if it const and let then it will give error
var hello ="hello world";  
console.log(hello);