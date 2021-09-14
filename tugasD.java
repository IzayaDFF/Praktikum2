import java.util.Scanner;

public class tugasD {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        int b = scan1.nextInt();
        
        int hasil = a / b;
        int sisa = a % b;

        System.out.println("masing-masing " + hasil);
        System.out.println("bersisa " + sisa);
    }
}
