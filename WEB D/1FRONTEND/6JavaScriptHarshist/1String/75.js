// arrow function


// there is no this in arrow function
// we are using this from the surrounding
const user1 = {
    firstName : "harshit",
    age: 8,
    about: () => {
        console.log(this);
        console.log(this.firstName, this.age);
    }
}

user1.about.call(user1);