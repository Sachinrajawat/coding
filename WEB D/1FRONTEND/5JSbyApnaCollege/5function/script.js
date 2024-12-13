function myfunction(){
    console.log("Helllo");
    console.log("we are learning JS");
}
myfunction();

//arrow funct
const arrowSum = (a,b) => {
    console.log(a+b);
};
let arr=['Delhi','Pune','Bhind'];
arr.forEach(function printVal(val){ //value at each index
    console.log(val);
})
arr.forEach((val) =>{
    console.log(val);
})
arr.forEach((val,idx) =>{
    console.log(val,idx);
})
arr.forEach((val,idx,arr) =>{
    console.log(val,idx,arr);
})
let array=[1,2,3,4];
array.forEach((val) =>  {
    console.log(val*val);
})


//map function
let nums =[97,82,788];
nums.map((val) =>{
    console.log(val);
});
let evenArray = nums.filter((val) =>{
    return val%2 ===0;
})
console.log(evenArray);

// sum
let output=nums.reduce((res,curr) =>{
    return res+curr;
});
console.log(output);



