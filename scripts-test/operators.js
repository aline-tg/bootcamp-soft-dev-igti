var sum = 4 + 2
var diff = 5 - 3
var prod = 5 * 4
var div = 20 / 4
var rest = 20 % 3

console.log("sum:" + sum)
console.log("diff:" + diff)
console.log("prod:" + prod)
console.log("div:" + div)
console.log("rest:" + rest)

var num1 = 10
var num2 = 50
var result = (num2 + num1)/ (8 + 2)
console.log("result: " + result)

var increment = 1
increment = increment + 1
increment++
console.log("increment:" + increment)

var aux = 5
aux += 6 //the same a + 6
console.log("add operator:" + aux)

var reduce = 5
reduce = reduce - 1
reduce--
console.log("reduce operator" + reduce)

var aux2 = 10
aux2 -= 4
console.log("reduce operator2:" + aux2)

var aux3 = 4
aux3 *= 5 
console.log("prod operator:" + aux3)

var aux4 = 20
aux4 /= 5 
console.log("div operator:" + aux4)

var a = 4
var b = 3
var add = a + b++
console.log("sum with increment after:" + add)
var add2 = a + ++b
console.log("sum with increment before:" + add2)

var c = 5
var d = 6
var sub = c + d--
console.log("sum with reduction after:" + sub)
var sub2 = c + --d
console.log("sum with reduction before:" + sub2)