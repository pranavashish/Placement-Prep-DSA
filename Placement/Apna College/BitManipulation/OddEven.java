public class OddEven {

    public static void oddeven (int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }




    }
    public static void main(String[] args) {
     oddeven(34);
     oddeven(567);
     oddeven(1);
     oddeven(-16);
     oddeven(0);

    }


}
