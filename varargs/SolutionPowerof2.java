package varargs;

import java.util.Scanner;

public class SolutionPowerof2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Inner.powerof2(n);
    }

    private static class Inner {
        static boolean powerof2(int n) {
            int temp = 0;
            final int start=n;
            while (n > 2 || n % 2 != 0) {
                if (n%2!=0){
                    System.out.println(start+" is not a power of 2");
                    System.out.println("An instance of class: Solution.Inner.Private has been created");
                    return false;
                }
                temp = n / 2;
                n = temp;
            }
            ;
            if (n == 2) {
                System.out.println(start+" is power of 2");
                System.out.println("An instance of class: Solution.Inner.Private has been created");
                return true;
            } else {


                System.out.println(n+" is not a power of 2");
                System.out.println("An instance of class: Solution.Inner.Private has been created");
                return false;
            }
        }
    }

}