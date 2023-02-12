import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số dòng : ");
        int n = sc.nextInt();
        System.out.println("nhập vào số cột : ");
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("a [ " + i + "][" + j + "] = ");
                a[i][j]= sc.nextInt();
            }
        }
        int max=0;
        int min=a[0][0];
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length; j++) {
               if (a[i][j]>max){
                   max=a[i][j];
               }
               if (a[i][j]<min){
                   min=a[i][j];
               }
            }
        }
        System.out.println("Giá trị lớn nhất là : "+max);
        System.out.println("Giá trị nhỏ nhất là : "+min);
    }
}
