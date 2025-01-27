// sets (it is iterable)
// store data
// sets also have its own methods
// no-index based access
// order is not guaranteed
// unique items only (no duplicates allowed)

// const numbers = new Set([1,2,3,4]);
// const numbers = new Set("sachin");
const arr=['item1','item2'];
const numbers = new Set();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(4);
numbers.add(5);
numbers.add(6);
numbers.add("sachin");
numbers.add("sachin");
numbers.add(['item1','item2']);
numbers.add(arr);
console.log(numbers);


console.log(numbers.has(1));

for(let number of numbers) console.log(number);


const myArray = [1,2,4,4,5,6,5,6];
const uniqueElements = new Set(myArray);
console.log(uniqueElements);
