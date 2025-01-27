
const userMethods = {
    about: function(){
        return `${this.firstName} is ${this.age} years old`
    },
    is18:  function(){
        return this.age >= 18;
    },
    sing: function(){
        return 'toon na na na la la'
    }
}

function createUser(firstName, lastName, email, age, address){
    const user = {};
    user.firstName = firstName;
    user.lastName = lastName;
    user.email = email;
    user.age = age;
    user.address = address;
    user.about=userMethods.about;
    user.is18=userMethods.is18;
    user.sing = userMethods.sing;
    return user;
}


const user1 = createUser('sachin','rajawat','sachin38@gmail.com', 19,'punjab');
const user2 = createUser('Nitin','rajawat','sachin38@gmail.com', 19,'punjab');
const user3 = createUser('Ankit','rajawat','sachin38@gmail.com', 19,'punjab');

console.log(user1.about());
console.log(user2.about());
console.log(user2.sing());