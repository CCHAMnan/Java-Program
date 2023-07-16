import java.util.Scanner; // for user input 
import javax.swing.JOptionPane; // for GUI
import java.util.ArrayList; // for array list
import java.util.Random; // for Randomizing

public class Lesson {
    public static void main(String[] args){

        //UserInput
        try (Scanner scan = new Scanner(System.in)) { // or use scan.close()
            System.out.println("Which number do you like?");
            int age = scan.nextInt();

            System.out.println("Hello "+age);
        }

        // GUI
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ente your age")); // convert from string to int because JOption is a string
        JOptionPane.showMessageDialog(null, "You are "+num+" years old!");

        //Math
        double x = 2;
        double z = Math.sqrt(x*x);
        System.out.println(z);

        //Random
        Random random = new Random();

        int r = random.nextInt(6); //generate number from 0-5; if want from 1-6 just add  random.nextInt(6)+1;
        System.out.println(r);

        //switch
        String day = "Friday";
        switch(day)
        {
            case "Monday" : System.out.println("Damn!");
            break;
            case "Friday" : System.out.println("Nice!");
            break;
            default: System.out.println("There is no such day!"); //If there is no match
        }

        //String Method


        // String names = "Bro";
        // Boolean result = name.equalsIgnoreCase(names);
        // int result = name.length();
        // char result = name.charAt(0);
        // int result = name.indexOf("o");
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim();
        // String result = name.replace('a', 'o');



        //Array List

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();

        for(int i =0; i < food.size(); i++) {
            System.err.println(food.get(i));
        }


        //2D array list


        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic");
        bakeryList.add("donut");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("soda");
        drinkList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(0).get(0));
        
        







    }
}
