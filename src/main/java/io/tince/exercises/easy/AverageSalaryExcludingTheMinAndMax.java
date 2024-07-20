package io.tince.exercises.easy;

/**
 * Average Salary Excluding the Minimum and Maximum Salary
 * <p>
 * You are given an array of unique integers "salary" where "salary[i]" is the salary of the "i^th" employee.
 * <p>
 * Return the average salary of employees excluding the minimum and maximum salary. Answers within 10^5 of the actual answer will be accepted.
 * <p>
 * Example 1:
 * Input: salary = [4000,3000,1000,2000]
 * Output: 2500.00000
 * Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
 * Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
 * <p>
 * Example 2:
 * Input: salary = [1000,2000,3000]
 * Output: 2000.00000
 * Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
 * Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
 */
public class AverageSalaryExcludingTheMinAndMax {
    public static void main(String[] args) {
        int[] salaries1 = new int[]{4000, 3000, 1000, 2000};
        System.out.println(new AverageSalaryExcludingTheMinAndMax().average(salaries1));
    }

    // Solution - 1
    public double average(int[] salary) {
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        int counter = 0;
        double result = 0;
        for (int i : salary) {
            if (i > maxSalary) maxSalary = i;
            if (i < minSalary) minSalary = i;
        }
        for (int i : salary) {
            if (i != maxSalary && i != minSalary) {
                result += i;
                counter++;
            }
        }
        return result / counter;
    }
}