public class Code_6_5 {
    public static void main(String[] args) {
        triangleDisplay(3, 'A');
        triangleDisplay(4, 'B');
        triangleDisplay(5, 'C');
    }
    public static void triangleDisplay(int i,char j) {
        for (int x = 0; x < i; x++){
            for (int y = 0; y <= x; y++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
}
