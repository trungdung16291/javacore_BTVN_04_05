import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
        System.out.println("nhập số n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ : " + (i + 1));
            a[i] = sc.nextInt();
        }
        int le = 0;
        int chan = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                chan++;
                continue;
            }
            le++;
        }
        System.out.println("tổng số phần tử chẵn là : " + chan);
        System.out.println("tổng số phần tử lẻ là : " + le);
    }
}
