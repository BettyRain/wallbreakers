class Solution {
    public int distributeCandies(int[] candies) {
        HashMap<Integer, Integer> quantity = new HashMap<>();
        double result = 0.0;
        for (int candy : candies) {
            if (quantity.containsKey(candy)) { 
                Integer count = quantity.get(candy);
                count++;
                quantity.put(candy, count);
            } else {
                quantity.put(candy, 1);
            }
        }
        
        if (quantity.size() > (candies.length/2)){
            return candies.length/2;
        } else {
            return quantity.size();
        }
    }
}