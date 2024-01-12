#include <iostream>
#include <vector>
#include <queue>

using namespace std;

const int MAX_VERTICES = 100;

int graph[MAX_VERTICES][MAX_VERTICES];
int color[MAX_VERTICES];

bool isBipartite(int numVertices) {
    for (int i = 0; i < numVertices; i++) {
        color[i] = -1; // Initialize colors as -1 (unassigned)
    }

    for (int start = 0; start < numVertices; start++) {
        if (color[start] == -1) {
            queue<int> q;
            q.push(start);
            color[start] = 0; // Assign the first color

            while (!q.empty()) {
                int current = q.front();
                q.pop();

                for (int neighbor = 0; neighbor < numVertices; neighbor++) {
                    if (graph[current][neighbor] == 1 && color[neighbor] == -1) {
                        color[neighbor] = 1 - color[current]; // Assign a different color
                        q.push(neighbor);
                    } else if (graph[current][neighbor] == 1 && color[neighbor] == color[current]) {
                        return false; // Graph is not bipartite
                    }
                }
            }
        }
    }

    return true; // Graph is bipartite
}

int main() {
    int numVertices;

    // Input
    cout << "Enter the number of vertices: ";
    cin >> numVertices;

    cout << "Enter the adjacency matrix:\n";
    for (int i = 0; i < numVertices; i++) {
        for (int j = 0; j < numVertices; j++) {
            cin >> graph[i][j];
        }
    }

    // Output
    if (isBipartite(numVertices)) {
        cout << "Yes Bipartite\n";
    } else {
        cout << "Not Bipartite\n";
    }

    return 0;
}

