import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //Construct vending machine as a 6x6x6 array
        VendingMachine vendingMachine = new VendingMachine(6, 6, 6);
        Prices priceList = new Prices(6, 6, 6);
        //Add products to vending machine
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 0, i, "Nacho Cheese Doritos");
            priceList.addPrice(0, 0, i, 1.00);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 1, i, "Cool Ranch Doritos");
            priceList.addPrice(0, 1, i, 1.00);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 2, i, "BBQ Chips");
            priceList.addPrice(0, 2, i, 1.00);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 3, i, "Salt and Vinegar Chips");
            priceList.addPrice(0, 3, i, 1.00);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 4, i, "Ketchup Chips");
            priceList.addPrice(0, 4, i, 1.00);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 5, i, "Pickle Chips");
            priceList.addPrice(0, 5, i, 1.00);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(1, 0, i, "Fritos");
            priceList.addPrice(1, 0, i, 1.00);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(1, 1, i, "Cheetos");
            priceList.addPrice(1, 1, i, 1.00);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(1, 2, i, "Funyuns");
            priceList.addPrice(1, 2, i, 1.00);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(1, 3, i, "Pepperoni Pizza Combos");
            priceList.addPrice(1, 3, i, 1.25);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(1, 4, i, "Cheddar Cheese Combos");
            priceList.addPrice(1, 4, i, 1.25);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(1, 5, i, "Buffalo Blue Cheese Combos");
            priceList.addPrice(1, 5, i, 1.25);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(2, 0, i, "Cheddar Cheese Bacon Combos");
            priceList.addPrice(2, 0, i, 1.25);
        }
        //Welcome the user
        System.out.println("Welcome to the Vending Machine!");

            //Print visual contents
        System.out.println("Vending Machine Contents:");
            vendingMachine.display();
        System.out.println("Getting products from the vending machine:");
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
                System.out.println(i + 1 + ". " + vendingMachine.getProduct(0, i, 0));
                }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
                System.out.println(i + 7 + ". " + vendingMachine.getProduct(1, i, 0));
            }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
                System.out.println(i + 13 + ". " + vendingMachine.getProduct(2, i, 0));
            }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
                System.out.println(i + 19 + ". " + vendingMachine.getProduct(3, i, 0));
            }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
                System.out.println(i + 25 + ". " + vendingMachine.getProduct(4, i, 0));
            }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
                System.out.println(i + 31 + ". " + vendingMachine.getProduct(5, i, 0));
            }


            //Create double for tracking total income
            double totalIncome = 0.00;

            //Ask user to select item or exit
            while (true) {
                // Prompt the user for the item selection. Notice the type of input is interger
                System.out.print("Enter the item number (1-36) or 0 to exit: ");
                int choice = scanner.nextInt();
                if (choice == 0) {
                    break;
                } else if (choice < 1 || choice > 36) {
                    System.out.println("Invalid choice. Please try again.");
                } else if (choice == 1) {
                    System.out.println("You chose " + vendingMachine.getProduct(0, 0, 0));
                    System.out.println("The price is $" + priceList.getPrice(0, 0, 0));
                } else if (choice == 2) {
                System.out.println("You chose " + vendingMachine.getProduct(0, 1, 0));
                System.out.println("The price is $" + priceList.getPrice(0, 1, 0));
                } else if (choice == 3) {
                    System.out.println("You chose " + vendingMachine.getProduct(0, 2, 0));
                    System.out.println("The price is $" + priceList.getPrice(0, 2, 0));
                } else if (choice == 4) {
                    System.out.println("You chose " + vendingMachine.getProduct(0, 3, 0));
                    System.out.println("The price is $" + priceList.getPrice(0, 3, 0));
                }




            }


            //Thank user and display total income
            System.out.println("Thank you for using the Vending Machine!");
            System.out.println("Total Vending Machine Income: $" + totalIncome);

            //Close scanner input
            scanner.close();
        }
    }

