#include <iostream>
#include <bits/stdc++.h>
using namespace std;
  
int main()
{
    int n=20;
    vector<int> arr;
    for(int i=0;i<20;i++)
    {
        arr.push_back(2);
    }

    int x=6;
    unordered_map<int,int> mp;
    for(int i=0;i<n;i++)
    {
        mp[arr[i]]++;
    }
    long long total=0;
    for(int i=1;i<=n;i++)
    {
        if((i)%x==0)
        {
            total+=mp[arr[i-1]];
            total--;
            mp[arr[i-1]]--;
        }
    }

    for(int i=2;i<=n;i++)
    {
        int j=x;
        while(i%x!=0&&j<=i*n)
        {
            int k=j/i;
            if(k%x!=0&&j%i==0&&i<k&&arr[i-1]==arr[k-1])
            {
                total++;
            }
            j+=x;
        }
    }
    cout<<total<<"\n";
    return 0;
}