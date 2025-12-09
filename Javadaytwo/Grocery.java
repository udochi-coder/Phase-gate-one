import java.util.Scanner;
public class Grocery{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
String itemone = "Garri";
String itemtwo = "Rice";
String itemthree = "Semo";
String itemfour = "Condom";
String itemfive = "Sugar";
String itemsix = "Salt";
System.out.println("Welcome to Peace Luxury Grocery Store");
System.out.println("1. Show Items");
System.out.println("2. Add Item");
System.out.println("3. Remove Item");
System.out.println("4. Exit");
System.out.print("Enter what you want,please don't waste my time!!= ");
int customerchoice = input.nextInt();
input.nextLine();
while (true){
if (customerchoice == 1) {
System.out.println("\nAvailable Items: ");
System.out.println("1."+ itemone);
System.out.println("2." + itemtwo);
System.out.println("3." + itemthree);
System.out.println("4." + itemfour);
System.out.println("5." + itemfive);
System.out.println("6." + itemsix);
input.nextLine();
}  
if (customerchoice == 2) {
System.out.print("Enter new item: ");
input.nextLine();
}
if (customerchoice == 3) {
System.out.print("Abeg enter the item to remove 1, 2,3,4,5,6= ");
int removeone = input.nextInt();
input.nextLine();
}
if(customerchoice == 4) {
break;
}
}
}
}


