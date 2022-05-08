package com.first;

public class PrimeBetween1To100 {
    public static void main(String[] args) {
        System.out.println("Prime no. betwween 1 to 100 are :-");
        System.out.println(2);
        for(int i=3;i<100; i++)
        {
            int flag = 0;
            for(int j =2; j<i; j++)
            {
                if(i%j==0)
                {
                    flag = 1;
                    break;
                }
                else
                {
                    continue;
                }
            }
            if(flag==0)
            {
                System.out.println(i);
            }
        }
    }
}
