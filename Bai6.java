import java.util.Scanner;

public class Bai6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhập số n : ");
        int n = sc.nextInt();
        int[] a = nhapMang(n);
        System.out.println("nhập số b : ");
        int b =sc.nextInt();
        System.out.println("nhập số c : ");
        int c=sc.nextInt();
        System.out.println("trung bình cộng khoảng " +b+ " đến "+c+ " là : "+TBC(b , c, a));
    }

    public static int[] nhapMang(int n) {
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ : " + (i + 1));
            m[i] = sc.nextInt();

        }
        return m;
    }

    public static double TBC(int b, int c, int[] mang) {
        double sum = 0;
        int soPhanTu=0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] >= b && mang[i] <= c){
                sum+=mang[i];
                soPhanTu++;
            }
        }
        return sum/soPhanTu;
    }
}
