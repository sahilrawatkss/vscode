#include<iostream>
#include<vector>
#include<queue>

using namespace std;

const int MAXVERTICES = 100;

int graph[MAXVERTICES][MAXVERTICES];
int color[MAXVERTICES];

bool isBipartite(int vno)
{
	for(int i=0;i<vno;i++)
	{
		color[i]=-1;
	}
	
	for(int i=0;i<vno;i++)
	{
		if(color[i]==-1)
		{
			queue<int> q;
			q.push(i);
			color[i]=0;
			
			while(!q.empty())
			{
				int curr=q.front();
				q.pop();
				for(int neighbour=0;neighbour<vno;neighbour++)
				{
					if(graph[curr][neighbour]==1 && color[neighbour]==-1)
					{
						color[neighbour]=1-color[curr];
						q.push(neighbour);
					}
					else if(graph[curr][neighbour]==1 && color[neighbour]==color[curr])
					{
						return false; //not bipartite
					}
				}
			}
		}
	}
	return true;
}

int main()
{
	int vno;

    // Input
    cout << "Enter the number of vertices: ";
    cin >> vno;

    cout << "Enter the adjacency matrix:\n";
    for (int i = 0; i < vno; i++) {
        for (int j = 0; j < vno; j++) {
            cin >> graph[i][j];
        }
    }

    // Output
    if (isBipartite(vno)) {
        cout << "Yes Bipartite\n";
    } else {
        cout << "Not Bipartite\n";
    }

    return 0;
}
