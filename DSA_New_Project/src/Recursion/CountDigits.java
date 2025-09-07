package Recursion;

public class CountDigits {
    private static int CountNumberOfDigits(int num) {
        if (num >= 0 && num <= 9)
            return 1;
        return 1 + CountNumberOfDigits(num / 10);
    }

    public static void main(String[] args) {
        int num = 97867;
        int count = CountNumberOfDigits(num);
        if (count == 1)
            System.out.println("only one element : " + count);
        else
            System.out.println("we have result : " + count);
    }
}
