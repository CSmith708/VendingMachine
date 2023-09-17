import java.util.Scanner;
public class Payment {
    Scanner psc = new Scanner(System.in);
    //Create double for tracking total income
    static double totalIncome = 0.0;


    public void acceptPayment(double itemCost) {
        while (true) {
            System.out.println("Please insert cash: ");
            double cashIn = psc.nextDouble();
            if (itemCost == 404){
                break;
            }
            if (cashIn < itemCost) {
                System.out.println("Insufficient payment. Please insert more coins.");
            } else {
                totalIncome += itemCost;
                double change = cashIn - itemCost;  // Change value to return to the user
                if (change > 0) {
                    System.out.println("Change: $" + change);
                }
            break;
            }
        }
    }

    public static void getTotalIncome() {
               System.out.println("This machine collected $" + totalIncome);
           }


    }