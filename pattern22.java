/*  For n=9            For n=7

    *                     *
   ***                   ***
  * * *                 * * *
 *  *  *               *******
*********               * * *
 *  *  *                 ***
  * * *                   *
   ***
    *
    
    */
    


import java.util.*;

public class pattern22 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int spaces = n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=spaces+1;j<=stars+spaces;j++){
                if(i>2 && i<=n/2 || i>n/2+1 && i<=n-2){
                    if(j==spaces+1 || j==n/2+1 || j==stars+spaces)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                else
                System.out.print("*");
            }
            
           
            System.out.println();
            if(i<=n/2){
                stars+=2;
                spaces--;
            }
            else{
                stars-=2;
                spaces++;
            }
        }
        scn.close();
        
    }
}