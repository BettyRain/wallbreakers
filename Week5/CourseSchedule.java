class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
	    List<List<Integer>> graph = new ArrayList<>();
	    for (int i=0; i<numCourses; i++) {
		    graph.add(new ArrayList<>());
	    }
        for (int i=0; i<prerequisites.length; i++){
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
	    int[] visited = new int[numCourses];
	    for (int i=0; i<numCourses; i++) {
	        if (DFS(i, graph, visited)==false) {
                return false; 
            }
        }
        return true;
    }


    boolean DFS(int k, List<List<Integer>> graph, int[] visited) {
        switch (visited[k]) {
            case 1:
                return false;
            case 2:
                return true;
            default:
                visited[k] = 1;
        }
	    for (int i: graph.get(k)) {
		    if (!DFS(i, graph, visited)) {
			    return false;
		    }
	    }
	    visited[k] = 2;
        return true;
    }
}