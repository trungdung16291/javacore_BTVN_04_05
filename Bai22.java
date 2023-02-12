import java.util.Arrays;
import java.util.Scanner;

public class Bai22 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("nhập số n : ");
        int n = sc.nextInt();
        int [] a = nhapMang(n);
        System.out.println("nhập số ngẫu nhiên ");
        int x =sc.nextInt();
        System.out.println(Arrays.toString(sapXep(a , x)));
    }
    public static int [] nhapMang(int  n) {
        int [] m = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ : " + (i + 1));
            m[i] = sc.nextInt();

        }
        return m;
    }
    public static int [] sapXep(int [] b, int x){
        int  len = b.length;
       
        b= Arrays.copyOf(b,len+1);
        b[len]=x;
        for (int i = 0; i < b.length ; i++) {
            for (int j = 0; j < b.length - 1; j++) {
                if (b[j] > b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
        return b;
    }

}
