class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int w = 0, r = 0;
        
        while (r < n) {
            char currentChar = chars[r];
            int count = 0;
            
    
            while (r < n && chars[r] == currentChar) {
                r++;
                count++;
            }
            
            
            chars[w++] = currentChar;
            
            
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[w++] = c;
                }
            }
        }
        
        return w;
        
    }
}