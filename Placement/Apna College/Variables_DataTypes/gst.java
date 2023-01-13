import java.util.Scanner;

public class gst {
       public static void main(String[] args) {
           Scanner scr = new Scanner(System.in);
           int pencil = scr.nextInt();
           int pen = scr.nextInt();
           int eraser = scr.nextInt();
           int total = pencil+pen+eraser;
           double gst = total + (total*0.18);
           System.out.println(gst);

    }
}
