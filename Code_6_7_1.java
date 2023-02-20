public class Code_6_7_1 {
    public static void main(String[] args) {
        int startNum = 10000;
        int endNum = 10100;
        for (int i = startNum; i < endNum; i++) {
            if (primeNumber(i)){
                System.out.println(i);
            }

        }
    }
    static boolean primeNumber(int num) {
        for (int x = 2; x < num; x++) {
            if ((num % x) == 0) {
                return false;
            }
        }
        return true;
    }
}
