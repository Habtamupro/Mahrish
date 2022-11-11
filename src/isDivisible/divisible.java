package isDivisible;

public class divisible {
    public static int isDivisible(int [ ] a, int divisor){
        int count = 0;
        for (int j : a) {
            if (j % divisor == 1) {
                count = 1;
            } else {
                count = 0;
            }
        }
        return count;

    }

    public static void main(String []args){
        System.out.println(isDivisible(new int[] {6, 12, 24, 36},3));

    }
}
