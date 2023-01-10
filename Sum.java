import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the columns: ");
        int columns = sc.nextInt();
        System.out.println("Enter the rows: ");
        int rows = sc.nextInt();
        double [][] arr = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            System.out.println("row " + (i + 1));
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter number: ");
                arr[i][j] = sc.nextDouble();
            }
        }

        int x = 0;
        int y = - 1;
        int sum = 0;
        while (x != 1 && x != 2) {
            System.out.println("Chose column/row: ");
            System.out.println("1. column");
            System.out.println("2. row");
            x = sc.nextInt();
        }
        if (x == 1) {
            while (y > columns || y <= 0) {
                System.out.println("Enter the column: ");
                y = sc.nextInt();
            }
            for (int i = 0; i < rows; i++) {
                sum += arr[i][y - 1];
            }
            System.out.println("Sum of column " + y + ": " + sum);
        }
        if (x == 2) {
            while (y > rows || y <= 0) {
                System.out.println("Enter the row: ");
                y = sc.nextInt();
            }
            for (int i = 0; i < columns; i++) {
                sum += arr[y - 1][i];
            }
            System.out.println("Sum of row " + y + ": " + sum);
        }
    }
}

