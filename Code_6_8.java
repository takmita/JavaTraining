public class Code_6_8 {
    public static void main(String[] args) {
        FibonacciNumber();
    }
    static void FibonacciNumber() {
        int f0, f1, fn;
        f0 = 0;
        System.out.println(f0);
        f1 = 1;
        System.out.println(f1);
        for (int i = 2; i <= 10; ++i) {
            fn = f0 + f1;
            System.out.println(fn);
            f0 = f1;
            f1 = fn;
        }
    }
}
