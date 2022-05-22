import java.util.*;

public class Block_Swap_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of array");
        int N = sc.nextInt();
        int a[] = new int[N];
        int b[] = new int[N];
        System.out.println("Entr the elements of array");
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the position to be swaped");
        int q = sc.nextInt();
        int p = N - q;
        int k = 0;
        for (int i = 0; i < N; i++) {
            if (i + p < N)
                b[i + p] = a[i];
            else {
                b[k] = a[i];
                k++;
            }
        }
        sc.close();
        for (int i = 0; i < N; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
    

