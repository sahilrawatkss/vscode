#include <stdio.h>

#define INF 999999
#define MAX_VERTICES 100

void floydWarshall(int graph[MAX_VERTICES][MAX_VERTICES], int numVertices) {
    int distanceMatrix[MAX_VERTICES][MAX_VERTICES];

    // Initialize the distance matrix with the given graph
    for (int i = 0; i < numVertices; i++) {
        for (int j = 0; j < numVertices; j++) {
            distanceMatrix[i][j] = graph[i][j];
        }
    }

    // Apply Floyd-Warshall algorithm
    for (int k = 0; k < numVertices; k++) {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (distanceMatrix[i][k] != INF && distanceMatrix[k][j] != INF &&
                    distanceMatrix[i][k] + distanceMatrix[k][j] < distanceMatrix[i][j]) {
                    distanceMatrix[i][j] = distanceMatrix[i][k] + distanceMatrix[k][j];
                }
            }
        }
    }

    // Output the shortest distance matrix
    printf("Shortest Distance Matrix:\n");
    for (int i = 0; i < numVertices; i++) {
        for (int j = 0; j < numVertices; j++) {
            if (distanceMatrix[i][j] == INF) {
                printf("INF ");
            } else {
                printf("%d ", distanceMatrix[i][j]);
            }
        }
        printf("\n");
    }
}

int main() {
    int numVertices;

    // Input
    printf("Enter the number of vertices: ");
    scanf("%d", &numVertices);

    int graph[MAX_VERTICES][MAX_VERTICES];

    printf("Enter the adjacency matrix (use INF for absent edges):\n");
    for (int i = 0; i < numVertices; i++) {
        for (int j = 0; j < numVertices; j++) {
            scanf("%d", &graph[i][j]);
        }
    }

    // Perform Floyd-Warshall algorithm
    floydWarshall(graph, numVertices);

    return 0;
}

