public class strings2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        
        sb.setCharAt(0, 'd');
        System.out.println(sb);
        
        sb.insert(2, 'y');
        System.out.println(sb);
        
        sb.deleteCharAt(2);
        System.out.println(sb);
        
        sb.append('g');
        System.out.println(sb);
    }
}
