import java.util.Scanner;

public class ST_Matrix_Multiplication {
    public static void main(String[] args) throws InterruptedException{
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();
        scan.close();
    
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix1[i][j] = (int) (Math.random() * 3);
                matrix2[i][j] = (int) (Math.random() * 3);
                System.out.print(matrix1[i][j] + " ");
                System.out.print(matrix2[i][j] + " ");
                System.out.println();
            }
        }

        for(int i = 0; i < rows; i++) {


        }

        MultiThread multiThread = null;
        MultiThread multiThread1 = null;
        long start = System.currentTimeMillis();
        for(int i = 0; i < matrix1.length / 2; i++) {
            
            multiThread = new MultiThread(matrix1[i],matrix2[i]);
            multiThread.start();
            multiThread1 = new MultiThread(matrix1[i + (matrix1.length / 2)], matrix2[i + (matrix2.length / 2)]);
            multiThread1.start();

        }
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start));
        

        System.out.println(multiThread.getResult());
        System.out.println(multiThread1.getResult());
    }
}