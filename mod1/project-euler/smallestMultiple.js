//Script of a problem 5 solution from Project Euler
//https://projecteuler.net/problem=5
//Script create in the first class of bootcamp
//
//2520 is the smallest number that can be divided 
//by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number 
//that is evenly divisible by all of the numbers from 1 to 20?
//Answer: 232792560
//
//Created in 2020-07-13 by Aline Guerreiro

var i = 20
while(true){
    for(var j =20; j>=2 ; j--){
        isDivisible = true
        if(i % j !== 0){
            isDivisible = false
            break
        }
    }
    if(isDivisible){
        break
    }
    i++
}

console.log(i)