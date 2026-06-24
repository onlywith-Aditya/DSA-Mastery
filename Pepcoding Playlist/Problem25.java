public class Problem25 {
    public static void main(String[] args) {
        int n = 27316; 
        int k = 2; // Number of Rotation
        
        int original = n;  // ✅ Save original number
        
        // Count digits using a copy
        int temp = 0;
        int tempNum = n;  // ✅ Use a temporary variable
        while(tempNum > 0){
            tempNum = tempNum / 10;
            temp++;
        }
        System.out.println("No. of Digit:" + temp);
        
        // Special Case: what if have 'n' number of Rotation
        k = k % temp;
        // Negative Number handling
        if(k < 0){
            k = k + temp;
        }
        
        int div = 1;
        int mult = 1;
        for(int i = 1; i <= temp; i++){
            if(i <= k){
                div = div * 10;
            }
            else{
                mult = mult * 10;
            }
        }
        
        int q = original / div;  // ✅ Use original here
        int r = original % div;  // ✅ Use original here
        
        int rot = r * mult + q;
        
        System.out.println("Original: " + original);
        System.out.println("Rotated: " + rot);
    }   
}