// objects inside array
// very useful in real world applications

const users = [
    {userId: 1, firstName: 'sachin', gender: 'male'},
    {userId: 2, firstName: 'ankit', gender: 'male'},
    {userId: 3, firstName: 'himanshu', gender: 'male'},
]
// console.log(users);
for(let user of users){
    // console.log(user);
    console.log(user.userId);
    console.log(user.firstName);
    
}