import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Construct vending machine as a 6x6x6 array
        VendingMachine vendingMachine = new VendingMachine(6, 6, 6);
        Prices priceList = new Prices(6, 6, 6);
        Calories calories = new Calories(6,6,6);
        Payment payment = new Payment();
        //Add products to vending machine
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 0, i, "Nacho Cheese Doritos");
            priceList.addPrice(0, 0, i, 1.00);
            calories.addCals(0,0, i,160);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 1, i, "Cool Ranch Doritos");
            priceList.addPrice(0, 1, i, 1.00);
            calories.addCals(0, 1, i, 140);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 2, i, "BBQ Chips");
            priceList.addPrice(0, 2, i, 1.00);
            calories.addCals(0, 2, i, 170);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 3, i, "Salt and Vinegar Chips");
            priceList.addPrice(0, 3, i, 1.00);
            calories.addCals(0, 3, i, 150);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 4, i, "Ketchup Chips");
            priceList.addPrice(0, 4, i, 1.00);
            calories.addCals(0, 4, i, 120);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 5, i, "Pickle Chips");
            priceList.addPrice(0, 5, i, 1.00);
            calories.addCals(0, 5, i, 200);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(1, 0, i, "Fritos");
            priceList.addPrice(1, 0, i, 1.00);
            calories.addCals(1, 0, i, 260);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(1, 1, i, "Cheetos");
            priceList.addPrice(1, 1, i, 1.00);
            calories.addCals(1, 1, i, 240);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(1, 2, i, "Funyuns");
            priceList.addPrice(1, 2, i, 1.00);
            calories.addCals(1, 2, i, 160);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(1, 3, i, "Pepperoni Pizza Combos");
            priceList.addPrice(1, 3, i, 1.25);
            calories.addCals(1, 3, i, 290);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(1, 4, i, "Cheddar Cheese Combos");
            priceList.addPrice(1, 4, i, 1.25);
            calories.addCals(1, 4, i, 100);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(1, 5, i, "Buffalo Blue Cheese Combos");
            priceList.addPrice(1, 5, i, 1.25);
            calories.addCals(1, 5, i, 180);
        }
        for (int i = 0; i <= vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(2, 0, i, "Cheddar Cheese Bacon Combos");
            priceList.addPrice(2, 0, i, 1.25);
            calories.addCals(2, 0, i, 160);

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



        //Create integers for while loop to iterate through the depth of the array
        int a = 0; int b = 0; int c = 0; int d = 0; int e = 0; int f = 0; int g = 0; int h = 0; int i = 0; int j = 0; int k = 0; int l = 0; int m = 0; int n = 0; int o = 0; int p = 0; int q = 0; int r = 0; int s = 0; int t = 0; int u = 0; int v = 0; int w = 0; int x = 0; int y = 0; int z = 0; int aa = 0; int ab = 0; int ac = 0; int ad = 0; int ae = 0; int af = 0; int ag = 0; int ah = 0; int ai = 0;int aj = 0;
        //Infinite loop to keep machine running until exit is chosen
        while (true) {
            // Prompt the user for the item selection
            System.out.print("Enter the item number (1-36) or 0 to exit: ");
            int choice = scanner.nextInt();
            //Escape choice
            if (choice == 0) {
                break;
            //Check for invalid choices
            } else if (choice < 1 || choice > 36) {
                System.out.println("Invalid choice. Please try again.");
            //Match user selection to array position
                 } else if (choice == 1) {
                    System.out.println("You chose " + vendingMachine.getProduct(0, 0, a));
                    System.out.println("The price is $" + priceList.getPrice(0, 0, a));
                    System.out.println("Product Calories: " + calories.getCals(0,0,a));
                    payment.acceptPayment(priceList.getPrice(0, 0, a));
                    vendingMachine.vendProduct(0, 0, a);
                    a += 1;
                } else if (choice == 2) {
                    System.out.println("You chose " + vendingMachine.getProduct(0, 1, b));
                    System.out.println("The price is $" + priceList.getPrice(0, 1, b));
                    System.out.println("Product Calories: " + calories.getCals(0, 1, b));
                    payment.acceptPayment(priceList.getPrice(0, 1, b));
                    vendingMachine.vendProduct(0, 1, b);
                    b += 1;
                } else if (choice == 3) {
                    System.out.println("You chose " + vendingMachine.getProduct(0, 2, c));
                    System.out.println("The price is $" + priceList.getPrice(0, 2, c));
                    System.out.println("Product Calories: " + calories.getCals(0, 2, c));
                    payment.acceptPayment(priceList.getPrice(0, 2, c));
                    vendingMachine.vendProduct(0, 2, c);
                    c += 1;
                } else if (choice == 4) {
                    System.out.println("You chose " + vendingMachine.getProduct(0, 3, d));
                    System.out.println("The price is $" + priceList.getPrice(0, 3, d));
                    System.out.println("Product Calories: " + calories.getCals(0, 3, d));
                    System.out.println("Product Calories: " + calories.getCals(0, 3, d));
                    payment.acceptPayment(priceList.getPrice(0, 3, d));
                    vendingMachine.vendProduct(0, 3, d);
                    d += 1;
                }else if (choice == 5) {
                    System.out.println("You chose " + vendingMachine.getProduct(0, 4, e));
                    System.out.println("The price is $" + priceList.getPrice(0, 4, e));
                    System.out.println("Product Calories: " + calories.getCals(0, 4, e));
                    payment.acceptPayment(priceList.getPrice(0, 4, e));
                    vendingMachine.vendProduct(0, 4, e);
                    e += 1;
                }else if (choice == 6) {
                    System.out.println("You chose " + vendingMachine.getProduct(0, 5, f));
                    System.out.println("The price is $" + priceList.getPrice(0, 5, f));
                    System.out.println("Product Calories: " + calories.getCals(0, 5, f));
                    payment.acceptPayment(priceList.getPrice(0, 5, f));
                    vendingMachine.vendProduct(0, 5, f);
                    f += 1;
                }else if (choice == 7) {
                    System.out.println("You chose " + vendingMachine.getProduct(1, 0, g));
                    System.out.println("The price is $" + priceList.getPrice(1, 0, g));
                    System.out.println("Product Calories: " + calories.getCals(1, 0, g));
                    payment.acceptPayment(priceList.getPrice(1, 0, g));
                    vendingMachine.vendProduct(1, 0, g);
                    g += 1;
                }else if (choice == 8) {
                    System.out.println("You chose " + vendingMachine.getProduct(1, 1, h));
                    System.out.println("The price is $" + priceList.getPrice(1, 1, h));
                    System.out.println("Product Calories: " + calories.getCals(1, 1, h));
                    payment.acceptPayment(priceList.getPrice(1, 1, h));
                    vendingMachine.vendProduct(1, 1, h);
                    h += 1;
                }else if (choice == 9) {
                    System.out.println("You chose " + vendingMachine.getProduct(1, 2, i));
                    System.out.println("The price is $" + priceList.getPrice(1, 2, i));
                    System.out.println("Product Calories: " + calories.getCals(1, 2, i));
                    payment.acceptPayment(priceList.getPrice(1, 2, i));
                    vendingMachine.vendProduct(1, 2, i);
                    i += 1;
                }else if (choice == 10) {
                    System.out.println("You chose " + vendingMachine.getProduct(1, 3, j));
                    System.out.println("The price is $" + priceList.getPrice(1, 3, j));
                    System.out.println("Product Calories: " + calories.getCals(1, 3, j));
                    payment.acceptPayment(priceList.getPrice(1, 3, j));
                    vendingMachine.vendProduct(1, 3, j);
                    j += 1;
                }else if (choice == 11) {
                    System.out.println("You chose " + vendingMachine.getProduct(1, 4, k));
                    System.out.println("The price is $" + priceList.getPrice(1, 4, k));
                    System.out.println("Product Calories: " + calories.getCals(1, 4, k));
                    payment.acceptPayment(priceList.getPrice(1, 4, k));
                    vendingMachine.vendProduct(1, 4, k);
                    k += 1;
                }else if (choice == 12) {
                    System.out.println("You chose " + vendingMachine.getProduct(1, 5, l));
                    System.out.println("The price is $" + priceList.getPrice(1, 5, l));
                    System.out.println("Product Calories: " + calories.getCals(1, 5, l));
                    payment.acceptPayment(priceList.getPrice(1, 5, l));
                    vendingMachine.vendProduct(1, 5, l);
                    l += 1;
                }else if (choice == 13) {
                    System.out.println("You chose " + vendingMachine.getProduct(2, 0, m));
                    System.out.println("The price is $" + priceList.getPrice(2, 0, m));
                    System.out.println("Product Calories: " + calories.getCals(2, 0, m));
                    payment.acceptPayment(priceList.getPrice(2, 0, m));
                    vendingMachine.vendProduct(2, 0, m);
                    m += 1;
                }else if (choice == 14) {
                    System.out.println("You chose " + vendingMachine.getProduct(2, 1, n));
                    System.out.println("The price is $" + priceList.getPrice(2, 1, n));
                    System.out.println("Product Calories: " + calories.getCals(2, 1, n));
                    payment.acceptPayment(priceList.getPrice(2, 1, n));
                    vendingMachine.vendProduct(2, 1, n);
                    n += 1;
                }else if (choice == 15) {
                    System.out.println("You chose " + vendingMachine.getProduct(2, 2, o));
                    System.out.println("The price is $" + priceList.getPrice(2, 2, o));
                    System.out.println("Product Calories: " + calories.getCals(2, 2, o));
                    payment.acceptPayment(priceList.getPrice(2, 2, o));
                    vendingMachine.vendProduct(2, 2, o);
                    o += 1;
                }else if (choice == 16) {
                    System.out.println("You chose " + vendingMachine.getProduct(2, 3, p));
                    System.out.println("The price is $" + priceList.getPrice(2, 3, p));
                    System.out.println("Product Calories: " + calories.getCals(2, 3, p));
                    payment.acceptPayment(priceList.getPrice(2, 3, p));
                    vendingMachine.vendProduct(2, 3, p);
                    p += 1;
                }else if (choice == 17) {
                    System.out.println("You chose " + vendingMachine.getProduct(2, 4, q));
                    System.out.println("The price is $" + priceList.getPrice(2, 4, q));
                    System.out.println("Product Calories: " + calories.getCals(2, 4, q));
                    payment.acceptPayment(priceList.getPrice(2, 4, q));
                    vendingMachine.vendProduct(2, 4, q);
                    q += 1;
                }else if (choice == 18) {
                    System.out.println("You chose " + vendingMachine.getProduct(2, 5, r));
                    System.out.println("The price is $" + priceList.getPrice(2, 5, r));
                    System.out.println("Product Calories: " + calories.getCals(2, 5, r));
                    payment.acceptPayment(priceList.getPrice(2, 5, r));
                    vendingMachine.vendProduct(2, 5, r);
                    r += 1;
                }else if (choice == 19) {
                    System.out.println("You chose " + vendingMachine.getProduct(3, 0, s));
                    System.out.println("The price is $" + priceList.getPrice(3, 0, s));
                    System.out.println("Product Calories: " + calories.getCals(3, 0, s));
                    payment.acceptPayment(priceList.getPrice(3, 0, s));
                    vendingMachine.vendProduct(3, 0, s);
                    s += 1;
                }else if (choice == 20) {
                    System.out.println("You chose " + vendingMachine.getProduct(3, 1, t));
                    System.out.println("The price is $" + priceList.getPrice(3, 1, t));
                    System.out.println("Product Calories: " + calories.getCals(3, 1, t));
                    payment.acceptPayment(priceList.getPrice(3, 1, t));
                    vendingMachine.vendProduct(3, 1, t);
                    t += 1;
                }else if (choice == 21) {
                    System.out.println("You chose " + vendingMachine.getProduct(3, 2, u));
                    System.out.println("The price is $" + priceList.getPrice(3, 2, u));
                    System.out.println("Product Calories: " + calories.getCals(3, 2, u));
                    payment.acceptPayment(priceList.getPrice(3, 2, u));
                    vendingMachine.vendProduct(3, 2, u);
                    u += 1;
                }else if (choice == 22) {
                    System.out.println("You chose " + vendingMachine.getProduct(3, 3, v));
                    System.out.println("The price is $" + priceList.getPrice(3, 3, v));
                    System.out.println("Product Calories: " + calories.getCals(3, 3, v));
                    payment.acceptPayment(priceList.getPrice(3, 3, v));
                    vendingMachine.vendProduct(3, 3, v);
                    v += 1;
                }else if (choice == 23) {
                    System.out.println("You chose " + vendingMachine.getProduct(3, 4, w));
                    System.out.println("The price is $" + priceList.getPrice(3, 4, w));
                    System.out.println("Product Calories: " + calories.getCals(3, 4, w));
                    payment.acceptPayment(priceList.getPrice(3, 4, w));
                    vendingMachine.vendProduct(3, 4, w);
                    w += 1;
                }else if (choice == 24) {
                    System.out.println("You chose " + vendingMachine.getProduct(3, 5, x));
                    System.out.println("The price is $" + priceList.getPrice(3, 5, x));
                    System.out.println("Product Calories: " + calories.getCals(3, 5, x));
                    payment.acceptPayment(priceList.getPrice(3, 5, x));
                    vendingMachine.vendProduct(3, 5, x);
                    x += 1;
                }else if (choice == 25) {
                    System.out.println("You chose " + vendingMachine.getProduct(4, 0, y));
                    System.out.println("The price is $" + priceList.getPrice(4, 0, y));
                    System.out.println("Product Calories: " + calories.getCals(4, 0, y));
                    payment.acceptPayment(priceList.getPrice(4, 0, y));
                    vendingMachine.vendProduct(4, 0, y);
                    y += 1;
                }else if (choice == 26) {
                    System.out.println("You chose " + vendingMachine.getProduct(4, 1, z));
                    System.out.println("The price is $" + priceList.getPrice(4, 1, z));
                    System.out.println("Product Calories: " + calories.getCals(4, 1, z));
                    payment.acceptPayment(priceList.getPrice(4, 1, z));
                    vendingMachine.vendProduct(4, 1, z);
                    z += 1;
                }else if (choice == 27) {
                    System.out.println("You chose " + vendingMachine.getProduct(4, 2, aa));
                    System.out.println("The price is $" + priceList.getPrice(4, 2, aa));
                    System.out.println("Product Calories: " + calories.getCals(4, 2, aa));
                    payment.acceptPayment(priceList.getPrice(4, 2, aa));
                    vendingMachine.vendProduct(4, 2, aa);
                    aa += 1;
                }else if (choice == 28) {
                    System.out.println("You chose " + vendingMachine.getProduct(4, 3, ab));
                    System.out.println("The price is $" + priceList.getPrice(4, 3, ab));
                    System.out.println("Product Calories: " + calories.getCals(4, 3, ab));
                    payment.acceptPayment(priceList.getPrice(4, 3, ab));
                    vendingMachine.vendProduct(4, 3, ab);
                    ab += 1;
                }else if (choice == 29) {
                    System.out.println("You chose " + vendingMachine.getProduct(4, 4, ac));
                    System.out.println("The price is $" + priceList.getPrice(4, 4, ac));
                    System.out.println("Product Calories: " + calories.getCals(4, 4, ac));
                    payment.acceptPayment(priceList.getPrice(4, 4, ac));
                    vendingMachine.vendProduct(4, 4, ac);
                    ac += 1;
                }else if (choice == 30) {
                    System.out.println("You chose " + vendingMachine.getProduct(4, 5, ad));
                    System.out.println("The price is $" + priceList.getPrice(4, 5, ad));
                    System.out.println("Product Calories: " + calories.getCals(4, 5, ad));
                    payment.acceptPayment(priceList.getPrice(4, 5, ad));
                    vendingMachine.vendProduct(4, 5, ad);
                    ad += 1;
                }else if (choice == 31) {
                    System.out.println("You chose " + vendingMachine.getProduct(5, 0, ae));
                    System.out.println("The price is $" + priceList.getPrice(5, 0, ae));
                    System.out.println("Product Calories: " + calories.getCals(5, 0, ae));
                    payment.acceptPayment(priceList.getPrice(5, 0, ae));
                    vendingMachine.vendProduct(5, 0, ae);
                    ae += 1;
                }else if (choice == 32) {
                    System.out.println("You chose " + vendingMachine.getProduct(5, 1, af));
                    System.out.println("The price is $" + priceList.getPrice(5, 0, af));
                    System.out.println("Product Calories: " + calories.getCals(5, 1, af));
                    payment.acceptPayment(priceList.getPrice(5, 1, af));
                    vendingMachine.vendProduct(5, 1, af);
                    af += 1;
                }else if (choice == 33) {
                    System.out.println("You chose " + vendingMachine.getProduct(5, 2, ag));
                    System.out.println("The price is $" + priceList.getPrice(5, 2, ag));
                    System.out.println("Product Calories: " + calories.getCals(5, 2, ag));
                    payment.acceptPayment(priceList.getPrice(5, 2, ag));
                    vendingMachine.vendProduct(5, 2, ag);
                    ag += 1;
                }else if (choice == 34) {
                    System.out.println("You chose " + vendingMachine.getProduct(5, 3, ah));
                    System.out.println("The price is $" + priceList.getPrice(5, 3, ah));
                    System.out.println("Product Calories: " + calories.getCals(5, 3, ah));
                    payment.acceptPayment(priceList.getPrice(5, 3, ah));
                    vendingMachine.vendProduct(5, 3, ah);
                    ah += 1;
                }else if (choice == 35) {
                    System.out.println("You chose " + vendingMachine.getProduct(5, 4, ai));
                    System.out.println("The price is $" + priceList.getPrice(5, 4, ai));
                    System.out.println("Product Calories: " + calories.getCals(5, 4, ai));
                    payment.acceptPayment(priceList.getPrice(5, 4, ai));
                    vendingMachine.vendProduct(5, 4, ai);
                    ai += 1;
                }else if (choice == 36) {
                    System.out.println("You chose " + vendingMachine.getProduct(5, 5, aj));
                    System.out.println("The price is $" + priceList.getPrice(5, 5, aj));
                    System.out.println("Product Calories: " + calories.getCals(5, 5, aj));
                    payment.acceptPayment(priceList.getPrice(5, 5, aj));
                    vendingMachine.vendProduct(5, 5, aj);
                    aj += 1;
                }
            }



            //Thank user and display total income
            System.out.println("Thank you for using the Vending Machine!");
            Payment.getTotalIncome();

            //Close scanner input
            scanner.close();
        }
    }

