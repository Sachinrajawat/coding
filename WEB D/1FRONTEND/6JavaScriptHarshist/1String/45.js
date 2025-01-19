// function expression


// function singhappyBirthday(){
//     console.log("happy birthday to u...");
// }

const singhappyBirthday = function(){
    console.log("happy birthday to u...");
}

singhappyBirthday();

const twoPlusFour=function (){
    return 2+4;
}

console.log(twoPlusFour());


//odd or even
// input : 1 number
// output : true, false

const isEven = function (number){
    // if(number % 2===0) return true;
    // return false;
    return number % 2 === 0;
}

console.log(isEven(1));
