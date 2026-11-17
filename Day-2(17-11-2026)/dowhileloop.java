
import java.util.Scanner;
public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();

        int i=1;
        do{
            System.out.println(a + " x " + i + " = " + (a*i));
            i++;
        }
        while(i<=10);
        sc.close();
    }
}
