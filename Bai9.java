import java.util.Scanner;

public class Bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các phần tử cho mảng: ");
        int n=sc.nextInt();
        int[]a= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            a[i] = sc.nextInt();
        }
    }

}

