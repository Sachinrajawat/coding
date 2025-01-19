// lexical scope

const myVar = "value1";
function myApp(){
    function myFunc(){
        // const myVar = "value59";
        const myFunct2 = function(){
            console.log("inside myFunc", myVar);
        }
        myFunct2();
    }
    
    // const myFunct3 = () => {};
    console.log(myVar);
    myFunc();
}
myApp();