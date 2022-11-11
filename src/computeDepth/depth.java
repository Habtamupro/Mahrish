package computeDepth;

public class depth {
          public static int computeDepth(int n) {

           int[] array = new int[10];
           for (int i = 0; i < 10; i++) array[i] = i;
           int index = 1;
           while (true) {
               int product = n * index;
               while (product > 0) {
                   int rem = product % 10;
                   product /= 10;

                   if (array[rem] == rem) {
                       array[rem] = 1;
                   }
               }

               int check = 0;
               for (int aFlag : array) {
                   if (aFlag != 1) {
                       check = 1;
                       break;
                   }
               }
                   if (check == 0)
                       break;
               index++;

               }
           return index;
       }
    public static void main(String []args){
        System.out.println(computeDepth(42));
            System.out.println(computeDepth(7));
        System.out.println(computeDepth(13));
        System.out.println(computeDepth(25));

    }
}
