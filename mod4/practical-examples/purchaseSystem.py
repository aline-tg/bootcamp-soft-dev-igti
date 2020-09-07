#Script of practical-example from module 4 in Python
#Created in 2020-08-30 by Aline Guerreiro

#enter item purchased and number of purchases
#to check the total amount
#when finish the purchase give the total amount of bill

#methods
def read_number():
    info = input("What is the number of items purchased? ")
    while (not info.isdigit()):
        info = input("What is the number of items purchased? ")
    return int(info)

def read_purchased_items(products):
    productName = input("Enter the name of product. (to finish press ENTER) \n")
    index = -1
    if(productName == ""):
        return -1
    for i,product in enumerate(products):
        if (productName.upper() in product.upper()):
            index = i
            break
    return index

def process_purchase(purchasedItems):
    purchasedItem = read_purchased_items(products)
    if (purchasedItem == -1):
        return -1,0
    purchasedItems.append(products[purchasedItem])
    numberOfItems= read_number()
    return purchasedItem,numberOfItems

products = ["Hamburguer", "French fries", "Combo", "Soda"]
prices = [15,10.5,20,5]
purchasedItems = []
purchasedValue = 0
purchasedItem,numberOfItems = process_purchase(purchasedItems)

while purchasedItem != -1:
    purchasedValue = purchasedValue + (prices[purchasedItem]*numberOfItems)
    purchasedItem,numberOfItems = process_purchase(purchasedItems)

print("*** Report of final purchase ***")
for item in purchasedItems:
    print("Purchased: {}".format(item))
print("*****************************************")
print("Total purchased {}".format(purchasedValue))