class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> d = new HashSet<>();
        int n = s.length();
        for (int i = 0; i + 10 <= n; i++) {
            String sub = s.substring(i, i + 10);
            if (!set.add(sub)) {
                d.add(sub);
            }
        }
        return new ArrayList<>(d);
    }
}