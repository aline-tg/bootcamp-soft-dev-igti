#Script of practical-example from module 4 in Python
#Created in 2020-08-30 by Aline Guerreiro

def soma(num1, num2):
    return num1 + num2

print(soma(1,2))
print(soma(5,2))

def search_info(info):
    return input("Enter {} :".format(info))

name = search_info("name")
print(name)