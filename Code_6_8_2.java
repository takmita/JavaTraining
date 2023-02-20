public class Code_6_8_2 {
    public static void main(String[] args) {
        int startNumber = 11;
        int endNumber = 20;
        for (int i = startNumber; i <= endNumber; ++i) {
            System.out.println(FibonacciNumber(i));
        }
    }
    static int FibonacciNumber(int targetNumber) {
        int f0, f1, fn;
        f0 = 0;
        f1 = 1;
        fn = 0;
        for (int j = 2; j <= targetNumber; ++j) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return  fn;
    }
}
