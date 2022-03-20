import java.util.Scanner;
public class cheerCreator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if(value > 10){
            System.out.println("High Five");
        }
        else if(value >= 1 && value <=10){
        for (int i = 1; i<=value ;i++){
            System.out.println("Ra!");
        }
        }
        else {
            System.out.println("shh");
        }
    }
}
