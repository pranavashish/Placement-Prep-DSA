public class TrueFalseMethod {

    public static void isEven(int num){
        boolean test;
        if(num%2==0){
            test = true;
            System.out.println(test);
        }else {
            test = false;
            System.out.println(test);
        }

    }


    public static void main(String[] args) {
    isEven(51);
    }
}
