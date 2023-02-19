public class Code_6_6 {
    public static void main(String[] args) {
        calKuku(9);
    }
    public static void calKuku(int i) {
        for (int x = 1; x <= i; x++){
            for (int y = 1; y <= i; y++){
                System.out.printf("%2d", x * y);
            }
            System.out.println();
        }
        System.out.println();
    }
}
