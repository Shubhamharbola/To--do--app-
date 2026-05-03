const text = 'heloo everyone  '
// lenght
console.log(text.length);

// includes
console.log(text.includes('h'));
//toUppercase
console.log(text.toUpperCase());
//trim() (removes white space)

console.log(text.trim());
//substring
console.log(text.substring(0,4));
//chaining
const result = text
.toUpperCase()
.trim()
.substring(4);
console.log(result);


// numbers
const total = 1567.9807;
// toFixed() used to roundoff
console.log(total.toFixed());
//bolleans
if(text.includes('heloo')){
    console.log(100);
}
else{
    console.log(200);
}

// when dealing with the server
const response ={
    statusCode : 500,
    ok:false,
    data:[1,2,3]
};
if(!response.ok){
    console.log(' deal with the error');
}

//arrays

const numbers = [1,23,4,5,66,7];
// length
console.log(numbers.length);

// push
numbers.push(88);
console.log(numbers);
// includes
console.log(numbers.includes(7));
//for each 
numbers.forEach(function(nr){
    console.log(nr*2);
})
//objects in array

const data = [{
    name:'john',
    age:45},
{name:'EMily',
    age:32

},
{
    name:'mike',

    age:67
}];

console.log(data[2].age);


// object in object 
const user = {
    name: 'lily',
    age:30,
    hobbies:['knitting','programming'],
    adress:{
        city:'miami',
        state:'florida'
    }
};
console.log(user);  
// property name is sometimes is same as property value
// const username = input.value;
// const password=passwaord;
// const newUser = {
//     username:username,
//     password:password
// };

// send to server(newUser)
// passing object as argument to fuction 
const logUser= newuser =>{
    console.log(newuser.name);
    console.log(newuser.age);
}
const newuser = {
    name:'Emily',
    age:32,


}
logUser(newuser);

// increment and decrment operator
let number = 100;
number++;
number--;
console.log(number);


// function 
// calling other function in function body
const logHello=()=>{
    console.log('hello');
}

const addNumbers = ()=>{
    console.log(9);
    logHello();
}

addNumbers();

//refactoring
//not to duplicate yoursef creaet a seprate function for common thing in all the function 

// early return / stop function exceution

const checkVAlidity = ()=>{
    if(number<50){
        console.log('denide');
        return;
    }
    console.log('approved');
}

// hositing (not applicablef for arrow function)
// and only for (var)
logStuff();
function  logStuff(){
    console.log('hello');
}

anyNumber = 10;
var anyNumber ;
// Timers(setTimeOut and setInterval)

// setTimeout(()=>{
// console.log("hello");

// },5000);

// setInterval(()=>{
//     console.log(' hi shubham')
// },2000);

// for each 
const arr = [1,3,4,5,6,];
arr.forEach(function(rn){
    console.log(rn+1);
});

// fetch 
fetch('https://jsonplaceholder.typicode.com/todos')
.then((res)=>{
    if(!res.ok){
        co
    }
   return res.json();
})
.then(data=>{
    console.log(data);
})
.catch(error=>{
console.log('error');  
});

// event bubbling 
