package graph;

import java.util.*;

public class Graph
{
    private int V;
    private ArrayList<ArrayList<Integer>> adj;

    public Graph(int V)
    {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
        {
            adj.add(new ArrayList<>());
        }

        public void addEdge(int u, int v)
        {
            adj.get(u).add(v);
            adj.get(v).add(u); // note: remove if graph is directed
        }

        public ArrayList<Integer> getNeighbors(int node)
        {
            return adj.get(node);
        }

        public int size()
        {
            return V;
        }
    }
}