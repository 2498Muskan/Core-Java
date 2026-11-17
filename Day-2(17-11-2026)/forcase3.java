
import java.util.Scanner;
public class forcase3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1 for Odd tables or 2 for Even tables:");
        int a=sc.nextInt();

        if(a==1){
            for(int i=1; i<=40; i+=2){
                System.out.println("\nMultiplication Table of " + i);

                for(int j=1; j<=10; j++){
                    System.out.println(i + " x " + j + " = " + (i*j));
                }
            }
        }
        else if(a==2){
            for(int i=2; i<=40; i+=2){
                System.out.println("\nMultiplication Table of " + i);

                for(int j=1; j<=10; j++){
                    System.out.println(i + " x " + j + " = " + (i*j));
                }
            }
        }
        else{
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
