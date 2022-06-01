package com.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int z = 0;
       int x = OTT.calculate(20,"Netflix");
      if( x == -1){
          System.out.println("Netflix allows viewing hours in multiples of 10");
      System.exit(0);
      }

       int y = OTT.calculate(2,"Amazon Prime");
        if( y == -1){
            System.out.println("Amazon Prime allows viewing hours in multiples of 5");
       System.exit(0);
        }


//        z = OTT.calculate(2,"Hotstar");
//        if( x == -1){
//            System.out.println("Hotstar allows viewing hours in multiples of 10");
//        System.exit(0);
//        }

       sum = x + y + z;

        System.out.println("Total amount should be paid: Rs." + sum);

    }
}


class OTT{
    static int getNetflixPricePerUnit = 10;
    static int getNetflixUnitinhours = 10;
    static int getAmazonPrimePricePerUnit = 2;
    static int getAmazonPrimeUnitinhours = 5;
    static int getHotstarPricePerUnit = 1;
    static int getHotstarUnitinhours = 5;
    public static int calculate(int viewingHoursByUser,String typeOfOTT){
        if(typeOfOTT.equalsIgnoreCase("Netflix")) {
            if(viewingHoursByUser%10 == 0) {
                int value = viewingHoursByUser / getNetflixUnitinhours;
                return getNetflixPricePerUnit * value;
            }
            else{
                return -1;
            }

        }
        else  if(typeOfOTT.equalsIgnoreCase("Amazon Prime")) {
            if(viewingHoursByUser%5 == 0) {
                int value = viewingHoursByUser / getAmazonPrimeUnitinhours;
                return getAmazonPrimePricePerUnit * value;
            }
            else{
                return -1;
            }
        }
        else{
            if(viewingHoursByUser%5 == 0) {
                int value = viewingHoursByUser / getHotstarUnitinhours;
                return getHotstarPricePerUnit * value;
            }
            else{
                return -1;
            }

        }
    }
}

