import java.util.*;
public class Articulation {
    static class Edge{
        int src;
        int dest;

        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0;i<graph.length;i++){
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

        graph[4].add(new Edge(4,3));

    }

    public static void dfs(ArrayList<Edge> graph[],int dt[],int low[],boolean isVisited[],boolean ap[],int time,int curr,int par){
        isVisited[curr]=true;
        dt[curr]=low[curr]=++time;
        int children=0;

        // neighbours
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            int neigh=e.dest;
            if(neigh==par) continue;
            else if(isVisited[neigh]){
                // back edge
                low[curr]=Math.min(low[curr],dt[neigh]);
            }
            else{
                dfs(graph,dt,low,isVisited,ap,time,e.dest,curr);
                low[curr]=Math.min(low[curr],low[neigh]);
                if(par!=-1 && dt[curr]<=low[neigh]){
                    ap[curr]=true;
                }
                children++;
            }
        }
        if(par==-1 && children>1){
            ap[curr]=true;
        }
    }
    public static void printAP(ArrayList<Edge> graph[],int v){
        int time=0;
        int par=-1;
        int dt[]=new int[v];
        int low[]=new int[v];
        boolean isVisited[]=new boolean[v];
        boolean ap[]=new boolean[v];

        for (int i=0;i<v;i++){
            if(!isVisited[i]){
                dfs(graph,dt,low,isVisited,ap,time,i,par);
            }
        }

        // print the articulation points
        System.out.println("Articulation Points: ");
        for(int i=0;i<ap.length;i++){
            if(ap[i]){
                System.out.print(i+" ");
            }
        }
    }



    public static void main(String[] args) {
            int v=5;
            @SuppressWarnings("unchecked")
            ArrayList<Edge> graph[]=new ArrayList[v];

            createGraph(graph);
            printAP(graph,v);




    }
}
