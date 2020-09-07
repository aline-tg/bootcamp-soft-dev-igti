#Script of practical-example from module 4 in Python
#Created in 2020-09-06 by Aline Guerreiro

import json

customers = ["Marcelo", "Joana D'arc", "Maria de Fátima"]
products = [{"name":"computer", "price":1000.50},
            {"name":"mouse", "price":120.10},
            {"name":"LCD Monitor", "price":999.99}]

def compute_fee(productName, quantityPurchased, products):
    for product in products:
        if(productName in product["name"]):
            priceProduct = product["price"]
            totalWithoutFee = priceProduct*quantityPurchased
            totalWithFee = totalWithoutFee + totalWithoutFee*0.1
            return priceProduct, totalWithFee, totalWithoutFee

#TODO function is not working like expected :(
def contain_name(nameInput,customers):
    for name in customers:
        if(name.upper().__contains__(nameInput.upper())):
            print("Customer:" + name.upper())
            return name
        else:
            return ""

def contain_product(nameProduct,products):
    for product in products:
        if (nameProduct in product["name"]):
            return product
    return ""

def save_purchase(nameCustomer,productName, quantityPurchased, priceProduct, totalWithFee, totalWithoutFee):
    fee = totalWithFee - totalWithoutFee
    print("Customer: {}, purchased {}, quantity of: {}, by {} (fee: {} + price {})".format(nameCustomer,productName,quantityPurchased,totalWithFee,fee,priceProduct))

productPurchased = ""
customerName = ""

while (customerName != "exit"):
    customerName = input("Enter the customer name: ")
    if(contain_name(customerName,customers) != ""):
        customerName = contain_name(customerName,customers)
        while(productPurchased != "exit"):
            productPurchased = input("Enter product name: ")
            totalPurchase = 0 
            if(contain_product(productPurchased, products) != ""):
                quantityPurchased = int(input("Enter quantity purchased: "))
                priceProduct, totalWithFee, totalWithoutFee = compute_fee(productPurchased,quantityPurchased, products)
                save_purchase(customerName,productPurchased, quantityPurchased, priceProduct, totalWithFee, totalWithoutFee)
                totalPurchase = totalPurchase + totalWithFee
            else:
                print("Enter a validity product name....")         
    else:
         print("Enter a validity customer name....")   
       