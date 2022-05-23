package Basic;

import java.util.Scanner;

public class SumUptoSingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //93
        int num = sc.nextInt();
        int sum = 0;
        int value = 0;
        while(num!=0)
        {
            value = num%10;
            sum = sum + value;
            num = num/10;
            if(sum >9)
            {
                num = sum;
                sum=0;
            }
        }
        System.out.println(sum);
    }
}
