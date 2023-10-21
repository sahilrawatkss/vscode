#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int arr[]={6,10,4,3,12,45,1,77};
    stack<int> stk;
    int min=0;
    for(int i=0;i<8;i++)
    {
        if(stk.empty())
        {
            stk.push(arr[i]);
            min=arr[i];
        }
        else if(arr[i]>=min)
        {
            stk.push(arr[i]);
        }
        else
        {
            stk.push(2*arr[i]-min);
            min=arr[i];
        }
    }

    while(!stk.empty())
    {
        int ch;
        cout<<"Enter Choice:\n\t1.Push\n\t2.Pop\n\t3.Top\n";
        cin>>ch;
        if(ch==1)
        {
            int val;
            cout<<"\nEnter Number:";
            cin>>val;
            if(stk.empty())
            {
                stk.push(val);
                min=val;
            }
            else if(val>=min)
            {
                stk.push(val);
            }
            else
            {
                stk.push(2*val-min);
                min=val;
            }
        }
        else if(ch==2)
        {
            if(stk.top()<min)
            {
                min=min*2-stk.top();
            }
            stk.pop();
        }
        else if(ch==3)
        {
            if(stk.top()<min)
            {
                cout<<"top: "<<min<<"\n";
            }
            else
            cout<<"top: "<<stk.top()<<"\n";
        }
        else
        {
            break;
        }
        // cout<<"Stack Top: "<<stk.top()<<"\n";
        cout<<"min_Value: "<<min<<"\n";
    }
}
