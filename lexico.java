import java.util.HashMap;
import java.util.Scanner;

public class lexico {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = s.length();
        HashMap<Character, Integer> mp = new HashMap<>();
        char[] sp = s.toCharArray();
        for (char c : sp) {
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }
        int x = 0,e=0,o=0;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (mp.get(s.charAt(i)) % 2 == 0) {
                    x++;
                }
            }
            if (x == n) {
                System.out.println("Can be Palindromic");
            } else {
                System.out.println("No palindromic string");
            }
        }else
        {
            for (int i = 0; i < n; i++) {
                if (mp.get(s.charAt(i)) % 2 == 0) {
                    e++;
                }else{
                    o++;
                }
            }
            if(e==n-1 && o==1){
                System.out.println("Can be palindromic");
            }else{
                System.out.println("No palindromic string");
            }
        }
    }
}