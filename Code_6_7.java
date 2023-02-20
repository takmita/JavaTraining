public class Code_6_7 {
    public static void main(String[] args) {
        int i = 10001;
        if (primeNumber(i)){
            System.out.println(i + "は" + "素数です");
        } else {System.out.println(i + "は" + "素数ではありません");}
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
