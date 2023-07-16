import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        String[] sports = { "Football", "BasketBall", "Cricket", "Golf ", "Tennis", "Ice Hockey", "Volleyball", "Rugby","Boxing", "Baseball",
                            "Formula 1", "Parkour", "Cycling", "Taekwondo", "Water Polo", "Handball", "Bowling", "MMA ","Badminton", "Skiingg" };

        System.out.println("\nHere are the list of 20 sports listed below:");

        for (int i = 0; i < sports.length; i++) {
            if (i % 5 == 0)
                System.out.println();
            System.out.print((i+1) + ". " + sports[i] + "\t\t\t");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("\n");
        System.out.print("Please choose an index of your favorite sport from 1-20: ");
        int index = scan.nextInt();
        scan.close();

        if(index > 20 || index < 1)
            System.out.println("Please Input a Valid number from 1-20.\n");
        else
            System.out.println("Your favorite Sport is: " + sports[index-1] + "\n");
    }
}
