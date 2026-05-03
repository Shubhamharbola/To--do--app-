let description ="we need a room "
const  area = 100;
// let and const are better to use bcz we cannot overide them 
var peri = 3;
var peri = 4;//  var can be overriden 
// let is scoped to block and funciton
// var is not scoped to block but only to  funtion 

const specailcaoting = true;//boolean

const flooroption= ['white cemnt','red caot',100,['yellow', 'blue room']]

const rennovationjaob={
    name:'john',
    maximumPrice:5000,
    category:'bathroom',
   newshower:true

}

console.log(flooroption);
// Traditional function vs arrow fuction
function calculateprice(sqrmeteres){
    const price = 1000*sqrmeteres;
    return price;

}
//alterante traditional fuction 
var calculateprice1= function (sqrmeteres){
    const pricee = 100*sqrmeteres;
    return pricee;

}
console.log(calculateprice1(100));

// arrow function 

const calculateRent = (price)=>{
    const totalrent = price*12;
    return totalrent;
}
// arrow shorter syntax
// we can remove return and curly baraces
// only if one parameter is there
const calculateRent1 = price=>price*12;

console.log( calculateRent(1000));

// string concaenation vs template literals
const price = 10000;
const result= 'the price is '+ price;
console.log (result );
// using tempalte literal ``
const rate = 5000;
 const total= `total rate: ${rate}`;
 console.log(total);

 // if else block 
 const value = 3000;
//  if(value>2000){
//     console.log(`the value is  ${value}`  );
//  }
//  else{
//     console.log(`blala`);
//  }
  // if else vs ternary opretaor
  value>3000?console.log('heloo'):console.log('blalah');
 // equality operator
 //==(only check the value not the type 500== '500' true )vs ===(this is more strict and even check if they are of same data type 500==='500' false )


 // manupilating html and css
 // // can select anything inside it id,class name ,
//const headingEL= document.querySelector(`.heading`);
//headingEL.textContent = 'hello <span class="heading--big">everyone</span>'
//headingEL.innerHTML = 'hello <span class="heading--big">everyone</span>';
//headingEL.insertAdjacentHTML('beforebegin','hello <span class="heading--big">everyone</span>')

//headingEL.style.fontsize =' 5px'
// recommended way
//headingEL.classList.add('heading--big');





// events and functions to handel evnent (vent handler)
const headingEL= document.querySelector(`.heading`);
const clickHandler = ()=>{
    headingEL.style.color = 'red';
    console.log('color changed');
}
headingEL.addEventListener('click',clickHandler());