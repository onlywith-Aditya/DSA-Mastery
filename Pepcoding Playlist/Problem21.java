import java.util.*;

public class Problem21 {
    public static void main(String []args){
        // We just have to print in reverse order.
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        while(num > 0){
            int dig = num % 10; // Last Digit.
            num = num / 10; // Remove Last Digit.
            System.out.println(dig);
        }


    } 
}
