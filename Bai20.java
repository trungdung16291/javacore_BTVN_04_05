import java.util.Scanner;

public class Bai20 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhập vào số phần tử > 0 : ");
        int n = sc.nextInt();
        int[] number = nhapMang(n);
        int index = 0;
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
                index = i;
            }
            if (number[i] == max) {
                continue;
            }
        }
        System.out.println(" số lớn nhất " + number[index] + " vị trí đầu tiên là : " + index);
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
