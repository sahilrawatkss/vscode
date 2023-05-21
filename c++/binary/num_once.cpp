#include<iostream>
using namespace std;

void findNum(int arr[],int low,int high)
{
    if(low>high)
    return ;
    if(low==high)
    {
        cout<<arr[low];
        return;
    }
    int mid=(low+high)/2;

    if(mid%2==0)
    {
        if(arr[mid]==arr[mid+1])
        findNum(arr,mid+2,high);
        else
        findNum(arr,low,mid);
    }
    else
    {
        if(arr[mid]==arr[mid-1])
        findNum(arr,mid+1,high);
        else
        findNum(arr,low,mid-1);
    }
}

int main() 
{
    int arr[]={1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
    int len = sizeof(arr) / sizeof(arr[0]);
    findNum(arr,0,len-1);
    return 0;
}



