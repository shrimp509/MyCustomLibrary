package iir.ncku.edu.mycustomlibrary;

public class MyMath {

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int minus(int n1, int n2) {
        return n1 - n2;
    }

    public static int mutiply(int n1, int n2) {
        return n1 * n2;
    }

    public static int divide(int n1, int n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("divide by zero error");
        }else {
            return n1 / n2;
        }
    }
}
