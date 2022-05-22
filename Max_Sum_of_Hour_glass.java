import java.util.*;

public class Max_Sum_of_Hour_glass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array (i,j)");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
                
            }
        }
        sc.close();
        int s=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n-2;i++)
        {
            for (int j = 0; j < m-2; j++) {
                s=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                max=Integer.max(max, s);
            }
        }
        System.out.println("Maximum is "+max);

    }
}