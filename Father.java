public class Father extends Thread{

    private MainWindow mainWindow;
    private int amount;

    Father(int amount, MainWindow mainwWindow) {
        this.amount = amount;
        this.mainWindow = mainwWindow;
    }
    
    @Override
    public void run() {
        do {
            mainWindow.setFlag(0, true);
            mainWindow.setTurn(1);
            
            while (mainWindow.getFlag(1) && mainWindow.getTurn() == 1) {
                System.out.println("Father wait!");
            }
            
            mainWindow.bankAccount.deposit(amount);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mainWindow.updateBalance(mainWindow.bankAccount.getBalance());
            mainWindow.setFlag(0, false);

        } while (true);
    }
}
