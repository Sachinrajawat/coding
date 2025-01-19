// Arrow function

// const singhappyBirthday = function(){
//     console.log("happy birthday to u...");
// }

const singhappyBirthday = () => {
    console.log("happy birthday to u...");
}

singhappyBirthday();

const sumThreeNumber = (num1, num2, num3) =>{
    return num1+num2+num3;
}

const ans = sumThreeNumber(2,3,4);
console.log(ans);

const isEven = num => num%2==0;
console.log(isEven(3));
console.log(isEven(6));


//function
// input : array , target (number)
// output: index of the target if target present in array

const findTarget = (array,target) =>{
    for(let i = 0;i<array.length;i++){
        if(array[i]===target) return i;
    }
    return -1;
}

const myArray = [1,2,3,45,90];
console.log(findTarget(myArray,45));
console.log(findTarget(myArray,5));