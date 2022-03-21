import java.util.Scanner;
public class Argentina
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pesos = sc.nextInt();
        int dollar = sc.nextInt();
        int amount = pesos/50;
        if(amount>dollar){
            System.out.println("Dollars");
        }
        else{
            System.out.println("Pesos");
        }
    }
}
