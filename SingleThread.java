import java.util.Scanner;

public class SingleThread {

    Scanner scan = new Scanner(System.in);
    int rows;
    int columns;

    Matrix matrix = new Matrix();

    void createMenu() {
        while (true) {
            System.out.println("\n-------------------");
            System.out.println("\tMenu\t");
            System.out.println("-------------------");
            System.out.println("1. Create Matrix");
            System.out.println("2. Auto Generate Matrix");
            System.out.println("3. Multiply Matrix");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter Menu(1-4): ");
            int menu = scan.nextInt();

            if(menu == 1) {
                matrix.createMatrix();
            }
            else if(menu == 2) {
                matrix.autoGenerateMatrix();
            }
            else if(menu == 3) {
                if(matrix.matrix1.length != matrix.matrix2[0].length) {
                    System.out.println("Error! The number of rows in the first matrix doesn't match the number of columns in the second matrix!");
                }
                else {
                    long start = System.currentTimeMillis();
                    matrix.multiply();
                    long end = System.currentTimeMillis();
                    System.out.println("Execution time: " + (end - start));
                }
                
                
            }
            else if(menu == 4) {
                scan.close();
                System.exit(0);
            }
            else {
                System.out.println("Error menu! Please enter menu from 1 to 4!\n");
            }
        }
    }
}

