public class Main {
    public static void main(String[] args) {
        
        MainWindow mainWindow = new MainWindow();

        Father father = new Father(1000000, mainWindow);
        Son son = new Son(1000000, mainWindow);
        
        father.start();
        son.start();

    }
}
