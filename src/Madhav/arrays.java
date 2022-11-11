package Madhav;

public class arrays {

    public static int isMadhavArray(int[] a) {
        int sum = 0, count = 0, n = 1, j = 1;
        while (a.length > n * (n + 1) / 2) {
            int len = n * (n + 1) / 2;
            for (int i = len; i <=len + j; i++) {
                sum = sum + a[i];
            }
            if (a[0] == sum) {
                sum = 0;
                j++;
                n++;
                count = 1;
            }
            else {count = 0;}
        }
        return count;
    }
    public static void main(String[] args) {
        int [] l = {3, 1, 2, 3, 0} ;
        System.out.println(isMadhavArray(l));
    }
}
