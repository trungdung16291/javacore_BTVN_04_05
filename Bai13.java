import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {

        for (int i = 100000; i < 1000000; i++) {
            boolean laThuanNghich=soThuanNghich(i);

            if (laThuanNghich){
                int  sum =0;
                String ThuanNghich=String.valueOf(i);
                for (int j = 0; j < ThuanNghich.length(); j++) {
                    sum+=Integer.parseInt(String.valueOf(ThuanNghich.charAt(j)));
                }
                if (sum%10==0){
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean soThuanNghich(int n) {
        int m = 0;
        int x;
        x = n;
        for (; n != 0; n /= 10) {
            int z = n % 10;
            m = m * 10 + z;
        }
        if (x == m) {
            return true;
        }
        return false;
    }

}
