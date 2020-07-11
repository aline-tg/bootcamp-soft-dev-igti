//Script example to learn how to work with decision structures in js
//Created in 2020-07-11 by Aline Guerreiro

var a = 40
var b = 50

if(a > b) {
    //true condition
    console.log("a is greater than b")
} else if (b > a) {
    //false condition
    console.log("b is greater than a")
} else {
    console.log("a and b are the same")
}

//identical comparison
//if(a === b) { console.log("a and b are the same as well")}

if (a > b){
    console.log("only execute when a > b")
}
console.log("always execute")

var c = 30
var d = 30
if (c >= d) {
    console.log("c is greater or equal d")
}

if (c <= d) {
    console.log("c is lesser or equal d")
}

var e = 10
var f = "10"
//when we use two equal signals, there isn't comparison of types of variables
if (e == f){
    console.log("e and f are identical")
}

var g = 10
var h = 11
if (g != h) {
    console.log("g is not equal h")
}

var i = 5
var j = 5
var k = 8
var l = 7
if ((i > j) && (l > k)) {
    console.log("i is greater than j")
}

if((i===j) || (k===l)){
    console.log("condition is true")
    if (k===8){
        console.log("k is equal 8")
    } 
}

//example of negative
console.log(!(1 > 2))
if (!(1 > 2)){
    console.log("run")
}

//switch example
var fruit = "pinapple"
var value = 0
if (fruit === "banana"){
    valor = 2
} else if (fruit === "apple") {
    value = 3
} else if (fruit === "pinapple"){
    value = 4
} else if (fruit === "melon"){
    value = 5
} else if (fruit === "grape"){
    value = 5.5
} else {
    value = 10
}
//console.log("value: "+ value)

switch(fruit){
    case "banana":
        value = 0
        break
    case "apple":
        value = 3
        break
    case "pinapple":
        value = 4
        break
    case "melon":
        value = 5
        break
    case "grape":
        value = 5.5
        break
    default:
        value = 10
}
console.log("value: "+ value)

//ternary operator
var x = 1
var y = 2
result = ""

if (x > y){
    result = "x is greater than y"
} else {
    result = "if not"
}
console.log(result)

//? question/comparison, : if not
result = x > y ? "x greater than y" : "if not"
console.log(result)