package Working_With_Numbers;

public class DecimalToBinary {
    public static void main(String[] args) {
        int number = 5;

//      This binary[] arr will store our binary number
        int[] binary = new int[100];

//      This i is our index
        int i = 0;

        while (number > 0) {
//          rem will store remainder
            int rem = number % 2;
            binary[i] = rem;
            number /= 2;
            i++;
        }
//      Now we got our answer but in reverse order in the binary[] array
//      So, we will print in reverse order
        for (int j = i-1; j >= 0; j--) {
            System.out.print(binary[j]+"");
        }
    }
}
