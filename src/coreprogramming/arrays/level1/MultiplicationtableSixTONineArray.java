package coreprogramming.arrays.level1;

import java.util.Scanner;

public class MultiplicationtableSixTONineArray {
    public static void main(String[] args){
        System.out.println("Enter The Table Number :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int [] table = new int[4];
        int index = 0;
        for(int i = 6; i<=9; i++){
            table[index++] = number*i;
        }

        index =0;
        for(int i =6 ;i<=9;i++){
            System.out.println(number+" " +"*"+ " "+ i +" "+ "=" +" "+ table[index++]);
        }

    }
}
