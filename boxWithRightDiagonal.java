import java.util.Scanner;
public class boxWithRightDiagonal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        for(int i=0;i<value;i++)
        {
            for (int j=0;j<value;j++)
            {
                if(i==0 || i==(value-1)){
                    System.out.print(" * ");
                }
                else if(j==0 || j==(value-1)) {
                    System.out.print(" * ");
                }
                else if(i==j){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                    continue;
                }
            }
            System.out.println(" ");
        }
    }
}
