//Script to train logic thinking with js
//Created in 2020-07-12 by Aline Guerreiro

//function to get all numbers in a specific interval
//start: first number of interval (integer)
//end: last number for interval (integer)
function allIntervalNumbers(start,end) {
    var listAllNumbers = [] 
    for (i = start; i <= end; i++) { listAllNumbers.push(i) }   
    return listAllNumbers
}

//function to execute multiplication between two arrays and sum the products results
//arrayInt1: first array of integers to be multiplied
//arrayInt2: second array of integers to be multiplied
function multiplicationAndSumOfArrays(arrayInt1, arrayInt2){
    var sumProd = 0
    for(var i=0; i< arrayInt1.length; i++) {
        sumProd += arrayInt1[i]*arrayInt2[i]
    }
    return sumProd
}

//function auxiliar to check divisibility by seven
//arrayInt: array of integers 
function ruleSevenDivisibility(arrayInt){
    var sumProd = 0
    var prodOrder = [1,3,2,6,4,5]
    var sizeArray = arrayInt.length

    if(sizeArray < 6){
        prodOrder = prodOrder.slice(0,sizeArray)
        sumProd = multiplicationAndSumOfArrays(arrayInt,prodOrder)
    } else if(sizeArray > 6){
        var diffToAdd = sizeArray - prodOrder.length
        for(var i=0; i < diffToAdd; i++) {
            prodOrder = prodOrder.push(prodOrder[i])
        }
        sumProd = multiplicationAndSumOfArrays(arrayInt,prodOrder)        
    } else {
        sumProd = multiplicationAndSumOfArrays(arrayInt,prodOrder)
    }
    return sumProd
}

//function to compute not multiples of the numbers 2,3,4,5,6,7
//number: integer to compute your not multiplicity :) 
function checkNotMultiples(number){
        //starting some vars
        var evenNumbers = []
        var threeMultiples =[]
        var fourMultiples = []
        var fiveMultiples = []
        var sevenMultiples = []
        var notMultiples = []

        //to format the item in string 
        var itemToString = String(number)
        //to format each element of the item in an Array element
        var itemToArray = Array.from(itemToString)
        //to format each element of the Array of String in an Array of int
        var convertingElementsToInt = itemToArray.map(Number)
        //to sum each element in Array
        var sumOfEachElementOfItem = convertingElementsToInt.reduce(function(a, b){
                                                                        return a + b;
                                                                            }, 0)    
        //to get last element of the item                                                                   
        var getLastElement = parseInt(convertingElementsToInt[convertingElementsToInt.length - 1])   
        //to create a reverse array to use in seven divisibility rule
        var reverseIntArray = convertingElementsToInt.reverse()
        var prodSevenArray = ruleSevenDivisibility(reverseIntArray)
        
        if(number === 2 || number === 3 || number === 5 || number === 7) {notMultiples.push(number)}
        //to check even numbers - two multiples
        else if(number % 2 === 0) {evenNumbers.push(number)}
        //to check three multiples
        else if(sumOfEachElementOfItem % 3 === 0) {threeMultiples.push(number)}
        //to check four multiples
        else if(number % 4 === 0 || (getLastElement % 4 === 0 && getPenultElement % 4 === 0)) {fourMultiples.push(number)}
        //to check five multiples
        else if(getLastElement === 0 || getLastElement === 5) {fiveMultiples.push(number)}
        //to check seven multiples
        else if (prodSevenArray % 7 === 0) {sevenMultiples.push(number)}  
        //to create an array with only numbers without multiple :) 
        else {notMultiples.push(number)}
      
        return notMultiples
}

//function to get only not multiple number of a specific number
//array: array with integer numbers
function onlyNotMultipleNumbers(array){
    var onlyNotMultiple = array.map(function(item) {
        var notMultiples = checkNotMultiples(item)
        return notMultiples
    })
                                                               
    return onlyNotMultiple.filter(item => item != '')
                          .sort(function(a, b){return a-b})
}
                                                                
//function to compute Erastotenes Crive, more info in: https://pt.wikipedia.org/wiki/Crivo_de_Erat%C3%B3stenes
//element: integer number
//maxNumberList: maximum number to compute primes
function computeErastotenesCrive(element,maxNumberList){

    var allIntervalMediumNumbers = allIntervalNumbers(element,maxNumberList)
    var onlyNotMultiplesMedium = onlyNotMultipleNumbers(allIntervalMediumNumbers)
    var allNumbers = onlyNotMultiplesMedium.sort(function(a, b){return a-b})
                                           .toString()
    return allNumbers
}

//function to compute unique values in an array
function uniqueValues(value, index, self){
    return self.indexOf(value) === index
}

//function to compute prime numbers
function computePrimesNumbers(number){
    //start variables
    var primeNumbersAux = []
    //start from 2, the reason is because prime numbers
    //aren't start from number 1
    var allNumbers = allIntervalNumbers(2,number)
    //max number to iterate
    var maxNumber = parseInt(Math.max.apply(null,allNumbers))
    //max number of input list
    var upperLimit = parseInt(Math.floor(Math.sqrt(maxNumber)))
    //index in array of max number to iterate
    var indexLimit = allNumbers.indexOf(upperLimit)
    //array with only elements to iterate and get prime numbers
    var iterate = allNumbers.slice(0,indexLimit+1)

    var primeNumbersIntermediate = iterate.map(function(item) {
        primeNumbersAux = computeErastotenesCrive(item, maxNumber)
        return primeNumbersAux
    })

    var allPrimeNumbers = primeNumbersIntermediate.join()
                                                  .split(",")
                                                  .sort(function(a, b){return a-b})
                                                  .filter(uniqueValues)
                                                  .toString()
   return allPrimeNumbers
}

//auxiliar function with "user interface"
var readline = require("readline")
var r1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

function question(){
    r1.question("Choose a positive integer number: ", function(number){
        if(number < 0){
            console.log("You need to input a positive number")
            question()
        } else if(number == 0){
            console.log("Your interval needs to be upper than that")
            question()
        } else if(number == 1){
            console.log("There aren't primes numbers in this interval")
            question()
        } else if(number > 1){
            console.log("The primes numbers are: " + computePrimesNumbers(number))
            r1.close()
        }
    })
}

question()