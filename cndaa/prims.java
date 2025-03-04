package cndaa;

import java.util.Scanner;

public class prims {
    private static void primMST(int[][] graph) {
        int vertices = graph.length;
        int[] key = new int[vertices];
        int[] parent = new int[vertices];
        boolean[] mstSet = new boolean[vertices];

        // Initialize key values and parent array
        for (int i = 0; i < vertices; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
            parent[i] = -1;
        }
        key[0] = 0;  // Start from vertex 0

        // Main loop to find MST
        for (int i = 0; i < vertices - 1; i++) {
            int u = -1;

            // Select the minimum key vertex which is not in MST
            for (int j = 0; j < vertices; j++) {
                if (!mstSet[j] && (u == -1 || key[j] < key[u])) {
                    u = j;
                }
            }

            // Mark the selected vertex as included in MST
            mstSet[u] = true;

            // Update key and parent values of adjacent vertices
            for (int v = 0; v < vertices; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    key[v] = graph[u][v];
                    parent[v] = u;
                }
            }
        }

        // Print the MST
        System.out.println("Edge \t Weight");
        for (int i = 1; i < vertices; i++) {  // Start from 1 to avoid printing the root vertex (0)
            System.out.println(parent[i] + " - " + i + "\t " + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        int vertices = sc.nextInt();
        int[][] graph = new int[vertices][vertices];

        System.out.println("Enter Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        primMST(graph);
    }
}
