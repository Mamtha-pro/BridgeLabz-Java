package coreprogramming.arrays.level2;

import java.util.Scanner;

public class FriendsAgeHeightArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] youn = new int[3];
        double[] height = new double[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Enter yours " + i + "Friends Age : ");
            youn[i] = sc.nextInt();
            System.out.println("Enter yours " + i + "Friends Height : ");
            height[i] = sc.nextDouble();
        }
        int min = youn[0];
        for (int i = 0; i < 3 - 1; i++) {
            if (youn[i]  < min) {
                min = youn[i];
            }

        }
        double max = 0;
        for (int j = 0; j < 3; j++) {
            if (height[j] > max) {
                max = height[j];


            }

        }


        System.out.println("the youngest friend is :" + min);
        System.out.println("the height friend is :" + max);
    }



    }