package Solution.Test1;

public class Check_int {
    /**
     * we use the parity definition and the "iterate over divisors" algorithm
     *
     * @param n number to check
     * @return line with the answer
     */
    public static String test1(int n) {
        String res = "Число " + n + " ";
        if (n % 2 == 0) { res = res.concat("чётное "); }
        else { res = res.concat("не чётное "); }

        boolean j = true;
        for (int i = 2; i * i <= n & j; i++) {
            if (n % i == 0) { j = false; }
        }
        if (!j) { res = res.concat("и составное число"); }
        else { res = res.concat("и простое число"); }
        return res;
    }
}
