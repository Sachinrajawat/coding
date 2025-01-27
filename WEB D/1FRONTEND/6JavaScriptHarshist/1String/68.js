// Maps


// key value pair

// const person= new Map();

// person.set('firstName','sachin');
// person.set('age',9);
// person.set(1,'one');
// person.set([1,2,3],'oneTwoThree');
// person.set({1: 'one'},'oneTwoThree');

// console.log(person);

// console.log(person.get('firstName'));
// console.log(person.get(1));
// console.log(person.keys());

// for(let key  of person.keys()){
//     console.log(key, typeof key);
// }


// for(let key of person){
//     console.log(key, typeof key);
//     console.log(Array.isArray(key))
// }

// for(let [key,value] of person){
//     console.log(key,value);
// }


// const person = new Map([['firstName','Sachin'],['age',5]]);
// console.log(person);

const person1 = {
    id: 1,
    firstName: "harshit"
}

const extraInfo =new Map();
extraInfo.set(person1,{age: 8, gender: "male"});
console.log(extraInfo);

console.log(person1.id);
console.log(extraInfo.get(person1).age);
console.log(extraInfo.get(person1).gender);

