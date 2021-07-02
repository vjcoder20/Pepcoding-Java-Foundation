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
