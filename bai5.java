import java.util.Scanner;

public class bai5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("nhập số n : ");
        int n = sc.nextInt();
        int[] a = nhapMang(n);
        int kq = timSoLonThuHai(a);
        if (kq==-1)    {
            System.out.println("không có số lớn thứ 2");
            return;
        }
        System.out.println("số lớn thứ 2 là : " + kq);

    }

    public static int[] nhapMang(int n) {
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ : " + (i + 1));
            m[i] = sc.nextInt();

        }
        return m;
    }

    public static int timSoLonThuHai(int[] mang) {
        int soLonThuNhat = mang[0];
        int soLonThuHai = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (soLonThuHai<soLonThuNhat && soLonThuNhat<=mang[i]){
                soLonThuHai=soLonThuNhat;
            }
            if (soLonThuNhat <= mang[i]) {
                soLonThuNhat = mang[i];
            }

        }
        if (soLonThuNhat==soLonThuHai){

            return -1;
        }
        return soLonThuHai;
    }
}
