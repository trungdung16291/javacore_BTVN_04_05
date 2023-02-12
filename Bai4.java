import java.util.Scanner;

public class Bai4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("nhập số n : ");
        int n = sc.nextInt();
        int[] a = nhapMang(n);
        System.out.println("Mảng có cặp 2 liên tiếp bằng nhau là : " + demCap(a));

    }

    public static int[] nhapMang(int n) {
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ : " + (i + 1));
            m[i] = sc.nextInt();

        }
        return m;
    }

    public static int demCap(int[] mangDem) {
        int count = 0;
        for (int i = 0; i < mangDem.length - 1; i++) {
            if (mangDem[i] == mangDem[i + 1]) {
                count++;
            }
            if (mangDem[i] == mangDem[i + 1] && (i + 3) < mangDem.length && mangDem[i] == mangDem[i + 3]){
                count +=2;

            }
        }
        return count;
    }
}
