public class Code_6_6_ans {
    static void main(String[] args)
    {
        for (int x = 1; x <= 9; x++)
            caluKuku(x);
    }
    static void caluKuku( int x )
        {
            for (int y = 1; y <= 9; y++)
                System.out.printf("%2d", x * y);
            System.out.println();
        }
    }
}
