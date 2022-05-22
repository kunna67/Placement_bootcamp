import java.util.Scanner;
public class Sleve
{
    
    public static void Prime(int p, boolean arr[], int n)
    {
        int i=2;
        int temp=p*i;
        
        while(temp<=n)
        {
            arr[temp]=false;
            i++;
            temp=p*i;
        }
        return;
    }
    
    public static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        System.out.println("Prime Number is : "+n);
        return true;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of the n: ");
		int n=s.nextInt();
		boolean [] array=new boolean[n+1];
		array[0]=false;
		array[1]=false;
		array[2]=true;
		for(int i=2;i<=n;i++)
		{
		    array[i]=true;
		}
		
		Prime(2, array, n);
		/*System.out.println("After finding 2 as prime number: ");
		int totall=0;
		for(int j=0;j<=n;j++)
		{
		    if(array[j]==true)
		    {
		        totall++;
		    }
		}
		System.out.println("Total prime Numbers in this range: "+totall);*/
		for(int i=3;i<Math.sqrt(n);i++)
		{
		    if(isPrime(i))
		    {
		        Prime(i, array, n);
		    }
		}
		int total=0;
		for(int j=0;j<=n;j++)
		{
		    if(array[j]==true)
		    {
		        total++;
		    }
		}
		System.out.println("Total prime Numbers in this range: "+total);
		
		
	}
}
