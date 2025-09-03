class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(0);

        for (char c : s.toCharArray()) {
            if (c == '(') {
                dq.push(0); 
            } else {
                int v = dq.pop(); 
                int top = dq.pop();
                dq.push(top + Math.max(2 * v, 1)); 
            }
        }

        return dq.pop();
        
    }
}