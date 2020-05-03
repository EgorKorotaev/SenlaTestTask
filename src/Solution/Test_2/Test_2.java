package Solution.Test_2;

public class Test_2 {
    public static int NOD(int a, int b) {
        if (a % b == 0) {
            return b;
        } else if (b % a == 0) {
            return a;
        }
        if (a > b) {
            return NOD(a % b, b);
        } else {
            return NOD(a, b % a);
        }
    }

    public static int NOK(int a, int b) {
        return (a * b) / NOD(a, b);
    }
}
