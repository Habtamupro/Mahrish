package convertTobase;
import java.util.*;

public class convert {

    public static int isLegalNumber(int[] a, int bases)
    {
        int isLegalNumber = 1;

        for (int i = 0; i < a.length && isLegalNumber == 1; i++)
        {
            if (a[i] >= bases) isLegalNumber = 0;

        }
        return isLegalNumber;
    }
    public static int convertTosquare(int base,int exp) {
        int sum = base;
        if(exp == 0){
            sum = 1;
        }
        else {
            for (int i = 1; i < exp; i++) {
                sum = (sum * base);
            }
        }
        return sum;
    }
    public static int convertToBase10(int[] a,int bases)
    {
        int base10 = 0,islegal = isLegalNumber(a, bases);
        int exp = 0;
        for (int i = a.length - 1; i >= 0 && islegal == 1; i--) {
            base10 = base10 + a[i] *
                    //(int)Math.pow(bases, exp);
                    ((convertTosquare(bases, exp)));
            exp++;

        }

        return base10;
    }
    public static void main(String []args){
        System.out.println(convertToBase10(new int[ ] {1, 0, 1, 1}, 2));
        System.out.println(convertToBase10(new int[ ] {1, 1,2}, 3));
        System.out.println(convertToBase10(new int[ ] {3,2,5}, 8));
        System.out.println(convertToBase10(new int[ ] {3,7,1}, 1));
    }
}
