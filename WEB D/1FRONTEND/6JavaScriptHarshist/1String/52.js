// rest parameters

// function myFunc(a,b,...c){
//     console.log(`a id ${a}`);
//     console.log(`b id ${b}`);
//     console.log(`c id ${c}`);
// }
// myFunc(3,4,5);
// myFunc(3,4,5,6,7,8);


console.log(addAll(1,2,3,4,5,6));

function addAll(...numbers){
    console.log(numbers);
    console.log(Array.isArray(numbers));


    let total=0;
    for(let num of numbers){
        total+=num;
    }
    return total;
}

