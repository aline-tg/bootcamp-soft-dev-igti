#Script of practical-example from module 4 in Python
#Created in 2020-08-30 by Aline Guerreiro

#Name size
name = input("Enter your name:")
if len(name) > 20:
    print("Name needs to have lenght of maximum 20 characters")
    name = input("Enter your name:")
print("Name: {}".format(name))

#login in system
user = input("Enter your login:")
password = input("Enter your password:")
if(user == "marcelo")and(password == "secret"):
    print("System started...")
else:
    print("Wrong user or password") 

#premisses
motocycleDriverLicense = True
carDriverLicense = False
if(carDriverLicense)and(not(motocycleDriverLicense)):
    print("You are in first level")
elif(not(carDriverLicense))and(motocycleDriverLicense):
    print("You are in second level")
elif(carDriverLicense)and(motocycleDriverLicense):
    print("You are in third level")

#premisses2
question1 = input("Is this your first job?")
firstJob = question1 == "S"
question2 = input("Do you have driver license?")
driverLicense = question2 == "S"
if (firstJob)or(driverLicense):
    print("You can work in our company")
else:
    print("Sorry :( We haven't jobs with your profile")

#Dice games
#To chose the value between 1 and 6
#To chose the number of tries (max 100)
#Play two dices
#1 dice correct = 2x amount won
#2 dice correct = 10x amount won
#If any dices are equal your bet I lose all my money :[ 
from random import randrange

wallet = 100
betNumber = int(input("What is the bet number?"))
amountBet = float(input("Amount to bet: "))
if(amountBet > wallet):
    print("You don't have this money")
else:
    wallet = wallet - amountBet
    dice1 = randrange(1,6)
    dice2 = randrange(1,6)
    print("Results of dice1 {} and dice2 {}".format(dice1,dice2))
    result = 0
    if(dice1 == betNumber)and(dice2 == betNumber):
        result = amountBet * 10
        wallet = result + wallet
        print("You win {} and you are with {}".format(result,wallet))
    elif(dice1 == betNumber)or(dice2==betNumber):
        result = amountBet * 2
        wallet = result + wallet
        print("You win {} and you are with {}".format(result,wallet))
    else:
        print("You lose. In your wallet {}".format(wallet))