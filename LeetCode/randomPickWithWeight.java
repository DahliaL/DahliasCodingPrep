class Solution {
    HashMap<Integer, Float> numIndex = new HashMap<Integer, Float>();
    private int sum = 0;
    private int len;
    int[] og;

    public Solution(int[] w) {
        len = w.length;
        og = w;

        for(int i = 0; i < len; i++) {
            sum+= w[i];
            //numIndex.putIfAbsent(w[i], i);
        }

        float currRatio = 0;

        for(int i = 0; i < len; i++) {
            currRatio += w[i]/(float)sum;
            numIndex.put(i, currRatio);
        }
        
    }
    
    public int pickIndex() {
        if(og.length == 1)
            return 0;
        Random random = new Random();
        float pick = random.nextFloat();

        for(int i = 0; i < len; i++) {
            if(pick <= numIndex.get(i))
                return i;
        }

        return 0;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
