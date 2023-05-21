#include<iostream>
using namespace std;

class node
{
    int data;
    node next;
    node(int value)
    {
        data=value;
        next=NULL;
    }
}

node * push(node * head)
{
    int num;
    cout<<"Enter the number";
    cin>>num;
}
int main()
{
    node * head =NULL;

    while(1)
    {
        int ch;;
        cout<<"Enter choice\n1.push\n2.pop\n3.print";
        cin>>ch; 
        switch(ch)
        {
            case 1: head=push(head);
        }
    }
}