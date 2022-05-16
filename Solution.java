import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static Integer sum(Integer[] ints)
    {
     int sum =0;
  for(int num : ints)
  {
      sum = sum + num;
  }
  return sum;
  //sum the integers

  //return the sum
}
  public static String sum(String[] ints){
      String s1 = "";
      for(int i = 0 ; i <ints.length;i++){
          s1 = s1+ ints[i];
      }
      return s1;
  
  //sum the integers

  //return the sum
}
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
         String [] ans = s.split(" ");
        char x = ans[0].charAt(0);
         if(x >= '0' && x<='9'){
             Integer [] ans1 = new Integer[ans.length];
             for(int i = 0 ; i < ans.length;i++){
                 ans1[i] = Integer.parseInt(ans[i]);
             }
           System.out.println(sum(ans1));
         }
         else{
            System.out.println(sum(ans)); 
         }
        
       
    }
}
