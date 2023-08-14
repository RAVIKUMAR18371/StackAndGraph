package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

// Time Complexity: E logE

public class Prims_algo {
    static class Edge {
        int src;
        int des;
        int cost;

        Edge(int src, int des, int cost) {
            this.src = src;
            this.des = des;
            this.cost = cost;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

    }

    public static class pair implements Comparable<pair> {
        int node;
        int cost;

        public pair(int n, int cost) {
            this.node = n;
            this.cost = cost;
        }
         public int compareTo(pair p2){ // method in the interface
              return this.cost - p2.cost;  //Ascending
         }
          }

        public static void prims(ArrayList<Edge> graph[], int V) {
            PriorityQueue<pair> pq = new PriorityQueue<>(); // (node - int , cost - int)
            boolean vis[] = new boolean[V];
            pq.add(new pair(0, 0));
            int MSTCost = 0;

            while (!(pq.isEmpty())) {
                pair curr = pq.remove();
                if (!vis[curr.node]) {
                    vis[curr.node] = true;
                    MSTCost += curr.cost;

                    for (int i = 0; i < graph[curr.node].size(); i++) {
                        Edge e = graph[curr.node].get(i);
                        if (!vis[e.des]) {
                            pq.add(new pair(e.des, e.cost));
                        }
                    }
                }
            }
            System.out.println("Min cost of MST " + MSTCost);
        }


        public static void main(String[] args) {
            int V = 4;

            ArrayList<Edge> graph[] = new ArrayList[V];
            createGraph(graph);
            prims(graph, V);

        }

    }

