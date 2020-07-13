//Script created in the first iterative class 
//Main objective is to find palindrome words
//Created in 2020-07-13 by Aline Guerreiro

var word = process.argv[2]

var inverseWord = ""

for(var i=word.length -1; i>=0; i--){
    inverseWord += word[i]
}

if(word === inverseWord) {
    console.log(word + " is palindrome")
} else {
    console.log(word + " it is not palindrome")
}
