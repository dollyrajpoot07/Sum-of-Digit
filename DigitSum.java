// Sum of Digit
// Vicky is a mathematician. He gave a problem to his son john. 
// John's task is to add all the digits until the result has only one digit. Help john complete his task.
// Input: 78
// Output: 6

import java.util.*;

class DigitSum {
    public static int digSum(int n) {
        int sum = 0;
        while(n > 0 || sum > 9) {
            if(n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digSum(n));
    }
}