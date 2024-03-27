import java.util.ArrayList;

class AllPathFromSRCToTAR
{
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    //create graph
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));

    }

    //find all possible paths using modified dfs
    public static void allPaths(ArrayList<Edge> graph[],int curr,boolean vis[],String path,int tar){
        if(curr == tar){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
           Edge e = graph[curr].get(i);
           if(!vis[e.dest]) {
               vis[curr] = true;
               allPaths(graph, e.dest, vis, path + e.dest, tar);
               vis[curr] = false;
           }
        }
    }

    //all paths from target
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int tar=5;
        allPaths(graph,2,new boolean[V],"2",tar);
    }
}

//Output:201345
//20135
//2435
//245