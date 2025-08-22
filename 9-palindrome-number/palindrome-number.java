class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0) return false;

        int cp = x;
        int rd = 0;

        while(cp > 0){
            int ld = cp % 10;
            rd = rd * 10 + ld;
            cp = cp / 10;
        }
        return x==rd;

        
    }
}