#include<stdio.h>
#include <stdbool.h>

#define V 100

int graph[V][V];
int visited[V];
int stack[V];

int top=-1;

bool DFS(int curr,int vno)
{
	visited[curr]=1;
	stack[++top]=curr;
	
	for(int neighbour=0;neighbour<vno;neighbour++)
	{
		if(graph[curr][neighbour]==1)
		{
			if(visited[neighbour]==1)
			{
				return true;
			}
			else if(visited[neighbour]==0 && DFS(neighbour,vno))
			{
				return true;
			}
		}
	}
	
	visited[curr]=2;
	top--;
	return false;
}

bool isCycleExists(int vno)
{
	for(int i=0;i<vno;i++)
	{
		visited[i]=0;
	}
	
	for(int i=0;i<vno;i++)
	{
		if(DFS(i,vno))
		{
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

