public class Son extends Thread{
    
    private MainWindow mainWindow;
    private int amount;

    Son(int amount, MainWindow mainwWindow) {
        this.amount = amount;
        this.mainWindow = mainwWindow;
    }

    @Override
    public void run() {
        do {
            mainWindow.setFlag(1, true);
            mainWindow.setTurn(0);
            
            while (mainWindow.getFlag(0) && mainWindow.getTurn() == 0) {
                System.out.println("Son wait!");
            }
                
            mainWindow.bankAccount.withdraw(amount);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            mainWindow.updateBalance(mainWindow.bankAccount.getBalance());
            mainWindow.setFlag(1, false);

        } while (true);
    }
}
