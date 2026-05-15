import java.util.*;

public class Problem15 {
    public static void main(String[] args) {
        // Give range and print till then.
        Scanner scn = new Scanner(System.in);
        int range = scn.nextInt();

        int  a = 0;
        int b = 1;
        for(int i = 0 ; i<range; i++){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }

    }
}
