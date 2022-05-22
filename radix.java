import java.util.*;
public class radix {
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    
    sc.useRadix(2);
    int x=sc.nextInt();
    sc.close();
    System.out.println(x);
    }


}
