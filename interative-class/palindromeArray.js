//Script created in the first iterative class 
//Main objective is to find palindrome words
//Here I try the solution using only arrays without using loop
//Created in 2020-07-13 by Aline Guerreiro

var word = process.argv[2]
var wordArray = Array.from(word)
var inverseWordString = wordArray.reverse()
                                .join("")
                                .toString()

if(word === inverseWordString) {
    console.log(word + " is palindrome")
} else {
    console.log(word + " it is not palindrome")
}