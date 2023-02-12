public class Bai2 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 10000000; i++) {
            if (laSoNguyen(i)
                    && checkCacChuSNT(i)
                    && daoSNT(i)
                    )
                System.out.println(i);
        }



    }

    public static boolean laSoNguyen(int a) {
        if (a==1){
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCacChuSNT(int b) {
        String s = String.valueOf(b);
        for (int i = 0; i < s.length(); i++) {
            int n = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (!laSoNguyen(n)) {
                return false;
            }
        }
        return true;
    }

    public static boolean daoSNT(int c) {
        int temp = 0;
        int m = c;

        while (m > 0) {
            temp = temp * 10 + m % 10;
            m = m / 10;
        }
        if (temp == c && checkCacChuSNT(temp)) {
           return true;

        }
        return false;
    }
}

