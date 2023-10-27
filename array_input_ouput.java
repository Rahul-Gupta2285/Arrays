import java.util.Scanner;

public class array_input_ouput {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        sc.close();
        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);
        marks[2] = 100;
        System.out.println("Maths : " + marks[2]);
        System.out.println("Length : " + marks.length);
        // int marks[] = new int[3], i;
        // Scanner sc = new Scanner(System.in);
        // for (i = 0; i < marks.length; i++) {
        // System.out.println("Enter " + i);
        // marks[i] = sc.nextInt();
        // }
        // for (i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }
    }
}
