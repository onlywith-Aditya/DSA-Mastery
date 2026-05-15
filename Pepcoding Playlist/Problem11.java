import java.util.Scanner;


public class Problem11{
public static void main(String[] args) {

        // Prime Number-> Number which is divided by own.

    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    // Test Case-> 1.-------------------------|
    // for(int i = 0;i<t;i++){
    //     int n = scn.nextInt();
        
    //     int count = 0;
    //     for(int div = 1; div<=n ;div++){
    //         if(n%div == 0 ){
    //             count++;
    //         }
    //     }
    //     if(count == 2){
    //         System.out.println("Prime");
    //     }
    //     else{
    //         System.out.println("Not Prime");
    //     }
    // }
    // Test Case-> 1.-------------------------|



    // Test Case-> 2.-------------------------|
    // for(int i = 0;i<t;i++){
    //     int n = scn.nextInt();
        
    //     int count = 0;
    //     for(int div = 2; div * div <=n ;div++){
    //         if(n%div == 0 ){
    //             count++;
    //         }
    //     }
    //     if(count == 0){
    //         System.out.println("Prime");
    //     }
    //     else{
    //         System.out.println("Not Prime");
    //     }
    // }
    // Test Case-> 2.-------------------------|



    // Test Case-> 3.-------------------------|
    for(int i = 0;i<t;i++){
        int n = scn.nextInt();
        
        int count = 0;
        for(int div = 2; div * div <=n ;div++){
            if(n%div == 0 ){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    // Test Case-> 3 .-------------------------|

}
}