class Solution {
    public String convert(String s, int numRows) {
         if (numRows == 1 || s.length() <= numRows) return s;
        
        StringBuilder result = new StringBuilder();
        int cLen = 2 * numRows - 2;
        
        for (int row = 0; row < numRows; row++) {
            for (int j = row; j < s.length(); j += cLen) {
                result.append(s.charAt(j));
                
              
                int dIndex = j + cLen - 2 * row;
                if (row != 0 && row != numRows - 1 && dIndex < s.length()) {
                    result.append(s.charAt(dIndex));
                }
            }
        }
        return result.toString();
        
    }
}