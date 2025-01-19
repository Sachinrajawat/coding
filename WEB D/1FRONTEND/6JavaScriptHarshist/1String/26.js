// intro to arrays
// reference type

// ordered collections of items
let fruits = ["apple","mango","grapes"]
console.log(fruits[2]);
let numbers= [1,2,3,4];
let mixed = [1,2,3,4, " string ", null, undefined]
console.log(mixed);
console.log(numbers);

console.log(fruits);
fruits[1] = "banana";
console.log(fruits);

console.log(typeof fruits)
console.log(Array.isArray(fruits));