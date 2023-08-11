// Write a program to convert Decimal number to Octal Number System

package Working_With_Numbers;

public class DecimalToOctal {
    public static void main(String[] args) {
        int number = 214;
        int[] octal = new int[100];
        int i = 0;
        while (number > 0) {
            int rem = number % 8;
            octal[i++] = rem;
            number /= 8;
        }

        for (int j = i-1; j >=0 ; j--) {
            System.out.print(octal[j]+"");
        }
    }
}
