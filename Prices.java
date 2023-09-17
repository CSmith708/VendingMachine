public class Prices {
    public double[][][] prices;

    public Prices(int rows, int cols, int depth){
        prices = new double[rows][cols][depth];
    }

    public void addPrice(int row, int col, int depth, double price) {
        if (row >= 0 && row < prices.length && col >= 0 && col < prices[0].length && depth >= 0 && depth < prices[1].length) {
            prices[row][col][depth] = price;
        } else {
            System.out.println("Invalid location for adding a price.");
        }
    }
    public double getPrice(int row, int col, int depth) {
        if (row >= 0 && row < prices.length && col >= 0 && col < prices[0].length && depth >= 0 && depth < prices[1].length) {
            double price = prices[row][col][depth];
            if (prices != null) {
                return price;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
