import java.util.Scanner;

public class Matrix extends Thread {
    Scanner scan = new Scanner(System.in);
    public int rows;
    public int columns;
    public int[][] matrix1, matrix2;
    public int[][] result;
    

    void createMatrix() {
        System.out.print("Enter number of rows: ");
        rows = scan.nextInt();
        System.out.print("Enter number of columns: ");
        columns = scan.nextInt();
        
        int[][] data = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print("Enter number to cell [" + i + "][" + j + "]: ");
                data[i][j] = scan.nextInt();
            }
        }

        if(matrix1 == null) {
            matrix1 = data;
        }
        else if(matrix2 == null) {
            matrix2 = data;
        }
        else {
            System.out.println("Both matrices are already full, do you want to replace 1 of them?");
            System.out.println("1, Yes \n2, No \nChoice: ");
            int choice = scan.nextInt();
            if(choice == 1) {
                System.out.println("Which matrix do you want to replace?");
                System.out.println("1, Matrix 1 \n2, Matrix 2 \nchoice: ");
                int ans = scan.nextInt();
                if(ans == 1) {
                    matrix1 = data;
                }
                else if(ans == 2) {
                    matrix2 = data;
                }
                else{
                    System.out.println("Invalid choice!");
                }
            }
        }
    }

    void multiply() {
        result = new int[rows][columns];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }

    void autoGenerateMatrix() {
        System.out.print("Enter number of rows: ");
        rows = scan.nextInt();
        System.out.print("Enter number of columns: ");
        columns = scan.nextInt();
        
        int[][] data = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                data[i][j] = (int) (Math.random() * 10);
            }
        }

        if(matrix1 == null) {
            matrix1 = data;
        }
        else if(matrix2 == null) {
            matrix2 = data;
        }
        else {
            System.out.println("Both matrices are already full, do you want to replace 1 of them?");
            System.out.println("1, Yes \n2, No \nChoice: ");
            int choice = scan.nextInt();
            if(choice == 1) {
                System.out.println("Which matrix do you want to replace?");
                System.out.println("1, Matrix 1 \n2, Matrix 2 \nchoice: ");
                int ans = scan.nextInt();
                if(ans == 1) {
                    matrix1 = data;
                }
                else if(ans == 2) {
                    matrix2 = data;
                }
                else{
                    System.out.println("Invalid choice!");
                }
            }
        }
    }
}