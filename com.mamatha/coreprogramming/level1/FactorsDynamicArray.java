package coreprogramming.level1;

import java.util.Scanner;

public class FactorsDynamicArray {
    public static void main(String[] args) {
        System.out.println("Enter the Factory Number :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxSize = 10;
        int index = 0;
        int[] factory = new int[maxSize];

        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                if(index==maxSize){
                    maxSize = maxSize*2;
                    int temp[] = new int[maxSize];
                    for(int j= 0; j<=index;j++) {
                        temp[j] = factory[i];
                    }
                        factory = temp;

                }
                factory[index] = i;
                index++;
            }
        }
        for(int k = 0;k<index;k++){
            System.out.println( "factory of the Given Number is : " +factory[k]);

        }
    }
}
