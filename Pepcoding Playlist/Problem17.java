import java.util.*;

public class Problem17 {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        // Count Number of digit.
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Count: " + count);
    }
}
