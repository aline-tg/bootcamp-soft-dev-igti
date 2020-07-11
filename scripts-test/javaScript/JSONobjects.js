//Script to learn how work with JSONs using js
//JSON JavaScriptObjectNotation
//Created in 2020-07-10 by Aline Guerreiro

var person = {
    name: "John",
    age: 40,
    phone: "(99) 9999-9999",
    haveCar: true,
    domesticAnimals:["Cookie", "Lassie"],
    parentalFather: {
        name: "Matt",
        age: 60
    }
}

console.log(person)
console.log(person.name)
console.log(person.parentalFather)

//Add domesticAnimal
person.domesticAnimals.push("Rafael")
console.log(person)

person.name += " Silva"
console.log(person)

printPersonData(person)

function printPersonData(person){
    console.log(person.name)
}

person.parentalMother = {
    name: "Maria",
    age: 60
}
console.log(person)

//conver to string
console.log(JSON.stringify(person))