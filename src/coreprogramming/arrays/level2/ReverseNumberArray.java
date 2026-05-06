package coreprogramming.arrays.level2;

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {

        System.out.print("Enter the Number for Reverse : ");
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();
      //  Each digit becomes a separate string element
       String[] parts = input.split("");

       int[] arr = new int[parts.length];

        for(int i =0;i<parts.length;i++){
            //This converts string → integer
              arr[i] = Integer.parseInt(parts[i]);
        }
        int [] rev = new int[arr.length];

        int j=0;
        for(int i =arr.length-1;i>=0;i--){
            rev[j] = arr[i];
            j++;
        }
        for(int i =0;i<rev.length;i++){
            System.out.print(rev[i] + " ");
        }


        }

        }


