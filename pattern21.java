/* 
For n=5                       For n=6
1 2 3 4 5                     1 2 3 4 5 6
11 12 13 14 15                13 14 15 16 17 18
21 22 23 24 25                25 26 27 28 29 30
16 17 18 19 20                31 32 33 34 35 36
6 7 8 9 10                    19 20 21 22 23 24
                              7 8 9 10 11 12
*/
import java.util.*;
public class pattern21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = 1;
        for(int i=1;i<=n;i++){
                int acval = val;
            for(int j=1;j<=n;j++){
                if(n%2!=0){
                if(i<=n/2+1){
                    System.out.print(acval+"\t");
                    acval++;
                }
                else{
                    int aval = acval+n;
                    System.out.print(aval+"\t");
                    acval++;
                }
                }
            else{
                if(i<=n/2){
                    System.out.print(acval+"\t");
                    acval++;
                }
                else{
                    int aval = acval-n;
                    System.out.print(aval+"\t");
                    acval++;
                }
            }
            }
            System.out.println();
            if(i<=n/2)
            val = val+2*n;
            else
            val = val-2*n;
        }
        scn.close();
    }
}
