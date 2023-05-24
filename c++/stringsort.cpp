#include<iostream>
#include<algorithm>
#include<queue>
using namespace std;
int main()
{
    string s="raaeaedere";
    sort(s.begin(),s.end());
    int count=1;
    int n=s.size();
    priority_queue<pair<int,char>> pq;
    for(int i=0;i<n-1;i++)
    {
        if(s[i]==s[i+1])
        {
            count++;
        }
        else
        {
            pq.push({count,s[i]});
            count=1;
        }
    }
    if(s[n-1]==s[n-2])
        pq.push({count,s[n-1]});

    else
    pq.push({1,s[n-1]});

    int i=0;
    while(!pq.empty())
    {
        int a=pq.top().first;
        while(a>0)
        {
            s[i]=pq.top().second;
            i++;
            a--;
        }
        pq.pop();
    }
    cout<<s;
}