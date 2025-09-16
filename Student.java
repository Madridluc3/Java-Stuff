import java.util.Scanner;

public class Student {
    // Method 1
    public static void main(String args[]){
        Scanner kin = new Scanner(System.in);
        Student[] classroom;
        int[] grades;

        System.out.print("How many Students: ");
        // size = kin.nextInt(); 
        classroom = new Student[kin.nextInt()];
        grades = new int [classroom.length];

        classroom[0] = new Student();
        grades[0] = 75;
        classroom[1] = new Student ("Ada", "Lovelace", 12345);
        grades[1] = 87;

        System.out.println(classroom);

        for(int i = 0; i < classroom.length; i++) {
            System.out.println(classroom[i] + "   ");
            System.out.println(grades[i]);
        }
    }
}