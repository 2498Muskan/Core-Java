import java.util.Scanner;
public class Relational {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =sc.nextInt();
        int venu =sc.nextInt();
        System.out.println("This number is : " + (num&venu));
        System.out.println("This number is : " + (num|venu));
        System.out.println("This number is : " + (num^venu));
        System.out.println("This number is : " + (~num));
        System.out.println("This number is : " + (num<<venu));
        System.out.println("This number is : " + (num>>venu));
        System.out.println("This number is : " + (num&venu));
        sc.close();
    }    
}
