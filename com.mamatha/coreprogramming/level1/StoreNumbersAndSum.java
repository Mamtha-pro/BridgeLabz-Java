package coreprogramming.level1;

import java.util.Scanner;

public class StoreNumbersAndSum {
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int total = 0;
        Double[] arr = new Double[10];

        for (int i = 0; i < 10; i++) {
            double num = sc.nextDouble();
            if(num<0)break;
            arr[i] = num;
        }
        for(int j= 0 ;j<10;j++) {
           // System.out.println(arr[j]);
            total = (int) (total + arr[j]);
        }
        System.out.println("The sum of total number is "+ total);
    }
}
