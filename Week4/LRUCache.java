class LRUCache {

    LinkedList<Integer> cacheLL;
    HashMap<Integer, Integer> cache;
    int capacity;
    
    public LRUCache(int capacity) {
        this.cacheLL = new LinkedList<>();
        this.cache = new HashMap<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            int val = cacheLL.get(cacheLL.indexOf(key));
            cacheLL.remove(cacheLL.indexOf(key));
            cacheLL.addLast(val);
            return cache.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if ((cacheLL.size()==capacity)&&(!cache.containsKey(key))) {
            cache.remove(cacheLL.get(0));
            cacheLL.removeFirst();
        }
        if (cache.containsKey(key)) {
            cacheLL.remove(cacheLL.indexOf(key));
        }
        cache.put(key, value);
        cacheLL.addLast(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */