const counterEl = document.querySelector('.counter');
const increaseButtonEl= document.querySelector('.counter__button--increase');
const counterValueEl = document.querySelector('.counter__value');

const decreaseButtonEl = document.querySelector('.counter__button--decrease');

const counterResetButton = document.querySelector('.counter__reset-button')
const counterTitleEl = document.querySelector('.counter__title');



const counterIncrement = ()=>{
    // get the current value of the counter 
const currentValue = counterValueEl.textContent;
console.log( typeof currentValue);
// convert  the type of counter value to string 
const currentValueAsNumber = +currentValue;
// increment the  current value by 1
let newValue = currentValueAsNumber + 1;
if( newValue > 5){
   newValue = 5;
   // give the indicator that limit is  reached
counterEl.classList.add('counter--limit');

// update counter title text to limit has been recahed
// textcontent is not treated as html 
// innerhtml is treated as html
counterTitleEl.innerHTML='Limit! Buy <b>pro</b> for >5';
// disbale both increment and decrement button 
increaseButtonEl.disabled= true;
decreaseButtonEl.disabled = true;

}
// set counter element with new content 
counterValueEl.textContent = newValue;

}


function counterDecrement(){
      const currentValue = counterValueEl.textContent;
    console.log( typeof currentValue);
    currentValueAsNumber = +currentValue;
    let newValue = currentValueAsNumber - 1;
 if(newValue < 0){
       newValue= 0;

    }
   
counterValueEl.textContent= newValue;

    
   
}


counterResetButton.addEventListener('click',() =>{
      //set the counter value to new value
    counterValueEl.textContent = 0;  
// reset bg color
counterEl.classList.remove('counter--limit');
// reset the text
 counterTitleEl.textContent = 'Fancy Counter'; 
// enable the button 
increaseButtonEl.disabled = false;
decreaseButtonEl.disabled = false;
//unfocus(blur )reset button
counterResetButton.blur(); 
})

// counterIncrement() if we use ivocation operator{()} with function then So counterIncrement() runs as soon as this line executes, not when you click.
// When the button is clicked, call counterIncrement(). 

 increaseButtonEl.addEventListener( 'click',counterIncrement);

 decreaseButtonEl.addEventListener('click',counterDecrement);
 // manipulating counter using key

 document.addEventListener('keydown',counterIncrement);