import javax.swing.*;
import java.awt.GridLayout;

public class test {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Data Inconsistency");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        // Create the panels for the father, balance, and son labels
        JPanel fatherPanel = new JPanel();
        JPanel balancePanel = new JPanel();
        JPanel sonPanel = new JPanel();
        
        // Create the labels for the father, balance, and son panels
        JLabel fatherLabel = new JLabel("Father");
        JLabel balanceLabel = new JLabel("Balance");
        JLabel sonLabel = new JLabel("Son");
        
        // Create the labels for the balance amount
        JLabel fatherBalanceLabel = new JLabel("$100.00");
        JLabel balanceAmountLabel = new JLabel("$100.00");
        JLabel sonBalanceLabel = new JLabel("$100.00");
        
        // Add the labels for the father, balance, and son to their respective panels
        fatherPanel.add(fatherLabel);
        balancePanel.add(balanceLabel);
        sonPanel.add(sonLabel);
        
        // Add the labels for the balance amount to their respective panels
        fatherPanel.add(fatherBalanceLabel);
        balancePanel.add(balanceAmountLabel);
        sonPanel.add(sonBalanceLabel);
        
        // Add the father, balance, and son panels to the frame
        frame.add(fatherPanel);
        frame.add(balancePanel);
        frame.add(sonPanel);
        
        // Set the layout of the frame to a GridLayout with three rows and one column
        frame.setLayout(new GridLayout(3, 1));
        
        // Display the frame
        frame.setVisible(true);
    }
}
