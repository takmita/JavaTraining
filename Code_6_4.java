public class Code_6_4 {
    public static void main(String[] args) {
        triangleDisplay(3);
        triangleDisplay(4);
        triangleDisplay(5);
    }
    public static void triangleDisplay(int i) {
        for (int x = 0; x < i; x++){
            for (int y = 0; y <= x; y++){
                System.out.print("$");
            }
            System.out.println();
        }
        System.out.println();
    }
}
