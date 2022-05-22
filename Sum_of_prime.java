import java.util.*;
public class Sum_of_prime{
    public static boolean prime(int n){
        boolean ar[] = new boolean[n+1];
        for (int i=0; i<=n; i++){
            ar[i] = true;
        }
        for(int i = 2; i * i <=n; i++){
            if(ar[i] == true){
                for (int j = i*i; j <=n; j += i){
                    ar[i]=false;
                }
            }
        }
        for(int i =2; i <n; i++){
            if(ar[n] == true){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int s = 0; 
    for(int i = 1; i<=n; i++){
        if(n % i ==0){
            if(prime(i)){
                s+=i;
            }
        }
    }
    System.out.println(s);   
    }

}


