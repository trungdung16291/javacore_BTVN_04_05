import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số n : ");
        int n = sc.nextInt();
        System.out.println("nhập số m : ");
        int m = sc.nextInt();
        for (int i = 2; i < m || i < n; i++) {
            if (n % i == 0 && m % i == 0) {
                System.out.println("không là 2 số NTCN  ");
                return;
            }
        }
        System.out.println("là 2 số NTCN");
    }
}
