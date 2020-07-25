//Script of a problem 1 solution from Project Euler
//The main objective is get multiples of three and five
//https://projecteuler.net/problem=1
//
//If we list all the natural numbers below 10 that
// are multiples of 3 or 5, we get 3, 5, 6 and 9. 
//The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.
//
//Answer is 233168
//Created in 2020-07-11 by Aline Guerreiro

var multiples = []
for (var i=0; i < 1000; i++){
    if ((i%3 === 0) || (i%5 === 0)){
        multiples.push(i)
    }
}

var sum = 0
for (var i=0; i< multiples.length; i++){
    sum += multiples[i]
}
console.log(sum)