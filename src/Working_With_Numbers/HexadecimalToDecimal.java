package Working_With_Numbers;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        String hex = "C9";
        System.out.println(covert(hex));
    }

    private static int covert(String hex) {
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int value = 0;
        for(int i = 0; i < hex.length(); i++) {
           char ch = hex.charAt(i);
           int d = digits.indexOf(ch);
           value = 16*value + d;
        }

        return value;
    }
}
