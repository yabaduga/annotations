package lambdasexpression;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        String result = "";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            // lambda test if a is 1 then test if b is odd/even
            // if 1 is 2 test if b is Prime
            // if 1 is 3 test if b is Palindrome
            result = (a == 1) ? (b % 2 == 0 ? "EVEN" : "ODD") :
                    (a == 2 ? (isPrime(b) ? "PRIME" : "COMPOSITE") :
                            (a == 3 ? (isPalindrome(b) ? "PALINDROME" : "NOT PALINDROME") : "NOT VALID"));
            System.out.println(result);
        }

    }

    private static boolean isPalindrome(int b) {
        String inputString = String.valueOf(b);
        StringBuilder sb = new StringBuilder();
        for (Character c : inputString.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                sb.append(c);
            }
        }
        String forward = sb.toString().toLowerCase();
        String backward = sb.reverse().toString().toLowerCase();
        return forward.equals(backward);
    }


    private static boolean isPrime(int b) {
        if (b == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(b); i++) {
            if (b % i == 0) {
                return false;
            }
        }
        return true;
    }
}
