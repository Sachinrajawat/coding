const user1 = {
    firstName : "harshit",
    age: 8,
    about: function(){
        // console.log(this);
        console.log(this.firstName,this.age);
    }
}
// dont do this mistake

// user1.about();
// const myFunc = user1.about;
const myFunc = user1.about.bind(user1);
myFunc();