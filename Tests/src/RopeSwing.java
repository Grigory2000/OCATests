import rope.Rope;

//Q.12: What is the output of the following code?

public class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
    }
}

//Q.13: How many compiler errors are in the following code?

//public class RopeSwing {
//    private static final String leftRope;
//    private static final String rightRope;
//    private static final String bench;
//    private static final String name = "name";
//    static {
//        leftRope = "left";
//        rightRope = "right";
//    }
//    static {
//        name = "name";
//        rightRope = "right";
//    }
//    public static void main(String[] args) {
//        bench = "bench";
//    }
//}