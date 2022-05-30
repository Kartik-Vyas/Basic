package Basic;

import java.util.Scanner;

public class SumOF3Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 numbers:-");
        int num = 0;
        int sum = 0;
        for(int i=1;i<=3;i++)
        {
             num = sc.nextInt();
             sum+=num;
        }
        System.out.println("The sum is " + sum);
    }
}
