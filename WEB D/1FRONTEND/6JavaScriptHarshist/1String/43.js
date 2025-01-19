// nested destructuring

const users = [
    {userId: 1, firstName: 'sachin', gender: 'male'},
    {userId: 2, firstName: 'ankit', gender: 'male'},
    {userId: 3, firstName: 'himanshu', gender: 'Female'},
]

// const [user1, user2, user3] = users;
// console.log(user1);
// const [{firstName}, ,{gender}] = users;

// const [{firstName: user1firstName}, ,{gender}] = users;
const [{firstName: user1firstName, userId}, ,{gender}] = users;
console.log(user1firstName); //firstname is from sachin
console.log(userId);
console.log(gender);  //gender is from harshit 
