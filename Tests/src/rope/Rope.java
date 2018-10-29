package rope;
//Q.10: What is the output of the following code?

public class Rope {
    public static int length = 0;
    public static int LENGTH = 5;

    static {
        LENGTH = 10;
    }

    public static void swing() {
        System.out.print("swing ");
    }
}


