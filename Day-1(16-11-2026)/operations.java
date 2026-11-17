import java.util.Scanner;
public class operations {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int pettycash,tiffen,lunch,dinner,total_expences,savings;
        float averagePerday;
        pettycash=sc.nextInt();
        tiffen=sc.nextInt();
        lunch=sc.nextInt();
        dinner=sc.nextInt();
        total_expences = tiffen + lunch + dinner;
        averagePerday = total_expences / 7.0f;
        System.out.println("\n----- Daily Expenses -----");
        System.out.println(pettycash);
        System.out.println(tiffen);
        System.out.println(lunch);
        System.out.println(dinner);
        System.out.println(total_expences);
        System.out.println(averagePerday);
        sc.close();
    }
    
}
