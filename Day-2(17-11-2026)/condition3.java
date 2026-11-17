import java.util.Scanner;
public class condition3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        if (a>=80){
            System.out.print("Grade A");
        }
        else if(a<=80 && a>=60){
    System.out.println("Grade B");
}
        else if(a<=60 && a>=50){
            System.out.println("Grade C");
        }
        else if(a<50 && a>=35){
            System.out.println("Grade D");
        }
        else {
            System.out.println("failed");
        }
        sc.close();
    } 
}
