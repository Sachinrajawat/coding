// methods

// function inside object
// this object


// const person = {
//     firstName : "Sachin",
//     age: 8,
//     about: function(){
//         console.log(this); // object
//         console.log(`person name is ${this.firstName} ans person age is ${this.age}`);
//     }
// }
// person.about();


function personInfo(){
    console.log(`person name is ${this.firstName} ans person age is ${this.age}`);
}

const person1 ={
    firstName: "harsh",
    age: 8,
    about: personInfo
}
const person2 ={
    firstName: "mohit",
    age: 18,
    about: personInfo
}
const person3 ={
    firstName: "nitish",
    age: 17,
    about: personInfo
}

person1.about();
person2.about();
person3.about();