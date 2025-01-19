// function 
//function declaration

function singhappyBirthday(){
    console.log("happy birthday to u...");
}

singhappyBirthday();

function twoPlusFour(){
    return 2+4;
}
console.log(twoPlusFour());

function sumTwoNumber(num1, num2){
    return num1+num2;
}
const returnValue = sumTwoNumber(4,5);
console.log(returnValue);


//odd or even
// input : 1 number
// output : true, false

function isEven(number){
    // if(number % 2===0) return true;
    // return false;
    return number % 2 === 0;
}

console.log(isEven(1));

//function
//input : string
// output:  firstCharacter

function firstChar(anyString){
    return anyString[0];
}
console.log(firstChar("abc"));


//function
// input : array , target (number)
// output: index of the target if target present in array

function findTarget(array,target){
    for(let i = 0;i<array.length;i++){
        if(array[i]===target) return i;
    }
    return -1;
}

const myArray = [1,2,3,45,90];
console.log(findTarget(myArray,45));
console.log(findTarget(myArray,5));