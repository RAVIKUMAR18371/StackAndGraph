package Graph;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BFS {
    static class Edge {
        int src;
        int des;

        Edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,5));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));
        graph[4].add(new Edge(4,3));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }

    public static void bfs(ArrayList<Edge> graph[] , int V) {
        Queue<Integer> queue = new LinkedList<>();

        boolean vis[] = new boolean[V];
        // it means that we are making the "vis" array of size V, which contains
        // all the boolean value.
        queue.add(0);


        while(!(queue.isEmpty())){
            int curr = queue.remove();

            if(vis[curr] == false){
                System.out.print(curr + " ");
                vis[curr] = true;

               for(int i = 0; i < graph[curr].size(); i++){
                   Edge e = graph[curr].get(i);
                   queue.add(e.des);

                }
            }
        }

    }


    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[] ) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (vis[e.des] == false) {// if e.des not visited then only we call the dfs function.
                dfs(graph, e.des, vis); // here e.des--> becomes the "curr" for next recursive call.
            }
        }
    }

    public static void main(String[] args) {
        int V = 7; // vertex = 7
        ArrayList<Edge> graph[] = new ArrayList[V];
        // do not put the ANGULAR BRACKET after creating the ArrayList

        createGraph(graph);
        bfs(graph , V);

        System.out.println();// for separating BFS and DFS
        boolean vis[] = new boolean[V];
        dfs(graph , 0 , vis);
        System.out.println();

        /*
            Graph in the copy for BFS
         */

        /*
        //print the 2's neighbour
        for(int i = 0; i < graph[2].size(); i++){
           Edge e = graph[2].get(i); // yaha hamlog
            // Edge e --> iska matlab ki ek 'e' variable "Edge" type
            // kaa bana rhe hai jo ki store karega jo bhi (src,des) hai yaha --> graph[2].get(i)
            System.out.print(e.des + " ");
        }

         */

    }
}
