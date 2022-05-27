package Basic;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);

        int yourNum = 0;
        do {
            System.out.println("Guess the number");
             yourNum = sc.nextInt();
             if(num == yourNum)
             {
                 System.out.println("Congo your guess is correct");
                 break;
             }
             else if(yourNum<num)
             {
                 System.out.println("Your number is smaller than the correct number");
             }
             else if (yourNum>num)
             {
                 System.out.println("Your number is bigger than the correct number");
             }
        }
        while (yourNum>0);

        System.out.println("My number is " + num);
    }
}
