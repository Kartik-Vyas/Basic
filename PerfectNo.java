import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum =0;
        for(int i=1;i<num;i++)
        {
            if(num%i ==0)
            {
                sum+=i;
            }
            else
                continue;
        }
        if(sum == num)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
}