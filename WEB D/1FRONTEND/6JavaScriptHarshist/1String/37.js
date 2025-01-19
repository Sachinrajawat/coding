// difference between dot and bracket notation
const key = "email";
const person = {
    name: "harshit",
    age: 22,
    "person hobbies": ["guitar", "sleeping", "Listening music"]
}

// console.log(person["person hobbies"])
person[key] = "harshit@gmail.com";
console.log(person);