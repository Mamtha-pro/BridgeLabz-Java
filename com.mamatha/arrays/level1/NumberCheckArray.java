package arrays.level1;

import java.util.Scanner;

public class NumberCheckArray {
    public static void main(String[] args){
        System.out.println("Enter Any Five Number");
        Scanner sc = new Scanner(System.in);
        int[] Number =  new int[5];

        for(int i = 0;i<5;i++) {
            Number[i] = sc.nextInt();
        }
        for(int i =0;i<5;i++){
            if(Number[i]>0 ){
                if(Number[i]%2==0){
                    System.out.println( Number[i]+" "+"is " +"even");
                }else{
                    System.out.println(Number[i]+" " +"is " +"odd");
                }
            }else if(Number[i] <0){
                System.out.println(Number[i]+" " +"is " +"negative");
            }
            else{
                System.out.println(Number[i]+" "+"is "  +"zero");
            }
        }
     if(Number[0]==Number[4]){
         System.out.println("First and last are equal");
     }else if(Number[0]>Number[4]){
         System.out.println("First is greater");
     }else{
         System.out.println("Last is greater");
     }

    }
}
