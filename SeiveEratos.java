import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SeiveEratos
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> sieve = new ArrayList<Integer>(Collections.nCopies(n+1,1));
        // use boolean array and set it to default by true
        for (int i = 2; i*i <= n; i++)
        {
            if(sieve.get(i) ==1)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    sieve.set(j,0);
                }
            }
        }

        for (int i = 2; i <= n; i++)
        {
            if(sieve.get(i)==1)
            {
                System.out.print(i+" ");
            }
        }

    }
}