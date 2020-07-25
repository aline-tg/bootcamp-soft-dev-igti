//Script example to learn how to create a web page
// that uses js+css+html
//This page will calculate the IMC of the user
//Created in 2020-07-14 by Aline Guerreiro

//function to compute imc (bmi = body mass index)
function computeIMC(){
    var interpretResult = ""
    var validResults = ""

    var weight = parseFloat(document.getElementById("weight").value)
    var height = parseFloat(document.getElementById("height").value)
  
    if(weight !== 0 && height !== 0){
        var imc = weight/(height*height)

        if(imc >= 40){
            interpretResult = "severe obesity :("
        } else if((imc >= 30)&&(imc <= 39.9)){
            interpretResult = "obesity :("
        } else if((imc >= 25)&&(imc <= 29.9)){
            interpretResult = "overweight :("
        } else if((imc >= 18.5)&&(imc <= 24.9)){
            interpretResult = "normal IMC. Congrats!"
        } else {
            interpretResult = "less than normal IMC :("
        }
    
    document.getElementById("result").innerHTML= "Your IMC is: " + imc.toFixed(2)
    document.getElementById("interpretResult").innerHTML = "That means you are with: " + interpretResult
    
    } else {
        validResults = "Please, input no empty information."
        document.getElementById("validResult").innerHTML = validResults
    } 
}

function cleanResults(){
    document.getElementById("weight").value = 0
    document.getElementById("height").value = 0
    document.getElementById("result").innerHTML = ""
    document.getElementById("interpretResult").innerHTML = "" 
}