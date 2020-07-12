//Script to train logic thinking with js
//Created in 2020-07-12 by Aline Guerreiro

//listar todos os números primos menores 
//ou iguais a determinado numero

//número primo só é divísivel por 2 números
//1 e ele mesmo

//X é divisível por Y: resto da divisão de x por y é igual 
//a zero

function getPrimesNumbers(number){
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
    var iterate = allNumbers.slice(0,indexLimit)
    //console.log(allNumbers)
    console.log(indexLimit)
    console.log(upperLimit)
    console.log(iterate)

    var teste = iterate.forEach(item => {erastotenesCrive(item, maxNumber)})
    teste.concat(teste)
    console.log(teste)
    /*for(j=0; j <= iterate.length-1; j++){
        var finalPrimesNumbers = erastotenesCrive(iterate[i], maxNumber)
        finalPrimesNumbers+=
    }*/
}

//function to get all numbers in a specific interval
//start: first number of interval (integer)
//end: last number for interval (integer)
function allIntervalNumbers(start,end) {
    var listAllNumbers = [] 
    for (i = start; i <= end; i++) { listAllNumbers.push(i) }   
    return listAllNumbers
}


//Divisibilidade por 4: um número é divisível por 4 se ele for divisível duas vezes por 2 ou, então, se seus dois últimos algarismos forem divisíveis por 4.

//Divisibilidade por 7: um número é divisível por 7 se a diferença entre o dobro do último algarismo e o restante do número resultar em um número múltiplo de 7.


//function to get only not multiple number of a specific number
//array: array with integer numbers
//number: number to calculate not multiples (integer) 
function notMultipleNumbers(array){
    var onlyNotMultiple = array.filter(function(item) {
        //starting some vars
        var evenNumbers = []
        var threeMultiples =[]
        var fiveMultiples = []

        //to format the item in string 
        var itemToString = String(item)
        //to format each element of the item in an Array element
        var itemToArray = Array.from(itemToString)
        //to format each element of the Array of String in an Array of int
        var convertingElementsToInt = _.map(itemToArray,Number)
        //to sum each element in Array
        var sumOfEachElementOfItem = convertingElementsToInt.reduce(function(a, b){
                                                                        return a + b;
                                                                            }, 0)    
        //to get last element of the item                                                                   
        var getLastElement = convertingElementsToInt[convertingElementsToInt.length - 1]                                                                       
        //to check even numbers - two multiples
        if(item % 2 === 0) {evenNumbers.push(item)}
        //to check three multiples
        else if(sumOfEachElementOfItem % 3 === 0) {threeMultiples.push(item)}
        //to check five multiples
        else if(getLastElement === 0 || getLastElement === 5) {fiveMultiples.push(item)}
      })
    return onlyNotMultiple
}


//computes Erastotenes Crive https://pt.wikipedia.org/wiki/Crivo_de_Erat%C3%B3stenes
//element: integer number
//maxNumberList: maximum number to compute primes
function erastotenesCrive(element,maxNumberList){
    var firstElement = element
    var allIntervalMediumNumbers = allIntervalNumbers(element,maxNumberList)
    var onlyNotMultiplesMedium = notMultipleNumbers(allIntervalMediumNumbers,element)
    var allNumbers = onlyNotMultiplesMedium.concat(firstElement).sort(function(a, b){return a-b})
    return allNumbers
}

//getPrimesNumbers(30)

//console.log(erastotenesCrive(2,30))
//console.log(allIntervalNumbers(2,30))
//console.log(notMultipleNumbers([2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30],2))

//console.log(20%2)
/*var t = [2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30]
console.log(t.map(function(word){
    return word.length
   }) )*/

   console.log(typeof(String(10)))