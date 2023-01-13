public class PalindromeNum {

    public static void palindrome(int no){
        int num = no;
        int rem = 0;
        int palino = 0;

       while (num > 0){
           rem = num % 10;
           palino = palino * 10 + rem;
           num = num/10;
       }
       if(no == palino){
           System.out.println("It's Palindrome");
        }
       else{
           System.out.println("It's Not Palindrome");
       }

    }

    public static void main(String[] args) {
           palindrome(121);
    }
}
