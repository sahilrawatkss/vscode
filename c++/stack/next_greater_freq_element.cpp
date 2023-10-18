#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// void findElement(int arr[],int len)
// {
    

// }

int main()
{
    int arr[] = { 1, 1, 2, 3, 4, 2, 1 }; 
    int len = 7;
    // findElement(arr,len);
    
    unordered_map<int,int> mp;
    for(auto x:arr)
    {
        mp[x]++;
    }

    stack<pair<int,int>> stk;
    vector<int> v;
    for(auto x:arr)
    {
        v.push_back(mp[x]);
    }
    vector<int> ans(len,0);
    // for(int i=0;i<len;i++)
    // {
    //     cout<<arr[i]<<" ";
    // }

    for(int i=len-1;i>=0;i--)
    {
        while(!stk.empty()&&stk.top().first<=v[i])
        {
            stk.pop();
        }
        if(stk.empty())
        {
            ans[i]=-1;
        }
        else
        {
            ans[i]=stk.top().second;
        }
        stk.push({v[i],arr[i]});
        // stk.push({v[i],arr[i]});
        cout<<stk.top().first<<" "<<stk.top().second<<"\n";
    }

    for(int i=0;i<len;i++)
    {
        cout<<ans[i]<<" ";
    }
}
