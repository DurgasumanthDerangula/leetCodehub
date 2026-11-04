class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int result=0;
        Map<Character,Integer> mp=new HashMap<>();
        int right=0;
       for (right = 0; right < s.length(); right++) {
    char c = s.charAt(right);
    if (mp.containsKey(c)) {
        if (mp.get(c) >= left) {
            left = mp.get(c) + 1;
        }
    }
    mp.put(c, right);
    result = Math.max(result, right - left + 1);
}
        return result;
    }
}