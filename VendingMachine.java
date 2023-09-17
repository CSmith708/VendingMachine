    public class VendingMachine {
        //Define the class level Multi-dimensional array to store product information
        public String[][][] products;


        //Constructor Method takes input to create 3-dimensional array
        public VendingMachine(int rows, int cols, int depth) {
            // Declare and dimension a 3-dimensional array of strings
            products = new String[rows][cols][depth];
        }

        // Method to add a product to the vending machine element/slot in the Multi-dimensional array
        public void addProduct(int row, int col, int depth, String productName) {
            if (row >= 0 && row < products.length && col >= 0 && col < products[0].length && depth >= 0 && depth < products[1].length) {
                products[row][col][depth] = productName;
            } else {
                System.out.println("Invalid location for adding a product.");
            }
        }

        // Method to retrieve a product from the vending machine
        public String getProduct(int row, int col, int depth) {
            if (row >= 0 && row < products.length && col >= 0 && col < products[0].length && depth >= 0 && depth < products[1].length) {
                String product = products[row][col][depth];
                if (product != null) {
                    return product;
                } else {
                    return "Empty";
                }
            } else {
                return "Sorry, This Product Is Sold Out \n";
            }
        }
        public void vendProduct(int row, int col, int depth) {
            String product = products[row][col][depth];
            if (product != null) {
                products[row][col][depth] = null;
            }
            System.out.println("Dispensing " + product);
        }



        // Method to display the current state of the vending machine
        public void display() {
            for (int i = 0; i < products.length; i++) {
                for (int j = 0; j < products[0].length; j++) {
                    for (int k = 0; k < products[1].length; k++) {
                        String product = products[i][j][k];
                        if (product == null) {
                            System.out.print("[Empty] ");
                        } else {
                            System.out.print("[" + product + "] ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }

