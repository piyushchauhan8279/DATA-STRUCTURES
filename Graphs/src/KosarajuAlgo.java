import java.util.*;
public class KosarajuAlgo { // for scc
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;

        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));

    }

    // topologicalSort function

    public static void topologicalSort(ArrayList<Edge> graph[],Stack<Integer> stack,boolean isVisited[],int curr){
        isVisited[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!isVisited[e.dest]){
                topologicalSort(graph,stack,isVisited,e.dest);
            }
        }
        stack.push(curr);
    }

    // normal dfs function:-

    public static void dfs(ArrayList<Edge> transpose[],int node,boolean isVisited[]){
        isVisited[node]=true; // node =curr
        System.out.print(node+" ");
        for(int i=0;i<transpose[node].size();i++){
            Edge e=transpose[node].get(i);
            if(!isVisited[e.dest]){
                dfs(transpose,e.dest,isVisited);
            }
        }


    }


    public static void printScc(ArrayList<Edge> graph[],int v){

        // step 1 :- topological sort

        Stack<Integer> stack=new Stack<>();
        boolean isVisited[]=new boolean[v];
        int src=0;
        topologicalSort(graph,stack,isVisited,src);

        // step 2:- transpose of the graph

        @SuppressWarnings("unchecked")
        ArrayList<Edge> transpose[]=new ArrayList[v];
        for(int i=0;i<v;i++){
            transpose[i]=new ArrayList<Edge>();
        }

        for(int i=0;i<v;i++){
            isVisited[i]=false; // here we did isVisited to false , so that we can use it in the 3rd step
            // while performing the dfs , we can create another visited array also , but
            // to reduce space we change it here
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest,e.src));
            }
        }

        // step 3:- applying dfs on the transpose graph , according to stack nodes

        while(!stack.isEmpty()){
            int node =stack.pop();
            if(!isVisited[node]){
                dfs(transpose,node,isVisited);
                System.out.println();
            }

        }


    }

    public static void main(String[] args) {
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        printScc(graph,v);
    }
}
