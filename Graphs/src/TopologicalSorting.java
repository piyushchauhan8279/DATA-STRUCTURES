import java.util.*;
public class TopologicalSorting {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            src=s;
            dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

    }
    public static void topologicalSortUtil(ArrayList<Edge> graph[],boolean isVisited[],int curr,Stack<Integer> stack){
        isVisited[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!isVisited[e.dest]){
                topologicalSortUtil(graph,isVisited,e.dest,stack);
            }
        }
        stack.push(curr);

    }

    public static void topologicalSort(ArrayList<Edge> graph[]){
        int v=graph.length;
        boolean isVisited[]=new boolean[v];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<v;i++){
            if(isVisited[i]==false){
                topologicalSortUtil(graph,isVisited,i,stack);

            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

    }

    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        topologicalSort(graph);

    }
}
