// optimized solution
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new  HashSet<>();
        int front = 0;
        int back = 0;
        int maxLen = 0;

        while(back < s.length()) {
            if(!chars.contains(s.charAt(back))) {
                chars.add(s.charAt(back));
                maxLen = Math.max(chars.size(), maxLen);
                back++;
            } else {
                chars.remove(s.charAt(front));
                front++;
            }
        }

        return maxLen;
    }
}


// old solution
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new  HashSet<>();
        int largest = 0;
        int tempLen = 0;

        if(s.length() == 0)
            return 0;

        int i = 1;
        for(int j=0; j < s.length(); j++) {
            chars.add(s.charAt(j));
            tempLen = 1; // start count at 1
            i = 1;

            while(j+i < s.length() && !chars.contains(s.charAt(j+i))) {
                tempLen+=1;
                chars.add(s.charAt(j+i));
                i++;
                }
            chars.clear();
                    
            if(tempLen > largest) {
                largest = tempLen; 
            }
            tempLen = 0;
        }

        return largest;
    }
}
