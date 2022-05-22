import java.util.Scanner;
import java.util.*;


public class remaindertheorem
{
    //FUNCTION FOR CHINESE REMAINDER THEOREM
    public static int FindNumber(int number[], int rem[])
    {
        int M=1;
        for(int i=0;i<number.length;i++)
        {
            M*=number[i];
        }
        
        int total=0;
        int[] Ms=new int[number.length];
        for(int j=0;j<number.length;j++)
        {
            
            Ms[j]=M/number[j];
            //System.out.print(Ms[j]+ " ");
        }
        System.out.println();
        
        int[] PS=new int[number.length];
        for(int k=0;k<number.length;k++)
        {
            int p=1;
            boolean flag=true;
            while(flag)
            {
                if(((Ms[k]*p)%number[k])==1)
                {
                    PS[k]=p;
                    flag=false;
                }
                else{
                    p++;
                }
            }
            //System.out.print(PS[k]+ " ");
            
        }
        System.out.println();
        
        int Required=0;
        for(int q=0;q<number.length;q++)
        {
            Required+=(rem[q]*Ms[q]*PS[q]);
        }
        
        return (Required%M);
        
    }
}
    