package guthrieIndex;
import java.util.ArrayList;

public class guthrieIndex {
    public static ArrayList<Integer> Guthrie_index(int a) {
        int count  =0;
        ArrayList<Integer> array = new ArrayList<>();
        while(count == 0) {
            if (a % 2 == 0) {
                while (a % 2 == 0) {
                    a /= 2;
                    array.add(a);
                }
            } else if (a != 1) {
                a = a * 3 + 1;
                array.add(a);
            } else {
                array.add(1);
                count = 1;
            }
        }
        return array;
    }
    public static void main(String []args){
      System.out.println(Guthrie_index(1));
        System.out.println(Guthrie_index(2));
        System.out.println(Guthrie_index(3));
        System.out.println(Guthrie_index(4));
        System.out.println(Guthrie_index(42));


    }
}
