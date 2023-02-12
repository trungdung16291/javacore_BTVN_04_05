import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n;
        int i = 0;
        n = sc.nextInt();
        int a[] = new int[n];
        do {
            int dem = 0;
            System.out.print("Nhập phần tử thứ " + i + ": ");
            a[i] = sc.nextInt();
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] == a[j]) {
                    System.out.println("Phần tử đã tồn tại, Mời nhập lại!");
                    dem = 1;
                    break;
                }
            }
            if (dem == 1) {
                continue;
            } else {
                i++;
            }
        } while (i < n);
        System.out.println("Mảng vừa nhập: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
