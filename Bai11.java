import java.util.Scanner;

public class Bai11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m;
        int n;
        int[][] a;
        System.out.print("nhap m:");
        m = sc.nextInt();
        System.out.print("nhap n:");
        n = sc.nextInt();
        a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("nhap gia tri:");
                System.out.print("a[" + i + "," + j + "]= ");
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}




