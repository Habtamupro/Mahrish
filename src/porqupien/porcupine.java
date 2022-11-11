package porqupien;

public abstract class porcupine {
    public static int isPrime(int num) {
        int count = 0;
        for (var i = 2; i < num; i++) {
            if (num % i == 0) {
                count = 1;
                break;
            }
        }
        return count;
    }

    public static int findPorcupineNumber(int n)
    {
        int porcupine = 0,nextPrime = 0;
        //while the porcupine number is not found work this loop
        while (porcupine == 0) {
            //start from the next number
            n++;
            //if the prime number ends with 9 and prime store is as porcupine
            if (isPrime(n) == 0 && (n % 10 == 9)) {
                porcupine = n;
            }
            // check for next prime if it's end with the 9
            while (porcupine > 0 && nextPrime == 0)
            {
                //Find the next number
                n++;
                //check if the next_Number is prime
                if (isPrime(n) == 0) {
                    nextPrime = n;
                    //if the next prime number doesn't end with 9
                    if (nextPrime % 10 != 9) {
                        // reset the porcupine and next_Prime numbers
                        porcupine = 0;
                        nextPrime = 0;
                    }
                }
            }
        }
        return porcupine;
    }
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(709));
    }
}