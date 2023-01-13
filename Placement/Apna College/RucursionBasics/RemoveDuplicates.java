public class RemoveDuplicates {


    public static void remove(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            remove(str,idx+1,newStr,map);
        }else {
            remove(str,idx+1,newStr.append(currChar),map);
        }


    }

    public static void main(String[] args) {
        String str = new String("appnnacollege");
        remove(str,0,new StringBuilder(""), new boolean[26]);

    }


}
