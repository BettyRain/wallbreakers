class MyHashSet {

    int n = 1000000;
    public int [] arr;
    
    /** Initialize your data structure here. */
    public MyHashSet() {
        arr = new int[n];
        Arrays.fill(arr, -1);
    }
    
    public void add(int key) {
        arr[key]=key;
    }
    
    public void remove(int key) {
        arr[key]=-1;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if (arr[key]==-1){
            return false;
        } else {
            return true;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */