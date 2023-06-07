#include<iostream>
#include<algorithm>
using namespace std;
int minCost(int[],int ,int);
    int main()
    {
        int arr[]={2000,1,2,790,300,10,20,50,100,3,200,200,500,1000};
        int k=3;
        int n=sizeof(arr)/sizeof(arr[0]);
        int mn=minCost(arr,k,n);
        cout<<"\nTotal minimum cost: "<<mn;
    }


    int minCost(int arr[],int k,int n)
{
    int sum=0;
    sort(arr,arr+n);
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    int j=n-1;
    for(int i=0;i<j;i++)
    {
        sum=sum+arr[i];
        j-=k;
    }
    return sum;
}

