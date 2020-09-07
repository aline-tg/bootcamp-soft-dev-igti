#Script of practical-example from module 4 in Python
#Created in 2020-08-30 by Aline Guerreiro

#methods
def contain_name(nameInput,customers):
    for name in customers:
        if(name.upper().__contains__(nameInput.upper())):
            print("Customer:" + name.upper())
            return name
        else:
            return ""

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
        if (productName.upper() in product["name"].upper()):
            index = i
            break
    return index

def process_purchase(purchasedItems):
    purchasedItem = read_purchased_items(products)
    if (purchasedItem == -1):
        return -1,0
    purchasedItems.append(products[purchasedItem]["name"])
    numberOfItems= read_number()
    feeValues.append(numberOfItems*products[purchasedItem]["price"]*0.1)
    return purchasedItem,numberOfItems,feeValues

customers = ["Marcelo", "Joana D'arc", "Maria de Fátima"]
products = [{"name":"computer", "price":1000.50},
            {"name":"mouse", "price":120.10},
            {"name":"LCD Monitor", "price":999.99}]
purchasedItems = []
feeValues = []
purchasedValue = 0
purchasedItem,numberOfItems,feeValues = process_purchase(purchasedItems)

while purchasedItem != -1:
    nameInput = input("Enter the customer name:")

    if (contain_name(nameInput,customers) != ""):

        byItem = (products[purchasedItem]["price"]*numberOfItems) + (products[purchasedItem]["price"]*numberOfItems*0.1)
        purchasedValue = purchasedValue + byItem
        purchasedItem,numberOfItems,feeValues = process_purchase(purchasedItems)
       
    else:
        print("There isn't this customer, please retry.")
        #nameInput = input("Enter the customer name:")

print("*** Report of final purchase ***")
for item in purchasedItems and fee in feeValues:
    print("Purchased: {}, Fee: {}".format(item))
print("*****************************************")
print("Total purchased {}".format(purchasedValue))