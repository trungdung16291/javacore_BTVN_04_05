import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        System.out.println("nhập số phần tử trong mảng : ");

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("số phần tử trong mảng là : "+n );
        int[] a = new int[n];
        int tong = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("nhập phần tử thứ : " +(i+1));
            a[i] = sc.nextInt();
            tong += a[i];
        }
        float trungBinh = (float) tong / n;
        System.out.println("Trung bình của các phần tử là : " + trungBinh);
    }
}
