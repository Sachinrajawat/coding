// find method

const myArray = ["Hello", "cat", "dog", "lion"];

function isLength3(string){
    return string.length===3;
}

// myArray.find();

// const ans= isLength3("doggy");
// console.log(ans);
console.log(myArray.find(isLength3));  // it return first occurrence

const users = [
    {userId : 1, userName: "harshit"},
    {userId : 2, userName: "harsh"},
    {userId : 3, userName: "nitish"},
    {userId : 4, userName: "mohit"},
    {userId : 5, userName: "aaditya"},
];

const myUser = users.find((user) => user.userId===3);
console.log(myUser);
