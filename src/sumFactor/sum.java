package sumFactor;

public class sum {
    public static int sumFactor(int[ ] a){
        int count =0,sum =0 ;
        for(int i =0; i <a.length; i++){
         sum += a[i];
        }
        for(int j = 0; j< a.length; j++ )
            if(sum == a[j]){
                count++;
            }
        return count;
    }

    public static void main(String []args){
        System.out.println(sumFactor(new int[] {3, 0, 2, -5, 0}));
        System.out.println(sumFactor(new int[] {9, -3, -3, -1, -1}));
        System.out.println(sumFactor(new int[] {1}));
        System.out.println(sumFactor(new int[] {0,0,0}));

    }
}
