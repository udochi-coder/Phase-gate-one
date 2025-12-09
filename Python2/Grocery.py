itemone = "Garri"
itemtwo = "Rice"
itemthree = "Semo"
itemfour = "Condom"
itemfive = "Sugar"
itemsix = "Salt"


print("Welcome to Peace Luxury Grocery Store")
print("1. Show Items")
print("2. Add Item")
print("3. Remove Item")
print("4. Exit")
customerchoice=int(input("Enter what you want,please don't waste my time!!= "))

while True:
    if customerchoice == 1:
        print("Available Items: ");
        print("1.", itemone);
        print("2." ,itemtwo);
        print("3." , itemthree);
        print("4." , itemfour);
        print("5." ,itemfive);
        print("6." , itemsix);
        break

    if customerchoice == 2:
        additem=input("Enter the new item you want to add since you like adding things: ")
        break


    if customerchoice == 3:
        removeitem=int(input("Abeg enter the item to remove 1, 2,3,4,5,6: "))
        break

    if customerchoice == 4:
        break

