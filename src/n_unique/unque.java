package n_unique;

public class unque {
    public static int isNUnique(int[ ] a, int n){
            int count = 0, rtnVal = 0;
            if (a.length > 1) {
                for (int i = 0; i < a.length-1; i++){
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[i] + a[j] == n) {
                            count++;
                        }
                    }
                }
                if (count == 1) {
                    rtnVal = 1;
                }
            }
                return rtnVal;

    }
    public static void main(String []args){
        System.out.println(isNUnique(new int[] {7, 3, 3, 2, 4},6));
        System.out.println(isNUnique(new int[] {7, 3, 3, 2, 4},10));
        System.out.println(isNUnique(new int[] {7, 3, 3, 2, 4},11));
        System.out.println(isNUnique(new int[] {7, 3, 3, 2, 4},8));
        System.out.println(isNUnique(new int[] {7, 3, 3, 2, 4},4));
        System.out.println(isNUnique(new int[] {1},3));


    }

}
