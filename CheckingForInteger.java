package Basic;

import java.util.Scanner;

public class CheckingForInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no:");
        boolean isInterger = sc.hasNextInt();
        if(isInterger==true)
        {
            System.out.println("YOUR NUMBER IS AN INTEGER");
        }
        else
        {
            System.out.println("YOUR NUMBER IS NOT AN INTEGER");
        }
    }
}
