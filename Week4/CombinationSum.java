class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        backtracking(candidates, target, 0, new LinkedList<>());
        return result;
    }
    
    public void backtracking (int[] candidates, int target, int index, LinkedList<Integer> answer){
        if (target == 0) {
            result.add(new ArrayList<>(answer));
            return;
        }else if(index >= candidates.length) {
            return;
        } else if (candidates[index] <= target){
            answer.add(candidates[index]);
            backtracking(candidates, target - candidates[index], index, answer);
            answer.removeLast();
        }
        backtracking(candidates, target, index+1, answer);
    }
}
