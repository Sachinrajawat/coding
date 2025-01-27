// map methods

const numbers = [3,4,5,1,8];
// const square = function(number){
//     return number*number;
// }
// const squareNumber = numbers.map(square);
const squareNumber = numbers.map(function(number){
    return number*number;
});
console.log(squareNumber);