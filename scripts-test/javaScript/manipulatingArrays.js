//Script example to learn how to work with arrays manipulation in js
//Created in 2020-07-12 by Aline Guerreiro

var brazillianCars = ["Gol", "Palio", "Uno", "Sandero"]

//pop removes the last element from array
//pop returns the element that will be removed
var brazillianCarsWithoutLastElement = brazillianCars.pop()
console.log(brazillianCarsWithoutLastElement)
console.log(brazillianCars)

//push adds a new element like the last position in an array
//push returns the new length of your array
brazillianCars.push("Kwid")
console.log(brazillianCars)

//shift removes the first element from array
//shift returns the element that will be removed
brazillianCars.shift()
console.log(brazillianCars)

//unshift adds an element in the first position of array
//unshift returns the new size of the updated array
brazillianCars.unshift("Onix")
console.log(brazillianCars)

//how to replace values in an array
brazillianCars[2] = "New Uno"
console.log(brazillianCars)

//delete removes the element chosed without replace any value
delete brazillianCars[2]
console.log(brazillianCars)

//splice add elements in an array from a specified position
//you can choose if we can delete or not the elements when replaced
//first parameter: initial position
//second parameter: number of possible removed elements
//third parameter: all elements you want to add in array
brazillianCars.splice(2,0,"HRV","Creta")
console.log(brazillianCars)

brazillianCars.splice(2,1)
console.log(brazillianCars)

//concat: concatenating two arrays using concat :) 
//you can concat many arrays at the same time
var oldBrazillianCars = ["Brasilia", "Monza", "Fusca"]
var oldBrazillianCars2 = ["Corcel", "Chevete"]
var allBrazillianCars = brazillianCars.concat(oldBrazillianCars,oldBrazillianCars2)
console.log(allBrazillianCars)

//slice: remove the first element and it creates a new array
//slice can accept two elements
//first parameter: initial position
//second parameter(optional): final position not included
var newArrays = allBrazillianCars.slice(1)
console.log(allBrazillianCars)
console.log(newArrays)

var newArrays2 = allBrazillianCars.slice(2,5)
console.log(newArrays2)