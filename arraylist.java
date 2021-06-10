import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(1,1000);
        System.out.println(list + " -> " + list.size());
        int val = list.get(1); //not list[1]
        System.out.println(val);
        list.set(1,2000); //not list[1] = 2000;
        System.out.println(list + " -> " + list.size());
        list.remove(1);
        System.out.println(list + " -> " + list.size());
        //If you just want to print content of list then use below line
        System.out.println(list);
    }
}
//You can use loop and upper limit size of list is list.size();
// also you can make arraylist of any data ex: string.