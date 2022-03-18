package com.first;

public class boxPattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==0 && (j==0 || j==1 || j==2 || j==3)){
                    System.out.println("*");
                }
                else if(i==1 && (j==0 || j==3)){
                    System.out.println("*");
                }
                else if(i==2 && (j==0 || j==3)){
                    System.out.println("*");
                }
                else if(i==3 && (j==0 || j==1 || j==2 || j==3)){
                    System.out.println("*");
                }
                else{
                    continue;
                }


            }
        }
    }
}

