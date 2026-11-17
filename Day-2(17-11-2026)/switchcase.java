
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number (1-13):");
        int a=sc.nextInt();

        switch(a){
            case 1:
                System.out.println("CSE");
                break;
            case 2:
                System.out.println("CSE-AI");
                break;
            case 3:
                System.out.println("CSE_DS");
                break;
            case 4:
                System.out.println("CSE-CS");
                break;
            case 5:
                System.out.println("CSE-AI&DS");
                break;
            case 6:
                System.out.println("CSE-IOT");
                break;
            case 7:
                System.out.println("MCA");
                break;
            case 8:
                System.out.println("MBA");
                break;
            case 9:
                System.out.println("ECE");
                break;
            case 10:
                System.out.println("EEE");
                break;
            case 11:
                System.out.println("MECH");
                break;
            case 12:
                System.out.println("CIVIL");
                break;
            case 13:
                System.out.println("IT");
                break;
            default:
                System.out.println("Invalid Branch Number");
        }
        sc.close();
    }
}
