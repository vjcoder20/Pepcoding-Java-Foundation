/**
 * Main1
 */
public class Main1 {
    public static void fun(){
        int temp = a;
        a = b;
        b = temp;
    }
static int a = 5;
static int b = 7;
    public static void main(String[] args) {
       fun(); 
       System.out.println("a = "+ a + " b = "+ b);
    }
}