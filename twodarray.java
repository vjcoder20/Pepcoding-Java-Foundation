/**
 * rectangular and jacked twodarray
 */
public class twodarray {
    public static void fun(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    // int[][] arr = new int[2][3];
    // arr[0][0] = 11;
    // arr[0][1] = 21;
    // arr[0][2] = 31;
    // arr[1][0] = 41;
    // arr[1][1] = 51;
    // arr[1][2] = 61;
    int[][] arr = new int[2][];
    arr[0] = new int[3];
    arr[1] = new int[4];
    arr[0][0] = 11;
    arr[0][1] = 21;
    arr[0][2] = 31;
    arr[1][0] = 41;
    arr[1][1] = 51;
    arr[1][2] = 61;
    arr[1][3] = 71;
    fun(arr);
}
    
}