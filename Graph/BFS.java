import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BFS
{
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }

    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
    //bfs Breadth First Search
    public static void bfs(ArrayList<Edge> graph[],int V){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.println(curr + " ");
                vis[curr] = true;
                for(int i=0;i< graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph,V);
        System.out.println();

    }
}