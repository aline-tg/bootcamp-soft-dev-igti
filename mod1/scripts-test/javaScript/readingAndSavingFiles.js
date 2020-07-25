//Script example to learn how to read/save files in js
//Created in 2020-07-12 by Aline Guerreiro

//fs = file system
var fs = require("fs")
var fileName = "MyFile.txt"

//test if cases
var x = null
if(x){
    console.log("there is x")
} else {
    console.log("there isn't x")
}


console.log("1")

//first parameter: name of file you will create
//second parameter: what file will have
//third parameter: call back function
fs.writeFile(fileName,"any text",function(err){
    if(err !== null){
        console.log(err)
    } else {
        console.log("File created with success")
        //add new information in file
        fs.appendFile(fileName, "\n new text line", function(err){
            if(err){
                console.log(err)
            } else {

        //first parameter: file to be read
        //second parameter: format of file
        //function of call back
        fs.readFile(fileName,"utf-8",function(err,data){
            if(err){
                console.log(err)
            } else {
                console.log(data)
            }
        })

            }
        })
    }
})

console.log("2")