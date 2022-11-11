package StantonMesaure;

public class Stanton {
    public static int stantonMeasure(int [] a){
        int n = 1;
        if(a.length <= 1) {
            n = 1;
        }
        else{
            for(int i =0; i <a.length-1; i++){
                for(int j = i+ 1; j< a.length; j++ )
                if(a[i] == a[j]){
                    n++;
                }
            }
        }





        return n;

    }


    public static void main(String []args){
        System.out.println();

    }
}
