import java.util.Scanner;

public class Bai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        do {
            System.out.println("nhập phần tử của mảng: ");
            n = sc.nextInt();
        } while (n < 0);
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ : " + (i + 1));
            a[i] = sc.nextInt();
        }
        System.out.println("nhập vào 1 số nguyên bất kỳ: ");
        int number = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == number) {
                count++;
            }
        }
        System.out.println("số phần tử " + number + " có trong mảng = " + count);
    }
}
