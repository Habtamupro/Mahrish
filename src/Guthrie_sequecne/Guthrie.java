package Guthrie_sequecne;

public class Guthrie {
    public static int isGuthrieSequence(int[] a) {
        int isGuthrie = 1;
        // check for the last element
        if (a[a.length - 1] != 1) {
            return 0;
        }
        else {
            //Then work through
            int currentNumber = a[0];
            for (int i = 1; i < a.length; i++) {
                if (currentNumber % 2 == 0) {
                    if (a[i] != currentNumber / 2) {
                        isGuthrie = 0;
                    }
                } else {
                    if (a[i] != currentNumber * 3 + 1) {
                        isGuthrie = 0;
                    }
                }
                currentNumber = a[i];
                if(isGuthrie == 1){
                    break;
                }
            }
        }
        return isGuthrie;
    }
    public static void main(String []args){
        int[] val = {16, 4, 2, 1};
        System.out.println(isGuthrieSequence(val));
    }
}

