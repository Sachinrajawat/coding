// call apply bind



// function hello(){
//     console.log("hello world");
// }
// hello.call();



// const user1 = {
//     firstName : "sachin",
//     age: 8,
//     about: function(hobby, favMusician){
//         console.log(this.firstName, this.age, hobby, favMusician);
//     }
// }
// const user2 = {
//     firstName : "mohit",
//     age: 9,
// }

// user1.about(); 
// user1.about.call(user2,"guitar","Arijit");  // calling about function from 

// user1.about.call();
// user1.about.call(user1);

function about(hobby, favMusician){
        console.log(this.firstName, this.age, hobby, favMusician);
    }

const user1 = {
    firstName : "harshit",
    age: 8,
}
const user2 = {
    firstName : "mohit",
    age: 9,
}

about.call(user1,"guitar")

about.apply(user1, ["guitar", "sony"]);

const func= about.bind(user2,"guitar","sony")  // bind return a function 
func();

