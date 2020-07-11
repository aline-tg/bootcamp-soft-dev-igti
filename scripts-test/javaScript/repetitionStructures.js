//Script example to learn how to work with repetition structures in js
//Created in 2020-07-11 by Aline Guerreiro

var brazillianCars = ["Gol", "Palio", "Uno", "Celta", "Sandero"]

for (var i = 0; i < brazillianCars.length; i++){
    //console.log(brazillianCars[i])
}

for (var i = brazillianCars.length - 1; i >=0; i--){
    //console.log(brazillianCars[i])
}

var i = 0
while (i < brazillianCars.length) {
    //console.log(brazillianCars[i])
    i++
}

/*while (true){
    console.log("olá")
}*/

var i=0
while(i < 10){
    if (brazillianCars[i] === "Palio"){
        //console.log("Palio found")
        break
    }
    i++
}

var numbers = [1,2,3,4,5,6,7,8,9,10]
var i = 0
while(i < numbers.length){
    var num = numbers[i]
    i++

    if(num % 2 === 0){
        //console.log(num + " it's even")
        continue
    }
    //console.log(num + " it's odd")
}

var j=30
do {
    j++
    //console.log(j)
} while (j<10)

for (var cars of brazillianCars){
    //console.log(cars)
}

for (var i = 0; i < cars.length; i++){
    console.log(cars[i])
}