//array push pop

// array shift unshift

let fruits = ["apple","mango"," grapes"];
console.log(fruits);

//push -- fast
fruits.push("banana");
console.log(fruits);

console.log(fruits.pop());   // pop-----fast


//unshift    -  for adding in first      ---slow

fruits.unshift("banana")
console.log(fruits)

//shift --     one left shift  ----- Slow
let removeFruit = fruits.shift();
console.log(fruits);
console.log(removeFruit)