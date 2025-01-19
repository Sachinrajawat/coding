// spread operator

const array1 = [1, 2, 3];
const array2 = [5, 6, 7];

// const newArray = [...array1, ...array2, 89]; //spread
// const newArray = [..."abc"];
const newArray = [..."123456"];
console.log(newArray);

//spread operator in objects
const obj1 = {
    key1: "value1",
    key2: "value2",

};
const obj2 = {
    key1: "vaueUniue",
    key3: "value3",
    key4: "value4",

};
// const newObject = { ...obj1, ...obj2, key69: "value69" };
const newObject = {..."abc"};
console.log(newObject);