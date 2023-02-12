import java.util.Scanner;

public class Bai21 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("nhập vào số phần tử > 0 : ");
        int n = sc.nextInt();
        int[] number = nhapMang(n);
        int max = number[0];
        int min = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];

            }
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("Số lớn nhất là : " + max);
        System.out.println("số nhỏ nhất là : " + min);

    }


    public static int[] nhapMang(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("nhập phần tử thứ : " + i);
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
}
