import java.util.Scanner;

public class tugasF {
    public static void main(String[] args) {
        int a, b;
        Scanner scan1 = new Scanner(System.in);
        int baris = 3;
        int kolom = 3;
        int array[][] = new int[baris][kolom];
        
        for(a=0; a<baris; a++)
        {
            for(b=0; b<kolom; b++)
            {
                array[a][b] = scan1.nextInt();
            }
        }
        for(a=0; a<kolom; a++)
        {
            for(b=0; b<baris; b++)
            {
                System.out.print(array[b][a]+" ");
            }
            System.out.println(" ");
        }
    }
}
