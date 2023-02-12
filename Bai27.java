import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        System.out.println("nhập ma trận : ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = new Scanner(System.in).nextInt();
        int sum = 0;
        int a[][] = new int[n][n];

        System.out.println("nhập phần tử ma trận :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "] =");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("ma trận a vừa nhập : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += a[i][j];
                }

            }
        }
        System.out.println("tổng các phần tử trên đường chéo chính = " + sum);
    }


}
