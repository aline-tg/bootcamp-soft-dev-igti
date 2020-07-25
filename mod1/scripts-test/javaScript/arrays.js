//Script to learn how to work with Arrays in js
//Created in 2020-07-11 by Aline Guerreiro

var brazillianCars = ["Gol", "Palio", "Uno"]
console.log(brazillianCars)

var firstBrazillianCar = brazillianCars[0]
var secondBrazillianCar = brazillianCars[1]
var thirdBrazillianCar = brazillianCars[2]

console.log("First position:" + firstBrazillianCar)
console.log("Second position:" + secondBrazillianCar)
console.log("Third position:" + thirdBrazillianCar)
console.log("Undefined position:" + brazillianCars[3])

brazillianCars[2] = "Argo"
console.log("Second position:" + brazillianCars[2])

console.log("Size of brazillianCars:" + brazillianCars.length)

console.log("Last position:" + brazillianCars[brazillianCars.length -1])

brazillianCars[brazillianCars.length] = "Fit"
console.log("Last element:" + brazillianCars[brazillianCars.length -1])

brazillianCars[10] = "Polo"
console.log("Full array:" + brazillianCars)

brazillianCars.push("Kwid")
console.log("Full array:" + brazillianCars)

brazillianCars.push(123)
console.log(brazillianCars)