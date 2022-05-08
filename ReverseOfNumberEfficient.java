package com.first;

import java.util.Scanner;

public class ReverseOfNumberEfficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. to be reverse");
        int n = sc.nextInt();
        int num;
        int rev = 0;
        for(int i=0; i<n; i++)
        {
            num = n%10;
            rev = rev * 10 + num;
            n = n/10;
        }
        System.out.println(rev);
    }
}
