//Script example to learn how to create a web page
// that uses js+css+html
//Created in 2020-07-14 by Aline Guerreiro

console.log("Hello World in external file")
document.write("Any text")

//DOM - Document Object Model
//function to test buttom clicks
function buttonClick(){
    document.getElementById("secondParagraph")
            .style.display = "none"
    document.getElementsByClassName("paragraph")
    
    for(var i=0; i<document.getElementsByClassName("paragraph").length; i++){
        document.getElementsByClassName("paragraph")[i].style.color = "blue"
        document.getElementsByClassName("paragraph")[i].style.color = "bold"
    }
}

//function to test buttom clicks
function buttonClick2(){
    document.getElementById("secondParagraph")
            .style.display = "block"
    var buttons = document.getElementsByTagName("button")
    var i =0
    while(i< buttons.length){
        buttons[i].style.fontSize = "20px"
        i++
    }
}

//function to turn on the lamp image
function turnOnLamp(){
    document.getElementById("lamp").src = "lampon.jpg"
}

//function to turn off the lamp image
function turnOffLamp(){
    document.getElementById("lamp").src = "lampoff.jpg"
}

//function to add elements in a page
var elementsQuant=0
function addElements(){
    var element = document.createElement("P")
    element.innerHTML = "element " + elementsQuant
    elementsQuant++
    document.getElementById("div-elements").appendChild(element)
}

//function to remove elements in a page
function removeElements(){
    var childs = document.getElementById("div-elements").childNodes
    var childsSize = childs.length
    for(var i=0; i< childsSize; i++){
        document.getElementById("div-elements").removeChild(childs[0])
    }
}