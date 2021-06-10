public class array {
    public static void fun(int[] arr){
        arr[2] = 10;
        arr[3] = 40;
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 20;
        arr[1] = 30;
        arr[4] = 50;
        fun(arr);
        for(int val:arr)
        System.out.println(val);
    }
}
