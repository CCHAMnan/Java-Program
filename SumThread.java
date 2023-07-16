public class SumThread extends Thread{
    private int a;
    private int b;
    private int result = 10000;

    // non-default constructor
    public SumThread(int a, int b){
        this.a = a;
        this.b = b;
    }


    // accessor / getter
    public int getResult() {
        return result;
    }


    @Override
    public void run() {
        result = a + b;
    }
}
