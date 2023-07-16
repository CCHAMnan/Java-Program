import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of even-length palindromes to generate: ");
        int count = scanner.nextInt();
        scanner.close();
        int[] palindromes = generatePalindromes(count);
        System.out.print("Palindromes: ");
        for (int i = 0; i < palindromes.length; i++) {
            System.out.print(palindromes[i] + " ");
        }
    }

    public static int[] generatePalindromes(int count) {
        int[] palindromes = new int[count];
        int num = 0;
        for (int i = 0; i < count; i++) {
            int length = i % 2 == 0 ? 2 : 3; // Length is 2 for even indices, 3 for odd indices
            while (!isEvenDigitPalindrome(num, length)) {
                num++;
            }
            palindromes[i] = num;
            num++;
        }
        return palindromes;
    }
    
    public static boolean isEvenDigitPalindrome(int num, int length) {
        String numStr = Integer.toString(num);
        if (numStr.length() != length) {
            return false;
        }
        for (int i = 0; i < length / 2; i++) {
            int digit = numStr.charAt(i) - '0';
            if (digit % 2 != 0 || digit != numStr.charAt(length - i - 1) - '0') {
                return false;
            }
        }
        return true;
    }
}
