package Basic;

import java.util.Locale;
import java.util.Scanner;

public class StringsOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence");
        String s = sc.nextLine();
        String line = s.toUpperCase();
        String vowel = "";
        for(int i=0;i<line.length();i++)
        {
            if(line.charAt(i)=='A'||line.charAt(i)=='E'||line.charAt(i)=='I'||line.charAt(i)=='O'||line.charAt(i)=='U')
            {
                vowel= vowel+ line.charAt(i);
            }
            else
            {
                continue;
            }
        }
        System.out.println("The vowels from given string is :" + vowel);
    }
}
