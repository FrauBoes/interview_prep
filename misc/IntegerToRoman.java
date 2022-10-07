import java.util.*;

class Main {

    public static final int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    public static final String[] numerals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int remainder = num;
        int factor = 1;
        int i = 12;

        while (i >=0 && remainder != 0) {
            int divisor = values[i];
            factor = remainder / divisor;

            while (factor > 0) {
                result.append(numerals[i]);
                factor--;
            }

            remainder = remainder % divisor;
            i--;
        }

        return result.toString();

    }

    public static void main(String[] args) {
        int i1 = 50;
        System.out.println("Integer: " + intToRoman(i1));
        int i2 = 12;
        System.out.println("Integer: " + intToRoman(i2));
        int i3 = 109;
        System.out.println("Integer: " + intToRoman(i3));
    }
}