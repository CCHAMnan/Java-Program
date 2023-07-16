import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Font;


public class MainWindow extends JFrame{

        private boolean[] flag = {false, false};
        private int turn;

        
        BankAccount bankAccount = new BankAccount(100000);
        int balance = bankAccount.getBalance();
        int deposit = 1000000;
        int withdraw = 1000000;
        JLabel balanceAmount = new JLabel();

        public void updateBalance(int balance) {
                balanceAmount.setText(Integer.toString(balance));
        }

        public boolean getFlag(int i) {
                return flag[i];
        }

        public void setFlag(int i,boolean j) {
                this.flag[i] = j;
        }

        public int getTurn() {
                return turn;
        }

        public void setTurn(int i) {
                this.turn = i;
        }

    MainWindow() {
        
        

        Color mediumBlue = new Color(0, 120, 255);
        Color darkGreen = new Color(0, 220, 0);
//--------------------------------------------------------------------------------------------------------------------------
        //Label
        JLabel depositLabel = new JLabel();
        depositLabel.setText("Deposit Amount:");
        depositLabel.setFont(new Font("Arial",Font.BOLD, 20));
        depositLabel.setBounds(43,10,200,50);

        JLabel balanceLabel = new JLabel();
        balanceLabel.setText("Balance");
        balanceLabel.setFont(new Font("Arial",Font.BOLD, 30));
        balanceLabel.setBounds(435,200,200,50);

        JLabel withdrawLabel = new JLabel();
        withdrawLabel.setText("Withdraw Amount:");
        withdrawLabel.setFont(new Font("Arial",Font.BOLD, 20));
        withdrawLabel.setBounds(40,10,200,50);
        
        JLabel fatherLabel = new JLabel();
        fatherLabel.setText("Father");
        fatherLabel.setFont(new Font("Arial",Font.BOLD, 30));
        fatherLabel.setBounds(130,100,200,50);

        JLabel sonLabel = new JLabel();
        sonLabel.setText("Son");
        sonLabel.setFont(new Font("Arial",Font.BOLD, 30));
        sonLabel.setBounds(785,100,200,50);

        
        balanceAmount.setText(Integer.toString(balance));
        balanceAmount.setFont(new Font("Arial",Font.BOLD, 35));
        balanceAmount.setForeground(Color.white);

        JLabel depositAmount = new JLabel();
        depositAmount.setText(Integer.toString(deposit));
        depositAmount.setFont(new Font("Arial",Font.BOLD, 25));
        depositAmount.setBounds(65,130,200,50);

        JLabel withdrawAmount = new JLabel();
        withdrawAmount.setText(Integer.toString(withdraw));
        withdrawAmount.setFont(new Font("Arial",Font.BOLD, 25));


//--------------------------------------------------------------------------------------------------------------------------
        //Panel
        JPanel fatherPanel = new JPanel(new GridBagLayout());
        fatherPanel.setBounds(50,200,250,300);
        fatherPanel.setBorder(new LineBorder(darkGreen,4));
        
        JPanel sonPanel = new JPanel(new GridBagLayout());
        sonPanel.setBounds(685,200,250,300);
        sonPanel.setBorder(new LineBorder(darkGreen,4));        
        
        JPanel balancPanel = new JPanel(new GridBagLayout());
        balancPanel.setBounds(350,250,280,225);
        balancPanel.setBackground(mediumBlue);
        balancPanel.setBorder(new LineBorder(Color.blue,4));
        balancPanel.add(balanceAmount);
        this.add(balancPanel);


        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 0;
        c.gridy = 0;
        sonPanel.add(withdrawLabel,c);

        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 0;
        c.gridy = 1;
        sonPanel.add(withdrawAmount,c);
        this.add(sonPanel);


        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 0;
        c.gridy = 0;
        fatherPanel.add(depositLabel,c);

        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 0;
        c.gridy = 1;
        fatherPanel.add(depositAmount,c);
        this.add(fatherPanel);


//--------------------------------------------------------------------------------------------------------------------------
        //Frame
        this.setTitle("Data Inconsistency");
        this.setSize(1000,600);
        this.setLocation(450,200);
        this.setLayout(null);
        this.add(fatherLabel);
        this.add(balanceLabel);
        this.add(sonLabel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
