//Script to train logic thinking with js
//Created in 2020-07-12 by Aline Guerreiro

//Main goal: to create a game where user can riddle a number
//The Game will need to generate a random number between 1 and 100
//After that the challenge is passed to the user that will 
//need to discover what is the number in 10 rolls
//In each roll, if player is not achieving the number
//The game needs to inform if the number is greater ou lesser
//than the chosed
//Game finishes if player achieve the number or the 10 rolls
//are used

var readline = require("readline")
var r1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})


//computes random number
function computeRandomNumber(){
    console.log("Your random number is being generated...")
    var randomNumber = Math.round(Math.random() * 100)
    if(randomNumber === 0) {
        randomNumber = 1
        return randomNumber
    }
    return randomNumber    
}

//heart of game
function question(){
    r1.question("Choose a number: ", function(number){
        number = parseInt(number)
        tryNumber--
    
        if(number === randomNumberGenerated){
            console.log("You are right! Congratulations!")
            console.log("The secret number is: "+ randomNumberGenerated)
            r1.close()
        } else if(tryNumber === 0) {
            console.log("You loose! The secret number is: " + randomNumberGenerated)
            r1.close()
        } else if(randomNumberGenerated > number){
            console.log("The secret number is greater than your try.")
            console.log("Please, try again")
            console.log("You have more " + tryNumber + " chances")
            question()
        } else {
            console.log("The secret number is lesser than your try")
            console.log("Please, try again")
            console.log("You have more " + tryNumber + "chances")
            question()
        }
        
    })
}

//main
var randomNumberGenerated = computeRandomNumber()
var tryNumber = 10
question()


