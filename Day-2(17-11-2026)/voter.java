
import java.util.Scanner;
public class voter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i=1;

        System.out.println("Name\t\tAge\t\tEligibility");

        do{
            System.out.println("Enter name:");
            String name=sc.next();

            System.out.println("Enter age:");
            int age=sc.nextInt();

            System.out.print(name + "\t\t" + age + "\t\t");

            if(age>=18){
                System.out.println("Eligible");
            }
            else{
                System.out.println("Not Eligible");
            }

            i++;
        }
        while(i<=5);

        sc.close();
    }
}
