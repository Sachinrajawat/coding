// reduce
const numbers = [1,2,3,4,5];

// aim : sum of all the numbers in array

// const sum = numbers.reduce((accumulator, currentValue)=>{
//     return accumulator+currentValue;
// })

// console.log(sum);

// accumulator , currentValue, return 
// 1               2            3          first time
// 3(returnValue)  3            6          second time
// 6               4            10         third time
// 10              5            15         4th time


const sum = numbers.reduce((accumulator, currentValue)=>{
    return accumulator+currentValue;
},100)  //initial value of accumulator is 100 

console.log(sum);   



const userCart =[
    {productId: 1, productName: "mobile", price: 12000},
    {productId: 2, productName: "laptop", price: 22000},
    {productId: 3, productName: "tv", price: 15000}
]

const totalAmount=userCart.reduce((totalPrice, currentProduct)=>{
    return totalPrice+currentProduct.price;
},0)  //starting TotalPrice 0

console.log(totalAmount);
