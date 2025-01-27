// splice method
// start, delete, insert

const myArray = ['item1', 'item2', 'item3'];

//delete
// it also return that deleted item
// myArray.splice(1, 1); // 1st array se start hokar only one element delete krna h
// myArray.splice(1, 2); // 1st array se start hokar two element delete krna h
// console.log(myArray);


// insert
// myArray.splice(1, 0, 'inserted item');
// 1st indx se zero item deleted one inserted
// console.log(myArray);


// insert & delete
myArray.splice(1,2,"item4","item5");
console.log(myArray); 

