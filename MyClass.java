import java.util.Scanner;

public class MyClass {
    // Method 1
    public static void main(String args[]){
        Scanner kin = new Scanner(System.in);
        int size;
        double[] temps;
        double currTemp = 25;

        System.out.print("How many Temperatures? ");
        size = kin.nextInt(); 
        temps = new double[size];

        for(int i = 0; i < temps.length; i++) {
            temps[i] = currTemp;
            System.out.println(temps[i]);
            currTemp += 10;
        }
    }
}