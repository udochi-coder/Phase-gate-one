const prompt = require("prompt-sync")();

parseInt(Math.random());

let totalscore=0;
let totalattempts=0;

for(let count=0;count < 10; count++){
let questone=parseInt(Math.random(1,100)*100);
let questtwo=parseInt(Math.random(1,10)*10);
let useranswer=parseInt(prompt("Welcome to Udochi simple arithimetic calculator app!!!!you have 10 marks for each question ! Question= " + questone + "-" + questtwo + " ="));
let answers=questone -questtwo;


if(useranswer == answers){
console.log("You are correct!!Genius!!!");
totalscore+=10;
}else{
console.log("You are slowly becoming an olodo o, simple subtraction!!Try again!!! ");
totalattempts++;
if(totalattempts == 2 ){
console.log("You missed this simple subtraction twice? why?Anyways I dont want to know ,here is the answer= " + answers   )
}
}


}

console.log("Quiz Finished");
console.log("Your Score is=" + totalscore + "/100");






























