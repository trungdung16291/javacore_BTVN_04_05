import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        System.out.println("nhập số tự nhiên n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 7 == 0) {
                tong += i;

            }

        }
        System.out.println("Tổng các số tự nhiên không lớn hơn số vừa nhập vào và chia hết cho 7 là : " + tong);
    }
}
