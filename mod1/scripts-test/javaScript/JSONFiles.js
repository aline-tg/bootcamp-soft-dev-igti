//Script example to learn how to create JSON files in js
//Created in 2020-07-12 by Aline Guerreiro

var fs = require("fs")
var cars = ["Gol", "Palio", "Uno", "Celta"]
var fileName = "carsTest.json"

var carSale = {
    name: "Chevrolet",
    cars
}

fs.writeFile(fileName,JSON.stringify(carSale), function(err){
    if(err){
        console.log(err)
    } else {
        fs.readFile(fileName, "utf-8",function(err,data){
            if(err){
                console.log(err)
            } else {
                var obj = JSON.parse(data)
                obj.cars.push("HRV")
                fs.writeFile(fileName,JSON.stringify(obj),function(err){
                    if(err){
                        console.log(err)
                    }
                })
            }
        })
    }
})

