import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Kilometers: " + meters / 1000);
    }
}
