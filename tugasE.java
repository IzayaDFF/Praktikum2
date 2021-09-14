import java.util.Scanner;

public class tugasE {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        double a = scan1.nextDouble();
        double t = scan1.nextDouble();

        double luas = a * t / 2;

        System.out.format("%.2f", luas);
    }
}
