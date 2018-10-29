//Q.22: What is the result of the following?

//    public class Order {
//        static String result = "";
//        { result += "c"; }
//        static
//        { result += "u"; }
//        { result += "r"; }
//    }

//Q.23: What is the result of the following?

public class Order {
    String value = "t";

    {
        value += "a";
    }

    {
        value += "c";
    }

    public Order() {
        value += "b";
    }

    public Order(String s) {
        value += s;
    }

    public static void main(String[] args) {
        Order order = new Order("f");
        order = new Order();
        System.out.println(order.value);
    }
}

