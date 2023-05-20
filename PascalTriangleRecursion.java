public class PascalTriangleRecursion {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalValue(i, j) + " ");
            }
            System.out.println();
        }
    }
    
    public static int pascalValue(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        } else {
            return pascalValue(row - 1, col - 1) + pascalValue(row - 1, col);
        }
    }
}
