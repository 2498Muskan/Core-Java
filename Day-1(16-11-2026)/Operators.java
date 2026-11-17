
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =sc.nextInt();
        int venu =sc.nextInt();

        // Arithmetic Operators
        System.out.println("This number is : " + (num+venu));
        System.out.println("This number is : " + (num-venu));
        System.out.println("This number is : " + (num*venu));
        System.out.println("This number is : " + (num/venu));
        System.out.println("This number is : " + (num%venu));

        // Relational Operators
        System.out.println("This number is : " + (num==venu));
        System.out.println("This number is : " + (num!=venu));
        System.out.println("This number is : " + (num>venu));
        System.out.println("This number is : " + (num<venu));
        System.out.println("This number is : " + (num>=venu));
        System.out.println("This number is : " + (num<=venu));

        // Logical Operators
        System.out.println("This number is : " + (num>venu && num>0));
        System.out.println("This number is : " + (num>venu || num>0));
        System.out.println("This number is : " + !(num>venu));

        // Assignment Operators
        int a=num;
        System.out.println("This number is : " + (a=venu));
        a=num;
        System.out.println("This number is : " + (a+=venu));
        a=num;
        System.out.println("This number is : " + (a-=venu));
        a=num;
        System.out.println("This number is : " + (a*=venu));
        a=num;
        System.out.println("This number is : " + (a/=venu));
        a=num;
        System.out.println("This number is : " + (a%=venu));
        a=num;
        System.out.println("This number is : " + (a&=venu));
        a=num;
        System.out.println("This number is : " + (a|=venu));
        a=num;
        System.out.println("This number is : " + (a^=venu));
        a=num;
        System.out.println("This number is : " + (a<<=venu));
        a=num;
        System.out.println("This number is : " + (a>>=venu));
        a=num;
        System.out.println("This number is : " + (a>>>=venu));

        // Unary Operators
        System.out.println("This number is : " + (+num));
        System.out.println("This number is : " + (-num));
        System.out.println("This number is : " + (++num));
        System.out.println("This number is : " + (num++));
        System.out.println("This number is : " + (--num));
        System.out.println("This number is : " + (num--));
        System.out.println("This number is : " + !(num>venu));
        System.out.println("This number is : " + (~num));

        // Bitwise Operators
        System.out.println("This number is : " + (num&venu));
        System.out.println("This number is : " + (num|venu));
        System.out.println("This number is : " + (num^venu));
        System.out.println("This number is : " + (~num));

        // Shift Operators
        System.out.println("This number is : " + (num<<venu));
        System.out.println("This number is : " + (num>>venu));
        System.out.println("This number is : " + (num>>>venu));

        sc.close();
    }
}
