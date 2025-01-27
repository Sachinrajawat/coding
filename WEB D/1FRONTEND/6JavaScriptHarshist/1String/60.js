// sort method
// ASCII TABLE
// char : ascii value
// '0' : 48
// ':' : 58
// 'A' : 65
// 'a' : 96


// sort
// 5,9,1200,400,3000
// 5,9,400,1200,3000

// const numbers=[5,9,1200,400,3000];
// numbers.sort();
// console.log(numbers)  // js treated as a string 

// const userNames = ['harshit', 'abcd','ABC', 'mohit','nitish'];
// userNames.sort();
// console.log(userNames);



const numbers=[5,9,1200,400,3000];
numbers.sort((a,b)=>{
    return a-b;
});
console.log(numbers);

// 1200, 410

// a-b ---> 790
// a-b ---> positive (greater than 0)  ---> b, a
// 410, 1200

// a-b ---> negative  ---> a,b
// 5, 9 ---> -4


const products = [
    {productId: 1, productName: "p1", price: 300},
    {productId: 2, productName: "p2", price: 3000},
    {productId: 3, productName: "p3", price: 200},
    {productId: 4, productName: "p4", price: 8000},
    {productId: 5, productName: "p5", price: 500},
]

// low to high

// products.sort((a,b)=>{
//     return a.price-b.price;
// })

const lowToHigh = products.slice(0).sort((a,b)=>{
    return a.price-b.price;
})
const highToLow = products.slice(0).sort((a,b)=>{
    return b.price-a.price;
})

console.log(lowToHigh);
console.log(highToLow);

