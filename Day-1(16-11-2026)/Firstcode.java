import java.util.Scanner;

class Firstcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a;
        short b;
        int age;
        long totalMarks;
        float marks;
        double average;
        char grade;
        String name;
        boolean result;
         System.out.println("---------------------");
        a = sc.nextByte();
        b = sc.nextShort();
        age = sc.nextInt();
       totalMarks = sc.nextLong();
        marks = sc.nextFloat();
        average = sc.nextDouble();
        grade = sc.next().charAt(0);
        name = sc.next();
       result = sc.nextBoolean();
       System.out.println(a);
       System.out.println(b);
       System.out.println(age);
       System.out.println(totalMarks);
       System.out.println(marks);
       System.out.println(average);
       System.out.println(grade);
       System.out.println(name);
       System.out.println(result);

    }
}