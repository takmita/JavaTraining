public class Code_6_8_1 {
    public static void main(String[] args) {
        System.out.println(FibonacciNumber(11));
    }
    static int FibonacciNumber(int targetNumber) {
        int f0, f1, fn;
        f0 = 0;
        f1 = 1;
        fn = 0;
        for (int i = 2; i <= targetNumber; ++i) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return  fn;
    }
}
