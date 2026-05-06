package coreprogramming.arrays.level2;

import java.util.Scanner;

public class EmployeeBonusLevel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newsalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            salary[i] = sc.nextDouble();
            years[i] = sc.nextDouble();

            if (salary[i] > 0 && years[i] >= 0) {
                if (years[i] > 5) {
                    bonus[i] = salary[i] * 0.05;
                } else {
                    bonus[i] = salary[i] * 0.02;
                }
            } else {
                System.out.println("Enter valid input");
                i--; // repeat same index
                continue;
            }
            newsalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newsalary[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("New Salary: %.2f\n", newsalary[i]);
            System.out.printf("Bonus: %.2f\n", bonus[i]);
        }
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

    }
}
