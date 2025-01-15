import java.util.*;
public class DisconnectedComponents {
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

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,4));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));





        graph[5].add(new Edge(5,7));

        graph[7].add(new Edge(7,5));
        graph[7].add(new Edge(7,8));

        graph[8].add(new Edge(8,7));
        graph[8].add(new Edge(8,6));


        graph[6].add(new Edge(6,8));
        graph[6].add(new Edge(6,9));

        graph[9].add(new Edge(9,6));

    }

    public static void bfs(ArrayList<Edge> graph[],boolean isVisited[],int starting_point){

        Queue<Integer> q=new LinkedList<>();
        q.add(starting_point);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(isVisited[curr]==false){
                System.out.print(curr+" ");
                isVisited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge> graph[],boolean Visited[],int curr){
        System.out.print(curr+" ");
        Visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(Visited[e.dest]==false){
                dfs(graph,Visited,e.dest);
            }

        }
    }


    public static void main(String[] args) {
        int v=10;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        boolean isVisited[]=new boolean[v];
        boolean Visited[]=new boolean[v];

        for(int i=0;i<isVisited.length;i++){
            if(isVisited[i]==false){
                bfs(graph,isVisited,i);
            }
        }
        System.out.println();
        System.out.println();

        for(int i=0;i<v;i++){
            if(Visited[i]==false){
                dfs(graph,Visited,i);
            }
        }

    }
}
