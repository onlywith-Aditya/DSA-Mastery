import java.util.*;

public class Problem19 {
    public static void main(String arg[]){
        // In this we have to print all digit of a number, in starting order.
        // Scanner scn = new Scanner(System.in);
        // int num = scn.nextInt();
        int num = 1554538760;

        // Count number of digit.
        int count = 0;
        int temp = num;
        while(temp != 0){
            temp = temp / 10;
            count++;
        }

        // Calculate power of digit.
        int div =  (int)Math.pow(10,count-1);
        while(div!=0){
            int q = num / div;
            System.out.println(q);
            
            num = num % div;
            div = div / 10;
        }

    }
}
