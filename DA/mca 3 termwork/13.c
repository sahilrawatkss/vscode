#include<stdio.h>

#define VERTICES 100

int graph[VERTICES][VERTICES];
int visited[VERTICES];

int DFS(int current, int target, int vno) {
    visited[current] = 1;

    if (current == target) {
        return 1; // Path exists
    }

    for (int i = 0; i < vno; i++) {
        if (graph[current][i] == 1 && !visited[i]) {
            if (DFS(i, target, vno)) {
                return 1; // Path exists
            }
        }
    }

    return 0; // No path found
}

int isPathExists(int start, int end, int vno) {
    for (int i = 0; i < vno; i++) {
        visited[i] = 0; // Initialize visited array
    }
    return DFS(start - 1, end - 1, vno);
}

int main() {
    int vno, start, end;

    // Input
    printf("Enter the number of vertices: ");
    scanf("%d", &vno);

    printf("Enter the adjacency matrix:\n");
    for (int i = 0; i < vno; i++) {
        for (int j = 0; j < vno; j++) {
            scanf("%1d", &graph[i][j]);
        }
    }

    printf("Enter the starting and ending vertices: ");
    scanf("%d %d", &start, &end);

    // Output
    if (isPathExists(start, end, vno)) {
        printf("Yes, Path Exists\n");
    } else {
        printf("No, Path Does Not Exist\n");
    }

    return 0;
}


