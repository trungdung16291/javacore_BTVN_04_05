public class Bai1 {


    public static void main(String[] args) {
        for (int i = 1000000; i < 100000000; i++) {
            if (soDao(i)  && timSo(i) && checkChiaHetCho10(i))
                System.out.println(i);
        }
    }

    public static boolean soDao(int x) {
        int temp = 0;
        int m = x;

        while (m > 0) {
            temp = temp * 10 + m % 10;
            m = m / 10;
        }
        if (temp == x) {
            return true;
        }
        return false;
    }

    public static boolean timSo(int b) {
        String s = String.valueOf(b);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '6' && s.charAt(i) != '8') {
                return false;
            }
        }
        return true;
    }

    public static boolean checkChiaHetCho10(int c) {
        String s = String.valueOf(c);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int number = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += number;

        }
        if (sum % 10 == 0) {
            return true;
        }
        return false;
    }
}
