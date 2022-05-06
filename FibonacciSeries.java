import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no till you want series");
        int num = sc.nextInt();
        int sum;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for(int i=2; i< num; i++)
        {
            sum = a+b;
            a=b;
            b=sum;
            System.out.print(sum + " ");
        }
    }
}
