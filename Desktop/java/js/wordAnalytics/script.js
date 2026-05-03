const textareaEl = document.querySelector('.textarea');
const characterNumberEl = document.querySelector('.stat__number--characters');
const twitterNumberEl = document.querySelector('.stat__number--twitter');
const facebookNumberEl = document.querySelector('.stat__number--facebook');
const wordsNumberEl = document.querySelector('.stat__number--words');

const eventHandler =()=>{
// input validation example
    if(textareaEl.value.includes('<script>')){
    alert('you cannot run this script in textarea');
    textareaEl.value = textareaEl.value.replace('<script>','wrong input');
}
  //determine new numbers
  
   const numberOfCharacters = textareaEl.value.length ;
   let numberOfWords = textareaEl.value.split(' ').length;
 if(textareaEl.value == 0){
    numberOfWords = 0;
 }
   const twitterCharaterleft = 280 - numberOfCharacters;
   const facebookCharaterLeft = 2200 - numberOfCharacters; 

   // add visual indicator for limit
if(twitterCharaterleft < 0){
    twitterNumberEl.classList.add('stat__number--limit');
}else{
    twitterNumberEl.classList.remove('stat__number--limit');
}

if(facebookCharaterLeft < 0 ){
    facebookNumberEl.classList.add('stat__number--limit');
}
else{
    facebookNumberEl.classList.remove('stat__number--limit');
}

   //set new numbers
wordsNumberEl.textContent= numberOfWords;
 characterNumberEl.textContent = numberOfCharacters;
 twitterNumberEl.textContent = twitterCharaterleft;

 facebookNumberEl.textContent = facebookCharaterLeft;

    
}

textareaEl.addEventListener('input',eventHandler);
    