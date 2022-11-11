package largestprimeFactor;

public class PR {
    public static double MaxPrime(double num){
        double MaxPr = 0;
        if(num % 2 == 0){
            MaxPr = 2;
            while(num % 2 == 0){
                num = num/2;
            }
        }
        for(double i = 3; i <= Math.sqrt(num); i += 2){
            while (num % i == 0){
                MaxPr = i;
                num = num/i;
            }
        }
        if (num > 2){
            MaxPr = num;
        }

        return MaxPr;
    }

    public static void main(String [] args){
        System.out.println(MaxPrime(6936));
    }
}
