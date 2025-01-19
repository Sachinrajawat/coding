// block scope vs function scope

// let and const are block scope
// var is function scope

// {
//     let firstName = "sachin";
//     const firstName = "sachin";
// }
// console.log(firstName);  //we can't access this

{
    var lastName = "Rajawat";
}
console.log(lastName);


