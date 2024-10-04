class Solution {
    public int findJudge(int n, int[][] trust) {
        // base case of n == 1
        if(n == 1) {
            if(trust.length == 0)
                return 1;

            return -1;
        }
        
        int[] trustedByCount = new int[n]; // in degrees
        int[] trustCount = new int[n]; // out degrees

        for(int i=0; i < trust.length; i++) {
            int[] temp = trust[i];
            trustCount[temp[0]-1]++; // a trusts person b 
            trustedByCount[temp[1]-1]++; // b is trusted by a 
        }

        int judge = -1;

        for(int i = 0; i < n; i++) {
            if(trustedByCount[i] == n-1 && trustCount[i] == 0) { // judges trusts no one and is trusted by everyone (n-1)
                judge = i+1;
                break;
            }
        }

        return judge;
    }
}
