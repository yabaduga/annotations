package varargs;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<6;i++){
            int n= sc.nextInt();
            add(n,i);
        }
    }

    static int sum=0;
    static String str="";
    public static void add(int a,int index){
        if (index>0){
            str+="+"+a;
            sum+=a;
            System.out.print(str);
            System.out.println("="+sum);

        }else{
            str= String.valueOf(a);
            sum=a;
        }


    }

}
