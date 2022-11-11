package PrimeCount;

public class count {
    public static int primeCount(int start, int end) {
        int count=0;
        int countp=0;
        for(int i =start; i<=end; i++) {
           for(int j=1; j< i; i=j++){
               if(i%j==0){
                   count++;
               }
           }
           if(count == 1){
               countp++;
           }
            count=0;
        }

       return countp;
    }
    public static void main(String[] args) {
        System.out.println( primeCount(10,30));
        System.out.println( primeCount(20,22));
        System.out.println( primeCount(1,1));
        System.out.println( primeCount(5,5));
        System.out.println( primeCount(6,2));
        System.out.println( primeCount(-10,6));
    }
}
