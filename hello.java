
public class hello{
    static int swapNibble(int N){
        return ((N & 0X0F)<<4 | (N & 0XF0)>>4);

    }
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        System.out.println(swapNibble(89));
    }
}