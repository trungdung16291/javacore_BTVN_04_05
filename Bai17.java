import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        System.out.println("nhập số n : ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0;
             i < n;
             i++) {
            if (i % 2 == 0) {
                System.out.println("các số chẵn là : " + i);
                continue;
            }
                System.out.println("các số lẻ là : " + i);

        }
    }
}
