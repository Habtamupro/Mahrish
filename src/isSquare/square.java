package isSquare;

public class square {
    public static int isSquare(int n)
    {
        int Val = 0;
        for(int i=0;i<=n;i++)
        {
            if(i*i==n)
            {
                Val = 1;
                break;
            }
        }
        return Val;
    }
    public static void main(String [] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }
}

