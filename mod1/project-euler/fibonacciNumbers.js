//Script of a problem 2 solution from Project Euler
//The main objective is get the numbers of Fibonacci sequence
//https://projecteuler.net/problem=2
//script create in the first class of bootcamp
//
//Each new term in the Fibonacci sequence is generated 
//by adding the previous two terms. 
//By starting with 1 and 2, the first 10 terms will be:
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//By considering the terms in the Fibonacci sequence whose 
//values do not exceed four million, 
//find the sum of the even-valued terms.
//Answer: 4613732
//
//Created in 2020-07-13 by Aline Guerreiro

var array = [1,2]
//var evenNumbers = []
var sum = 0
var i = 2
var value = 0 

while (value < 4000000){
    if(value != 0){
        array.push(value)
    }
    
    value = array[i-1] + array[i-2]
    i++
} 

for (var j=0; j<array.length; j++){
    if(array[j] % 2 === 0){
        //evenNumbers.push(array[j])
        sum += array[j]
    }
}

console.log(sum)

//incorpored in 2
//var sum = 0
//for (var k = 0; k < evenNumbers.length; k++){
//    sum = sum + evenNumbers[k]
//}