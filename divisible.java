import java.util.*;
public class divisible{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = 0;
        sc.close();
        for(int i = a; i<=b; i++){
            if (i % 15 == 0){
                s+=i;
            } 
        } 
        System.out.println(s);
    }
}