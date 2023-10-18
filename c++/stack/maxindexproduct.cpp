#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int arr[] = { 5, 4, 3, 4, 5 };
    int len=5;

    vector<int> leftGreat(len,0);
    vector<int> rightGreat(len,0);

    stack<pair<int,int>> stk;
    for(int i=0;i<len;i++)
    {
        while(!stk.empty()&&stk.top().first<=arr[i])
        {
            stk.pop();
        }
        if(stk.empty())
        {
            leftGreat[i]=0;
        }
        else
        {
            leftGreat[i]=stk.top().second;
        }

        stk.push({arr[i],i+1});
    }

    stk=stack<pair<int,int>>() ;
    for(int i=len-1;i>=0;i--)
    {
        while(!stk.empty()&&stk.top().first<=arr[i])
        {
            stk.pop();
        }
        if(stk.empty())
        {
            rightGreat[i]=0;
        }
        else
        {
            rightGreat[i]=stk.top().second;
        }

        stk.push({arr[i],i+1});
    }

    int res=0;
    for(int i=0;i<len;i++)
    {
        res=max(res,leftGreat[i]*rightGreat[i]);
    }

    cout<<res;
}