import java.util.Scanner;
public class condition2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a<=b){
            System.out.print("Condition is true");
        }
        else{
            System.out.println("Condition is false");
        }
        sc.close();
    } 
}
