public class Substring {

    public static String subs(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei ; i++) {
            substr += str.charAt(i);
            }
        return substr;
    }
    public static void main(String[] args) {
     String str = "HelloWorld";
        System.out.println(str.substring(0,5));
        //System.out.println(subs(str,0,5));

    }


}
