#Script of practical-example from module 4 in Python
#Created in 2020-08-29 by Aline Guerreiro

name = "Marcelo, age {} and has {} kilograms."
age = 18
weight = 90
print(name.format(age,weight))

#name2 = input("Enter your name:")
#print("Your name is:" + name2)

firstName = input("Enter your first name:").capitalize()
surname = input("Enter your surname:").capitalize()

print("The passport name is {}, {}".format(firstName,surname))
print(len(firstName), len(surname))

phrase = "123 hah uuwe".strip(" ")
print(phrase)