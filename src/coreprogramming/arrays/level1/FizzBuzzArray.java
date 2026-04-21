package coreprogramming.arrays.level1;

import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        String[] result = new String[n + 1];

        for (int i = 1; i <= n; i++) {


            if (i % 3 == 0) {
                result[i] ="fizz";
            } else if (i % 5 == 0) {
                result[i]="Buzz";
            } else if (i % 15 == 0) {
                result[i]="fizzBuzz";
            } else {
                result[i] = String.valueOf(i);
            }

        }
        for(int i =1;i<=n;i++){
            System.out.println("Postion" + i + "=" + result[i]);
        }
    }
}

