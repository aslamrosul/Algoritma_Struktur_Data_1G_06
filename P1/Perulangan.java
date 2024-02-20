package P1;
import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        double nim, n;
        Scanner input06= new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        nim = input06.nextDouble();
        System.out.println("====================");
        n = nim % 100;
        System.out.println("n : "+n);

        
        for (int i = 0; i <= n; i++) {
            if (i == 6 ||  i == 10) {
                System.out.print(" ");
    
            } else if (i % 2 != 0){
                System.out.print(" *");
            } else {
                System.out.print(" "+i);
            } 
            
        }

    }
}
