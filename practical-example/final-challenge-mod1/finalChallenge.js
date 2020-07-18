//Script of the last challenge of module 1 from IGTI Bootcamp
//Created in 2020-07-14 by Aline Guerreiro

//function to read an JSON external file and
//parse this like a JSON object
//fileName: name/path of file with JSON info
function jsonReader(fileName){
    var fs = require("fs")
    var data = fs.readFileSync("funcionarios.json")
    var result = JSON.parse(data)
    return result
}

//function to get the highest salary
//in a company, and return the name of the employee
//obj: JSON object format
function getHighestSalary(obj){
    var JSONlenght = Object.keys(obj).length
    var allSalaries = []
    var salaryItem = 0
    
    for(var i=0; i < JSONlenght; i++) {
        salaryItem = obj[i].salario
        allSalaries.push(salaryItem)
    }

    var maxSalary = Math.max.apply(null,allSalaries)
    var indexOfMaxSalary = allSalaries.indexOf(maxSalary)
    var maxSalaryEmployeeName = obj[indexOfMaxSalary].nome 

    return maxSalaryEmployeeName
}

//function to get the lowest salary
//in a company, and return the name of the employee
//obj: JSON object format
function getLowestSalary(obj){
    var JSONlenght = Object.keys(obj).length
    var allSalaries = []
    var salaryItem = 0
    
    for(var i=0; i < JSONlenght; i++) {
        salaryItem = obj[i].salario
        allSalaries.push(salaryItem)
    }

    var minSalary = Math.min.apply(null,allSalaries)
    var indexOfMinSalary = allSalaries.indexOf(minSalary)
    var minSalaryEmployeeName = obj[indexOfMinSalary].nome 

    return minSalaryEmployeeName
}

//function to get the mean salary of a company
//obj:JSON object format
function getMeanSalary(obj){
    var JSONlenght = Object.keys(obj).length
    var allSalaries = []
    var salaryItem = 0
    
    for(var i=0; i < JSONlenght; i++) {
        salaryItem = obj[i].salario
        allSalaries.push(salaryItem)
    }

    var sumAllvalues = allSalaries.reduce((previous, current) => current += previous)
    var computeMeanSalaries = sumAllvalues /= JSONlenght

    return computeMeanSalaries.toFixed(2)
}

//function to get the highest salary by area of company
//area = team area you want to compute highest salary
function getHighestSalaryByArea(area){
    var employees = jsonReader("funcionarios.json")
    var employeesOnly = employees.funcionarios
    
    var JSONlenght = Object.keys(employeesOnly).length
    var allEmployeesByArea = []

    for(var i=0; i < JSONlenght; i++) {
        if(employeesOnly[i].setor === area){
            allEmployeesByArea.push(employeesOnly[i])
        }
    }

    var maxSalaryEmployeeByArea = getHighestSalary(allEmployeesByArea)
    console.log(allEmployeesByArea)

    return maxSalaryEmployeeByArea
}

//function to get the lowest salary by area of company
//area = team area you want to compute lowest salary
function getLowestSalaryByArea(area){
    var employees = jsonReader("funcionarios.json")
    var employeesOnly = employees.funcionarios
    
    var JSONlenght = Object.keys(employeesOnly).length
    var allEmployeesByArea = []

    for(var i=0; i < JSONlenght; i++) {
        if(employeesOnly[i].setor === area){
            allEmployeesByArea.push(employeesOnly[i])
        }
    }

    var minSalaryEmployeeByArea = getLowestSalary(allEmployeesByArea)
    console.log(allEmployeesByArea)

    return minSalaryEmployeeByArea
}

//function to get the mean salary by area of company
//area = team area you want to compute mean salary
function getMeanSalaryByArea(area){
    var employees = jsonReader("funcionarios.json")
    var employeesOnly = employees.funcionarios
    
    var JSONlenght = Object.keys(employeesOnly).length
    var allEmployeesByArea = []

    for(var i=0; i < JSONlenght; i++) {
        if(employeesOnly[i].setor === area){
            allEmployeesByArea.push(employeesOnly[i])
        }
    }

    var meanSalaryByArea = getMeanSalary(allEmployeesByArea)

    return meanSalaryByArea
}


var employees = jsonReader("funcionarios.json")
var employeesOnly = employees.funcionarios

var teste = getMeanSalaryByArea("Comercial")
console.log(teste)

