package Recursion;

public class PowerOfNumber {

    private static int powerofdigit(int p, int q) {

        if (q == 0) return 1;
        int smallpow = powerofdigit(p, q / 2);

        if (q % 2 == 0)
            return smallpow * smallpow;

        return p * smallpow * smallpow;

    }

    public static void main(String[] args) {
//        int p = 5;
//        int q = 4;
//        int power = 1;
//        for (int i = 0; i < q; i++) {
//            power *= p;
//        }
//        System.out.println(power);

        System.out.println(powerofdigit(5, 4));
    }

}
