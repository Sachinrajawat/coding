// optional chaining

const user = {
    firstName: "harshit",
    // address: {houseNumber: '1234'}
}
// let user;

console.log(user.firstName);
// console.log(user.address.houseNumber);
console.log(user.address);
console.log(user?.address?.houseNumber);