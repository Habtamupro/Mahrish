package encodeNumber;

public class encode {
    public static int[] encodeNumber(int n) {
        int count = 0;
        int num = n;
        if (n <= 1) return new int[0];
        for (int i = 2; i <= n; i++) { //don't forget i<=n; equal rakhna parxa natra lastko euta audaina
            while (n % i == 0) { //evenly divide hunujel samma garne
                n = n / i;
                count++;
            }
        }
        int[] array = new int[count];

        n = num;
        int k = 0;
        for (int j = 2; j <= n; j++) {
            while (n % j == 0) {
                array[k++] = j;
                n = n / j;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int n = 1;
        int[] b = encodeNumber(n);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    //prime check garna jaruri xaina kinaki 2 to n samma divide garda prime matra factor hunxa, aru hunna

}
