#Script of practical-example from module 4 in Python
#loops, tuple and lists
#Created in 2020-08-30 by Aline Guerreiro

#tuple are defined by square brackets
list = ["Marcelo", "Maria", "José", "João"]
#add new name in last element of list
#list.append("Joana")
#print(list)
#print(list[0])

#copying list
list2 = list.copy()
list2[0] = "Rodrigo"
#print(list)
#print(list2)

#add name in the first element
list.insert(0,"Joana")
#print(list)

#remove an element from list using value
list.remove("Maria")
#print(list)

#remove an element from list using index
retiredName = list.pop(0)
#print(list)
#print(retiredName)

if ("Marcelo" in list):
    print("There is Marcelo on list")

#tuple are defined by parentesis
tuple = ("Marcelo", "Maria", "José", "João", "Joana D'arc")
print("Marcelo" in tuple)
#we cannot change tuples

#list of dictonaries
personList = []
#how to construct dictionary
person = {
    "id": 1,
    "name": "Marcelo",
    "address": "Flowers Street, 74",
    "age": 18,
    "salary": 1000.00
}

#print(person)
#print(person['age'])

personList.append(person)
#print(personList)

person2 = {
    "id": 2,
    "name": "Marcelo",
    "address": "Roses Street, 20",
    "age": 50,
    "salary": 10000.00
}

person3 = {
    "id": 3,
    "name": "Sandra",
    "address": "Stone Street, 500",
    "age": 30,
    "salary": 5000.20
}

personList.append(person2)
personList.append(person3)
#print(personList)

#open system
correctPassword = False
tries = 3

while not correctPassword and tries > 0:
    password = input("Enter your password:")
    correctPassword = password == "secret"
    tries -= 1
    if (not correctPassword):
        print("Password is wrong")
if tries > 0:
    print("Opening system...")
else:
    print("Blocked access")

#for loop
for person in personList:
    if(person["salary"] > 1000):
        print("The person of id {} has the name of: {}".format(person["id"],person["name"]))

for number in range(2,11,2):
    print("Number {} is even".format(number))

#login again
#from getpass import getpass,getuser
#password2 = getpass("Enter your password")
#user2 = getuser()
#print(user2)

#enter item purchased and number of purchases
#to check the total amount
#when finish the purchase give the total amount of bill
products = ["Hamburguer", "French fries", "Combo", "Soda"]
prices = [15,10.5,20,5]
purchasedItems = []

purchasedValue = 0
purchasedItem = int(input("What is the identifier of purchase? "))
purchasedItems.append(products[purchasedItem])
info = input("What is the number of items purchased? ")
while (not info.isdigit()):
    info = input("What is the number of items purchased? ")
numberOfItems=int(info)

while purchasedItem != -1:
    purchasedValue = purchasedValue + (prices[purchasedItem]*numberOfItems)
    purchasedItem = int(input("What is the identifier of purchase? "))
    if (purchasedItem == -1):
        break
    info=input("What is the number of items purchased? ")
    while (not info.isdigit()):
        info = input("Number purchased needs to be a number. Try again. \n")
    numberOfItems=int(info)
print("*** Report of final purchase ***")
for item in purchasedItems:
    print("Purchased: {}".format(item))
print("*****************************************")
print("Total purchased {}".format(purchasedValue))