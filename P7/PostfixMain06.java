import java.util.Scanner;
public class PostfixMain06 {
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc06.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix06 post = new Postfix06(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);

    }
}
