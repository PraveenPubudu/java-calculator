
public class CalFunctions {
    public static Double callAdd(double n1, double n2) {
        Double ans = n1 + n2;
        return ans;
    }

    public static Double callSub(double n1, double n2) {
        Double ans = n1 - n2;
        return ans;
    }

    public static Double callMult(double n1, double n2) {
        Double ans = n1 * n2;
        return ans;
    }

    public static Double callDiv(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        Double ans = n1 / n2;
        return ans;
    }

    public static Double callRem(double n1, double n2) {
        Double ans = n1 % n2;
        return ans;
    }
}
// Wet Sand
// 'WANDERER: Broken Bed | v0.12 WitchCraft | NEW BUILD'