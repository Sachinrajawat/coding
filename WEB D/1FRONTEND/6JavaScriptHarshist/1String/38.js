//how to iterate object
const person = {
    name: "harshit",
    age: 22,
    "person hobbies": ["guitar", "sleeping", "Listening music"]
}

//for in loop

// for(let key in person){
//     console.log(person[key]);
// }
// for(let key in person){
//     console.log(`${key} : ${person[key]}`);
// }

//Object.keys
// console.log(Object.keys(person));
// const val=Array.isArray((Object.keys(person)));
// console.log(val);

for(let key of Object.keys(person)){
    console.log(person[key]);
}
