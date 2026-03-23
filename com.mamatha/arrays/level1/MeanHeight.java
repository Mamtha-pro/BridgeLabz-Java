package arrays.level1;
import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        System.out.println("Enter 11 people height :");
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];

        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();

            sum += heights[i];
        }
        System.out.println("Mean height = " + (sum / heights.length));
    }

}
