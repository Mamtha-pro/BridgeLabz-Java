package coreprogramming.arrays.level1;

import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        int index =0;
        for(int i = 1; i<=n;i++){
            number[index++] = i;

        }
        for(int i =0;i<=number.length-1;i++){
            if(number[i] %2==0){
                System.out.println("Even : "+ number[i]);
            }else{
                System.out.println("Odd : "+ number[i]);
            }
        }
    }
}

