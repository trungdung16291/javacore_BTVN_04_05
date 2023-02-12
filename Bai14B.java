import java.util.Scanner;

public class Bai14B {

   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("nhập số m :");
        int m=input(0);
        System.out.println("nhập số n : ");
        int n=input(m);
        int count = 0;

        for (int i = m; i < n; i++) {
            int temp = (int) Math.sqrt(i);
            if (temp * temp == i) {
                count++;
                System.out.println("số chính phương là :" + i);
            }
        }
        System.out.println("số lương số chính phương là :" + count);
    }
    public static int input (int x){
        int value = sc.nextInt();

        if (value<x){
            System.out.println("vui lòng nhập số m < n :");
            return input(x);

        }
        return value;
    }

}
