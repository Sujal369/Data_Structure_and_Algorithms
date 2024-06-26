import java.util.ArrayList;

class CycleDetection
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
        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
    }

    public static boolean isCycle(ArrayList<Edge> graph[],boolean vis[],int curr,boolean recStack[]){
        vis[curr] = true;
        recStack[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(recStack[e.dest] == true){
                return true;
            } else if (!vis[e.dest]) {
                if(isCycle(graph, vis, e.dest, recStack)) return true;
            }
        }
        recStack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        for (int i=0;i<graph[2].size();i++){
            Edge e =graph[2].get(i);
            System.out.println(e.src+" and "+e.dest+" ");
        }
        //This is for Multiple vertex graph or break graph
        boolean vis[] = new boolean[V];
        boolean recStack[] = new boolean[V];
        for (int i=0;i<V;i++){
            if(!vis[i]){
                System.out.println(isCycle(graph,vis,0,recStack));
            }
        }
        //This is for simple graph
        System.out.println(isCycle(graph,new boolean[V],0,new boolean[V]));
    }
}