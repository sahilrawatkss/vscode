#include<stdio.h>

#define MAX_VERTICES 100
#define INF 9999

void floydWarshall(int graph[MAX_VERTICES][MAX_VERTICES],int vno)
{
	for(int i=0;i<vno;i++)
	{
		for(int j=0;j<vno;j++)
		{
			for(int k=0;k<vno;k++)
			{
				if(graph[j][i]!=INF && graph[i][k]!=INF && (graph[j][i] + graph[i][k])<graph[j][k])
				{
					graph[j][k]=graph[j][i] + graph[i][k];
				}
			}
		}
	}
	
	for(int i=0;i<vno;i++)
	{
		for(int j=0;j<vno;j++)
		{
			if(graph[i][j]==9999)
			{
				printf("INF ");
			}
			else
			{
				printf("%d ",graph[i][j]);
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
