package DailyCoding;

public class No25_power {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 40;
        long result = base;
        int NUM = 94906249;

        while (exponent != 1) {
            result = (result * base) % NUM;
            exponent -= 1;
        }

        System.out.println(result);
    }
}
