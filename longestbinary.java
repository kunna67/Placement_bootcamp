import java.util.Scanner;

public class longestbinary {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int []ar=new int[s.length()];
        int count=0;
        for(int y=0;y<s.length();y++){
        if(s.charAt(y)=='0'){
            ar[count]=y;
            //j++;
            count++;
        }
        }
        count++;
      //  System.out.println(count);
        int mx=1;
        if(count==s.length()+1){
            mx=1;
        }else  if(count==1 || count==2){
            mx=s.length();
        }
        else{
        for(int y=0;y<count;y++){
            int j,k;
            if(y==0){
                j=-1;
            }else{
                j=ar[y-1];
            }
            if(y==count-2){
                k=s.length();
                if(ar[y]==s.length()-1){
                    k--;
                }
            }else{
                k=ar[y+1];
            }
            //System.out.print(ar[y]-j-1+k-ar[y]+" "+ar[y]+"- ");
                mx=Math.max(mx,ar[y]-j-1+k-ar[y]);
            
        }
    }
        System.out.println(mx); 
    }
}
    

