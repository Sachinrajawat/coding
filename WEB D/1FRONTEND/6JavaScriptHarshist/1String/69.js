// clone using Object.assign

// memory


const obj = {
    key1: "value1",
    key2: "value2",
}

// const obj2 = obj;
// const obj2 = {...obj};  // spread operator for cloning
const obj2 = Object.assign({},obj);  // one more method
obj.key3 = "value3"
console.log(obj);
console.log(obj2)