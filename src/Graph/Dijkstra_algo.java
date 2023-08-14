package Graph;

// Time complexity: O(E + E logV)

import java.util.*;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class Dijkstra_algo {
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
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

    }
    public static class pair implements Comparable<pair> {
        //due to "comparparable" interface now the "pair class compare on the basis of
        // "dis"
        int node;
        int dis;

        public pair(int n, int d){
            this.node = n;
            this.dis = d;
        }
        public int compareTo(pair p2){ // method in the interface
            return this.dis - p2.dis;  //Ascending
            // return p2.dis - this.dis; --> for descending
        }
    }
    public static void dijks(ArrayList<Edge> graph[] , int src , int V){
        Queue<pair> pq = new LinkedList<>();
        int dis[] = new int[V];
        for(int i = 0; i<V;i++){
            if(i != src){
                dis[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];

        pq.add(new pair(0,0));

        while(!(pq.isEmpty())){
            pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;

                for(int i = 0; i < graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.des;

                    if(dis[u] + e.wght < dis[v]){ // relaxation
                        dis[v] = dis[u] + e.wght;
                        pq.add(new pair(v , dis[v]));
                    }
                }
            }
        }
        for(int i = 0;i<V;i++){
            System.out.print(dis[i] + " ");
        }
        System.out.println();


    }



    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        dijks(graph , 0 ,V);
    }

}
