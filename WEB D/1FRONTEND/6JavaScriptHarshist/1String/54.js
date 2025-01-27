// callback functions


function myfunc2(name){
    console.log("inside myfunct2");
    console.log(`your name is ${name}`);
}


function myFunc(callback){
    console.log("hello  there I am a funct ans I a can..")
    callback("Sachin");
    // console.log(a);
    // console.log('hello world');
}

// myFunc("sachin")
// myFunc(112)
// myFunc({name: "sachin"});


myfunc2();
myFunc(myfunc2);
