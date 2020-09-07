#Script of practical-example from module 4 in Python
#Created in 2020-08-29 by Aline Guerreiro

weight = float(input("Enter your weight: "))
height = float(input("Enter your height: "))

imc = weight / (height**2)

print("Your IMC is : {}".format(imc))

if imc < 17:
    print("You are low weight")
elif (imc >=17)and(imc<18.5):
    print("You are low weight")
elif (imc >=18.5)and(imc<25):
    print("You are normal weight")
elif (imc >=25)and(imc<30):
    print("You are high weight")
elif (imc >=30)and(imc<35):
    print("You are level 1 obesidity")
elif (imc >=35)and(imc<40):
    print("You are level 2 obesidity")
elif (imc > 40):
    print("You are morbid obesidity")