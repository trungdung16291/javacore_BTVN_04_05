import java.util.Scanner;

public class Bai8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
         while (n < 0);
        int a[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Nhập vào 1 số nguyên bất kỳ: ");
        int number = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == number) {
                count++;
            }
        }

        System.out.println("Số phần tử " + number + " có trong mảng = " + count);
    }
}
