package isLegalNumber;

public class isLegalNumber {
    public static int isLegalNumber(int[] a, int bases)
    {
        int isLegalNumber = 1;

        for (int i = 0; i < a.length && isLegalNumber == 1; i++)
        {
            if (a[i] >= bases){
                isLegalNumber = 0;
            }

        }
        return isLegalNumber;
    }

    public static void main(String []args){

        System.out.println(isLegalNumber(new int[] {3,2,1},4));
        System.out.println(isLegalNumber(new int[] {3,7,1},6));
    }
}
