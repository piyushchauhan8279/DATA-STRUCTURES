import java.util.*;
public class TarjanAlgo {
    static class Edge{
        int src;
        int dest;

        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;

        }
    }

    public static void createGraph(ArrayList<Edge> graph[],int v){
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));


        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));

    }

    public static void dfs(ArrayList<Edge> graph[],int dt[],int low[],boolean isVisited[],int time,int par,int curr){

        isVisited[curr]=true;
        dt[curr]=low[curr]=++time;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(e.dest==par){
                continue;
            }
            else if(isVisited[e.dest]==false){
                dfs(graph,dt,low,isVisited,time,curr,e.dest);
                low[curr]=Math.min(low[curr],low[e.dest]);
                if(dt[curr]<low[e.dest]){
                    System.out.println(curr+"---"+e.dest);
                }
            }
            else{
                low[curr]=Math.min(low[curr],dt[e.dest]);
            }
        }
    }

    public static void findBridge(ArrayList<Edge> graph[],int v){

        int dt[]=new int[v];
        int low[]=new int[v];
        boolean isVisited[]=new boolean[v];
        int time=0;
        int par=-1;

        // for all the disconnected components

        for(int i=0;i<v;i++){
            if(isVisited[i]==false){
                dfs(graph,dt,low,isVisited,time,par,i);
            }
        }
    }

    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[v];

        createGraph(graph,v);
        findBridge(graph,v);

    }
}
