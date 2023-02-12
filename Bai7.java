import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        int n, kt = 1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n <= 0);

        int a[] = new int[n];

        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                kt = 0;
                break;
            }
        }
        if (kt == 0) {
            System.out.println("Mảng một chiều vừa nhập không là mảng đối xứng");
        } else {
            System.out.println("Mảng một chiều vừa nhập là mảng đối xứng");
        }
    }
}
