import java.util.Scanner;
import java.lang.Math;

public class Program
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int houses = input.nextInt();

        //your code goes here
        double value1 = (2.0/houses)*100; 
     System.out.println(Math.round(Math.ceil(value1)));
    }
}
