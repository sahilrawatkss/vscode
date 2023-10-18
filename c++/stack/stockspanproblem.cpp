#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void stockspan(int arr[])
{
    stack<int> stk;
    for(int i=0;i<7;i++)
    {
        if(!stk.empty() && arr[stk.top()]<arr[i])
        {
            while(!stk.empty() && arr[stk.top()]<arr[i])
            {
                stk.pop();
            }
            
        }
        
        if(stk.empty())
        {
            cout<<1<<" ";
        }
        else
        {
            cout<<i-stk.top()<<" ";
        }
        stk.push(i);
    }
}

int main() {
  int arr[]={100,80,60,70,60,75,85};
  stockspan(arr);
  return 0;
}