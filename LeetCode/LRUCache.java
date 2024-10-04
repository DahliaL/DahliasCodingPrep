class LRUCache {
    HashMap<Integer, Integer> keyVal;
    Queue<Integer> lastUsed;
    int cap;
    int currLen;

    public LRUCache(int capacity) {
        keyVal = new HashMap<Integer, Integer>();
        lastUsed = new LinkedList<Integer>();
        //lastUsed.add(0);
        cap = capacity;
        currLen = 0; 
        //lastUsed.poll();
    }
    
    public int get(int key) { // add queue functionality
        if(keyVal.containsKey(key)) {
            int valueToRemove = key; // Index of the element to remove (starting from 0)
            lastUsed.remove(key);
            lastUsed.add(key);
            return keyVal.get(key); 
            }
        else
            return -1;
    }
    
    public void put(int key, int value) {
        if (keyVal.containsKey(key)) {
            // Key already exists: update the value and move it to the back of the queue
            keyVal.put(key, value);
            lastUsed.remove(key);  // Remove old position in the queue
            lastUsed.add(key);     // Re-add to mark as most recently used
        } else {
            if (currLen == cap) {
                // Cache is full: remove the least recently used key
                int leastRecentlyUsedKey = lastUsed.poll();
                keyVal.remove(leastRecentlyUsedKey);
            } else {
                currLen++;  // Only increase length if adding a new key
            }
            // Add new key-value pair
            keyVal.put(key, value);
            lastUsed.add(key);  // Mark as most recently used
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
