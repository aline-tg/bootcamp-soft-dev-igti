//Script to learn how work with functions using js
//Created in 2020-07-10 by Aline Guerreiro

//it computes multiplication of two numbers
function multiplication(p1,p2){
    console.log("function multiplication executed")
    result = p1*p2
    return result
}

var resultPrint = multiplication(4,3)
console.log(resultPrint)
console.log(multiplication(10,2))

//it says welcome to specific name
function hello(name){
    console.log("Hi " + name + "! Welcome :)")
}
hello("Aline")

//it computes the sum of 2 plus 1
function withoutParameter(){
    var a=1
    var b=2
    console.log(a + b)
}
withoutParameter()

