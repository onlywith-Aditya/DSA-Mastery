class Solution {
    public boolean isPerfectSquare(int num) {

    // Edge case-> If less than 2
    if(num < 2) return true; // Perfect Square.

    long left = 1;
    long right = num/2;

    while(left <= right){

        long mid = left + (right - left) / 2;
        long square = mid * mid;

        if(square == num){
            return true;
        }
        else if(square < num){
            left = mid + 1;
        }
        else{
            right = mid - 1;
            
        }


    }

    return false;

    }
}