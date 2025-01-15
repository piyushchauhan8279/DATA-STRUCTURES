import java.util.ArrayList;
public class ConCompntCycDect {
    static class Edge{
        int s;
        int d;

        public Edge(int s,int d){
            this.s=s;
            this.d=d;

        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));



        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,4));

//        graph[4].add(new Edge(4,2));




    }

    public static boolean isCycle(ArrayList<Edge> graph[],boolean isVisited[],int curr,boolean recStack[]){
        isVisited[curr]=true;
        recStack[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(recStack[e.d]){
                return true;
            }
            else if(isVisited[e.d] && !recStack[e.d]) continue;
            else {

                if(isCycle(graph,isVisited,e.d,recStack)){
                    return true;
                }
            }
        }
        recStack[curr]=false;
        return false;

    }

    public static void main(String[] args) {
        int v=8;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        boolean isVisited[]=new boolean[v];
        boolean recStack[]=new boolean[v];


        for(int i=0;i<v;i++){
            if(isVisited[i]==false){

                if(isCycle(graph,isVisited,i,recStack)){
                    System.out.println(true);
                    break;
                }


            }
        }


    }
}
