package DailyCoding;

public class No25_power {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 40;

        No25_power test = new No25_power();
        System.out.println(test.power(base, exponent));

        //3^40
        //40
        //20 + 20
        //10 + 10
        //5 + 5
        //


    }

    public long power(int base, int exponent) {
        int NUM = 94906249;
        if (exponent == 0) return 1;

        int half = exponent / 2;
        long temp = power(base, half);
        long result = temp * temp % NUM;

        if (exponent % 2 == 1) {
            return result * base % NUM;
        } else {
            return result;
        }
    }

}
