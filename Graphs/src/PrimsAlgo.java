import java.util.*;

public class PrimsAlgo {
    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;

        }

    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));

    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;


        public Pair(int n,int c){
            this.node=n;
            this.cost=c;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost- p2.cost;

        }

    }

    public static int mstCost(ArrayList<Edge> graph[],int src){

        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean isVisited[]=new boolean[graph.length];

        int minimumCost=0;

        pq.add(new Pair(src,0));

        while(!pq.isEmpty()){
           Pair curr= pq.remove();

           if(isVisited[curr.node]==false){
               isVisited[curr.node]=true;
               minimumCost+=curr.cost;

               for(int i=0;i<graph[curr.node].size();i++){
                   Edge e=graph[curr.node].get(i);
                   if(isVisited[e.dest]==false){
                       pq.add(new Pair(e.dest,e.wt));
                   }

               }

           }
        }


        return minimumCost;

    }


    public static void main(String[] args) {
        int v=4;
        @SuppressWarnings("unchecked")
       ArrayList<Edge> graph[]=new ArrayList[v]; // undirected , connected , weighted

        createGraph(graph);
        int src=0;


        System.out.println("Minimum cost is "+mstCost(graph,src));

    }
}
