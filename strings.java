public class strings {
    public static void main(String[] args) {
        // String s = "Hello World";
        // System.out.println(s.length());
        // char ch = s.charAt(0);
        // System.out.println(ch);
        // for(int i = 0;i<s.length();i++){
        // char chh = s.charAt(i);
        // System.out.println(chh);

        String str = "abcd";
        // System.out.println(str.substring(0, 2));
        // System.out.println(str.substring(0));
for (int i = 0; i < str.length(); i++) {
    for (int j = i+1; j <= str.length(); j++)
        System.out.println(str.substring(i,j));
    
}
String s2 = "abc def ghi jkl";
String[] parts = s2.split(" ");
for (int i = 0; i < parts.length; i++) {
    System.out.println(parts[i]);
}
    }

}
