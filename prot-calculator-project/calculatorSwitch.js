//Script of a prototype of calculator using js with switch
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

switch(operation){
    case "sum":
        result = num1 + num2
        break
    case "diff":
        result = num1 - num2
        break    
    case "mult":
        result = num1 * num2
        break
    case "split":
        result = num1/num2
        break    
    case "mod":
        result = num1%num2
        break
    case "perc":
        result = (num1*num2)/100
        break 
    default:
        result = 0  
    }

console.log(result)

