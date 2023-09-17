public class Calories {
        public double[][][] calories;

        public Calories(int rows, int cols, int depth) {
            calories = new double[rows][cols][depth];
        }

        public void addCals(int row, int col, int depth, double price) {
            if (row >= 0 && row < calories.length && col >= 0 && col < calories[0].length && depth >= 0 && depth < calories[1].length) {
                calories[row][col][depth] = price;
            } else {
                System.out.println("Invalid location for adding a price.");
            }
        }

        public double getCals(int row, int col, int depth) {
            if (row >= 0 && row < calories.length && col >= 0 && col < calories[0].length && depth >= 0 && depth < calories[1].length) {
                double cals = calories[row][col][depth];
                if (cals != 0.0) {
                    return cals;
                } else {
                    return 404;
                }
            }else {
                return 404;
            }
        }
    }
