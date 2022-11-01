class Solution {
   public int lengthOfLongestSubstring(String s) {
    final int n = s.length();
    int len = 0;
    int [] repeat = new int[128];
    for (int c = 0, j = 0, i = 0; j < n; j++) {
        c = s.charAt(j);
        i = Math.max(repeat[c], i);
        len = Math.max(len, j - i +1);
        repeat[c] = j+1;
    }
    return len;
}
}
