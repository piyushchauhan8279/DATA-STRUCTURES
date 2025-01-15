import java.util.ArrayList;

public class BellmanFord {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;

        }

    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));

    }

    public static void shortestPath(ArrayList<Edge> graph[],int src,int vertex){
        int dist[]=new int[vertex];

        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        for(int k=1;k<=vertex-1;k++){ // O(V)

            for(int i=0;i<graph.length;i++){
                for(int j=0;j< graph[i].size();j++){
                    Edge e=graph[i].get(j);
                    int u=e.src;
                    int v=e.dest;
                    int w=e.wt;

                    if(dist[u]+w<dist[v] && dist[u]!=Integer.MAX_VALUE){
                        dist[v]=dist[u]+w;
                    }

                }
            }
        }

        for(int i=0;i<graph.length;i++){
            for(int j=0;j< graph[i].size();j++){
                Edge e=graph[i].get(j);
                int u=e.src;
                int v=e.dest;
                int w=e.wt;

                if(dist[u]+w<dist[v] && dist[u]!=Integer.MAX_VALUE){
                    System.out.println("Negative Weight Cycle");
                }

            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }

    }

    public static void main(String[] args) {
        int vertex=5;

        ArrayList<Edge> graph[]=new ArrayList[vertex];
        createGraph(graph);
        int src=0;
        shortestPath(graph,src,vertex);

    }
}
