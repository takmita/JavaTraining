public class Code_6_3 {
    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        int z = 4;
        System.out.println(x + "," + y +"," + z + " でいちばん大きいのは" + MathMax(MathMax(x, y), z) + "です");
    }
    public static  int MathMax(int i,int j) {
        if (i > j)
            return  i;
        else
            return  j;
    }
}
