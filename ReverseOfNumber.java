package com.first;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. to be reverse");
        int n = sc.nextInt();
        int num;
        String result = "";
        for(int i=0; i<n; i++)
        {
            num = n%10;
            n = (int) n/10;
            result = result + Integer.toString(num);
        }
        System.out.println(result);
    }
}
