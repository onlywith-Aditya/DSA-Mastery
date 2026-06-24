

public class Problem23 {
    public static void main(String[] args) {
        int num = 21453;
        int inv = 0;
        int op = 1; //Original Place
        // 1. Check does not of digit has number of elements.
        // 2. If yes then swap number based on index values.
        // 3. '2' is at index 4.
        // 4. We have to  inverse and make '4' at index 2.
        
        // Using loop
        while(num != 0){
            int od = num%10;  // Original Digit
            int id = op;
            int ip = od;

            // Make change to inv using  ip and id.

            inv = inv + id * (int)Math.pow(10,ip-1);

            num = num / 10;
            op++;



        }
        System.out.println(inv);
    }
}
