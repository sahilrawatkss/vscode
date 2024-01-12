#include <stdio.h>
#include <stdbool.h>

#define MAX_VERTICES 100

int graph[MAX_VERTICES][MAX_VERTICES];
int visited[MAX_VERTICES];
int stack[MAX_VERTICES];
int stackPointer = -1;

bool DFS(int current, int numVertices) {
    visited[current] = 1;
    stack[++stackPointer] = current;

    for (int neighbor = 0; neighbor < numVertices; neighbor++) {
        if (graph[current][neighbor] == 1) {
            // Check for a back edge
            if (visited[neighbor] == 1) {
                // Cycle detected
                printf("Cycle Exists\nCycle Path: ");
                while (stack[stackPointer] != neighbor) {
                    printf("%d -> ", stack[stackPointer--] + 1);
                }
                printf("%d\n", stack[stackPointer--] + 1);
                return true;
            }
            // Explore the neighbor if not visited
            else if (visited[neighbor] == 0 && DFS(neighbor, numVertices)) {
                return true;
            }
        }
    }

    // Backtrack
    visited[current] = 2;
    stackPointer--;
    return false;
}

bool isCycleExists(int numVertices) {
    for (int i = 0; i < numVertices; i++) {
        visited[i] = 0;
    }

    for (int i = 0; i < numVertices; i++) {
        if (visited[i] == 0 && DFS(i, numVertices)) {
            return true;
        }
    }

    return false;
}

int main() {
    int numVertices;

    // Input
    printf("Enter the number of vertices: ");
    scanf("%d", &numVertices);

    printf("Enter the adjacency matrix:\n");
    for (int i = 0; i < numVertices; i++) {
        for (int j = 0; j < numVertices; j++) {
            scanf("%d", &graph[i][j]);
        }
    }

    // Output
    if (isCycleExists(numVertices)) {
        printf("Yes Cycle Exists\n");
    } else {
        printf("No Cycle Exists\n");
    }

    return 0;
}

