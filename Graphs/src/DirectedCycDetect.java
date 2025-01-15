import java.util.*;
public class DirectedCycDetect {
    static class Edge{
        int src;
        int dest;

        public Edge(int s ,int d){
            src=s;
            dest=d;

        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));

//        graph[3].add(new Edge(3,0));
    }

    // cycle detection function in directed graph
    // modified dfs

    public static boolean isCycle(ArrayList<Edge> graph[],boolean isVisited[],int curr,boolean recStack[]){
        isVisited[curr]=true;
        recStack[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            if(recStack[e.dest]){
                return true;
            }
            // do nothing
            else if(isVisited[e.dest] && !recStack[e.dest]) continue;

            else {
               if(isCycle(graph,isVisited,e.dest,recStack)) {
                    return true;
                }
            }
        }
        recStack[curr]=false;
        return false;

    }

    public static void main(String[] args) {
        int v=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        boolean isVisited[]=new boolean[v];
        boolean recStack[]=new boolean[v];
        int curr=0;


        System.out.println(isCycle(graph,isVisited,curr,recStack));

    }
}
