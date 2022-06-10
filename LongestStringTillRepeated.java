package Basic;

import java.util.Scanner;

public class LongestStringTillRepeated {
    public static void main(String[] args) {
        int [] arr = new int[128];
        System.out.println("Enter a string");//abcabc
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int lastElement  = 0;

        for(int i =0;i< input.length();i++)
        {
            if(arr[input.charAt(i)]==0)
            {
                arr[input.charAt(i)] = 1;
            }
            else{
                lastElement = i;
                break;
            }
        }
        for(int i = 0; i < lastElement;i++){
            System.out.println(input.charAt(i));
        }
    }
}
