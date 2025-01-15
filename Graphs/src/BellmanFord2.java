import java.util.*;
public class BellmanFord2 {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s ,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static void createEdgeVisit(ArrayList<Edge> ae){
        ae.add(new Edge(0,1,2));
        ae.add(new Edge(0,2,4));

        ae.add(new Edge(1,2,-4));

        ae.add(new Edge(2,3,2));

        ae.add(new Edge(3,4,4));

        ae.add(new Edge(4,1,-1));
    }

    public static void shortestPath(ArrayList<Edge> ae,int src,int vtx){

        int dist[]=new int[vtx];

        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

    for(int k=0;k<vtx-1;k++){

        for(int i=0;i<ae.size();i++){
            Edge e=ae.get(i);
            int u=e.src;
            int v=e.dest;
            int w=e.wt;
            if(dist[u]+w<dist[v] && dist[u]!=Integer.MAX_VALUE){
                dist[v]=dist[u]+w;
            }
        }


    }
        for(int i=0;i<ae.size();i++){
            Edge e=ae.get(i);
            int u=e.src;
            int v=e.dest;
            int w=e.wt;
            if(dist[u]+w<dist[v] && dist[u]!=Integer.MAX_VALUE){
                System.out.println("Negative Weight Cycle Exit");

            }


        }

        System.out.println("Shortest Path from source node to all the nodes are:-");

        for(int j=0;j<dist.length;j++){
            System.out.print(dist[j]+" ");
        }

    }

    public static void main(String[] args) {
        ArrayList<Edge> ae=new ArrayList<>();
        int vtx=5;
        int src=0;

        createEdgeVisit(ae);
        shortestPath(ae,src,vtx);

    }

}
