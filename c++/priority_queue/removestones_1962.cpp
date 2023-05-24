#include<iostream>
#include<vector>
using namespace std;
int main()
{
    vector<int> piles{5,4,9};
    int k=2;
    vector<int> v(1e4+1,0);
    int m=0;
    for(auto x:piles)
    {
        v[x]++;
        m=max(m,x);
    }
    int total=0;
    int n=0;
    for(int i=m;i>=0&&k>0;i--)
    {
        while(v[i]>0&&k>0)
        {
            v[i]--;
            v[i-i/2]++;
            k--;
        }
    }
    for(int i=0;i<=m;i++)
    {
        if(v[i]>0)
        total=total+v[i]*i;
    }
    cout<<"total: "<<total;
}