//Script of a prototype of calculator using js with conditional ifs
//Main operations:
//Sum, difference, multiplication, splitting
//Mod, percent 
//Created in 2020-07-11 by Aline Guerreiro

//method to input parameters
//console.log(process.argv)

//type of operation to compute
var operation = process.argv[2] 

//input numbers for computation
var num1 = parseInt(process.argv[3])
var num2 = parseInt(process.argv[4])

//result of operation computed
var result = 0

if (operation === "sum"){
    result = num1 + num2
} else if (operation === "diff"){
    result = num1 - num2
} else if (operation === "mult"){
    result = num1 * num2
} else if (operation === "split"){
    result = num1/num2
} else if (operation === "mod"){
    result = num1%num2
} else if (operation === "perc"){
    result = (num1*num2)/100
} 
console.log(result)

