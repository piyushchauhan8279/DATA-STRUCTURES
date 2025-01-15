import java.util.*;
public class Traversal {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d){
            src=s;
            dest=d;

        }

    }

    public static void createGraph(ArrayList<Edge> graph[]){

        // initially graph array contains null at all indexes , so we create empty arraylists
        // otherwise we get null pointers exception

        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[2].add(new Edge(2,5));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));


    }

    public static void bfs(ArrayList<Edge> graph[]){

        Queue<Integer> q=new LinkedList<>();
        boolean isVisited[]=new boolean[graph.length];
        Edge e=graph[0].get(0);
        q.add(e.src);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(isVisited[curr]==false){
                System.out.print(curr+" ");
                isVisited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge ee=graph[curr].get(i);
                    q.add(ee.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[],boolean isVisited[],int curr){
        System.out.print(curr+" ");
        isVisited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(isVisited[e.dest]!=true){

                dfs(graph,isVisited,e.dest);

            }
        }

    }


    public static void main(String[] args) {
        int v = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        bfs(graph);
        System.out.println();

        boolean isVisited[]=new boolean[v];
        Edge e=graph[0].get(0);

        dfs(graph, isVisited, e.src);

    }
}
