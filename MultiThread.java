import java.util.ArrayList;

public class MultiThread extends Thread{
    private int[] row1;
    private int[] row2;
    private ArrayList<Integer> result = new ArrayList<>();

    public MultiThread(int[] row1, int[] row2){
        this.row1 = row1;
        this.row2 = row2;
    }

    public ArrayList<Integer> getResult() {
        return result;
    }
    
    @Override
    public void run() {
        for(int j = 0; j < row1.length; j++) {
            int sum = 0;
            for(int k = 0; k < row2.length; k++) {
                sum += row1[j] * row2[k];
            }
            
            result.add(sum);
        }
    }
}
  