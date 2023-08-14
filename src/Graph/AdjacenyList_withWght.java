package Graph;
import java.util.ArrayList;
public class AdjacenyList_withWght {
    static class Edge {
        int src;
        int des;
        int wght;

        Edge(int src, int des, int wght) {
            this.src = src;
            this.des = des;
            this.wght = wght;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,3,-1));
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));


    }

    public static void main(String[] args) {
        int V = 4; // vertex = 4
        ArrayList<Edge> graph[] = new ArrayList[4];
        // do not put the ANGULAR BRACKET after creating the ArrayList
        createGraph(graph);

        //print the 2's neighbour
        for(int i = 0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i); // yaha hamlog
            // Edge e --> iska matlab ki ek 'e' variable "Edge" type
            // kaa bana rhe hai jo ki store karega jo bhi (src,des) hai yaha --> graph[2].get(i)
            System.out.println("Destination "+e.des + " ");
            System.out.println("Weight "+e.wght+" ");
        }

    }
}
