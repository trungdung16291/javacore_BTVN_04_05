import java.util.Scanner;

public class Bai14A {

    public static void main(String[] args) {
        System.out.println("nhập số n :");
        int n = new Scanner(System.in).nextInt();
        System.out.println("nhập số m :");
        int m = new Scanner(System.in).nextInt();
        int count = 0;


         if (m < n) {
            for (int i = m; i <= n; i++) {
                if (Math.sqrt(i) * Math.sqrt(i) == i) {
                    System.out.println("số chính phương là :" + i);
                    count++;

                }
            }
        }else {
             System.out.println("số bạn nhập không đúng ! hãy nhập số m < n : ");
         }
        System.out.println("tổng số chính phương là : " + count);
    }
}

