import java.util.Scanner;

public class ContainsDuplicate {
    public static boolean duplicate(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    return true;
                }
                else{
                    j++;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scr.nextInt();
        }
        System.out.println(duplicate(arr));
    }
}
