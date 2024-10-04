class Solution {
    public boolean dfs(int current, int destination, List<List<Integer>> adjList, boolean[] visited) {
        if(current == destination)
            return true;
        else if(visited[current])
            return false;

        visited[current] = true; 

        for(int neighbor : adjList.get(current)) {
            if(dfs(neighbor, destination, adjList, visited))
                return true;
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n == 1) {
            if(source == destination) 
                return true;
            else // no vertex will point to itself....
                return false;
        }

        List<List<Integer>> adjList = new ArrayList<>();

        // Initialize empty lists for each vertex
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Populate the adjacency list
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> bfs = new LinkedList<Integer>();
        boolean[] visited = new boolean[n];

        bfs.add(source);

        while(!bfs.isEmpty()) {
            int current = bfs.poll();

            if(current == destination)
                return true;
            
            for( int neighbor : adjList.get(current)) {
                if(neighbor == destination)
                    return true;

                if(!visited[neighbor]) {
                    bfs.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }

        return false;
    }
}

// dfs way

class Solution {
    public boolean dfs(int current, int destination, List<List<Integer>> adjList, boolean[] visited) {
        if(current == destination)
            return true;
        else if(visited[current])
            return false;

        visited[current] = true; 

        for(int neighbor : adjList.get(current)) {
            if(dfs(neighbor, destination, adjList, visited))
                return true;
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n == 1) {
            if(source == destination) 
                return true;
            else // no vertex will point to itself....
                return false;
        }

        List<List<Integer>> adjList = new ArrayList<>();

        // Initialize empty lists for each vertex
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Populate the adjacency list
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];

        return dfs(source, destination, adjList, visited);
    }
}
