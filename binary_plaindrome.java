public class binary_plaindrome 
{
    public static boolean isPalindrome(int n)
    {
        int rev = 0;
 
        int k = n;
        while (k > 0)
        {
            rev = (rev << 1) | (k & 1);
            k = k >> 1;     
        }
 
        return n == rev;
    }
 
    public static void main(String[] args)
    {
        int n = 8;         
 
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome");
        }
        else {
            System.out.println(n + " is not a palindrome");
        }
    }
}