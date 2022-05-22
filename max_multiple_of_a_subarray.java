import java.util.*;

public class max_multiple_of_a_subarray {
    //KADANE ALGORITHM
    static int MaxSum(int arr[], int n)
    {
        int current=0;
        int  max=-999999;
        for(int i=0;i<n;i++)
        {
            current=current+arr[i];
            if(current>max)
            {
                max=current;
            }

            if(current<0)
            {
                current=0;
            }
        }
        return max;
    }
    //ARR[] ={1,0,1,,1,}
    //arr[] ={1,-1,1,1}

    /*static int Sum(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                arr[i]=-1;
            }
        }


    }*/
    
    //MODIFIED KADANE ALGORITHM
    static int maxSubarrayProduct(int arr[], int n) {
        int current=1;
        int max=-999999;
        for(int i=0;i<n;i++)
        {
            current=current*arr[i];
            if(current>max)
            {
                max=current;
            }

            if(current==0)
            {
                current=1;
            }
        }

        current=1;
        for(int i=n-1;i>=0;i--)
        {
            current=current*arr[i];
            if(current>max)
            {
                max=current;
            }

            if(current==0)
            {
                current=1;
            }
        }
        return max;
        
    }

    public static void main(String[] args) {
        int arr[] = { -3, 6, -10, 0, 2, 5, 0, 1, 2, 0, 3, 4 };
        System.out.println("Maximum Sub array sum is "
                + MaxSum(arr, arr.length));
    }
}