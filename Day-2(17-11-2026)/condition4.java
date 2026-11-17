import java.util.Scanner;
public class condition4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numer:");
        int value1=sc.nextInt();
        if (value1>=20){
            if (value1>20){
                System.out.println("Condition2");
            }
            System.out.println("Condition1");
        }
         sc.close();
    }
    
}
