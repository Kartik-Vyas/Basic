package Basic;

import java.util.Scanner;

public class CalculateCgpi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of marks:-");
        int marksNum = sc.nextInt();
        double sum = 0;
        int num;
        double percentage = 0.0;
        double cgpi = 0;
        for(int i=1;i<=marksNum;i++)
        {
            num = sc.nextInt();
            sum+=num;
        }
        percentage = ((sum/(marksNum*100))*100.0);
        cgpi= Math.round((percentage/9.5)*100.0)/100.0;
        System.out.println("your CGPI WILL BE " + cgpi);
    }
}
