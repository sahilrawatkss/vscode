#include<iostream>
using namespace std;
struct node
{
    struct node * left;
    int val;
    struct node * right;
};

struct node * insert(struct node * temp,int val)
{
    if(temp==NULL)
    {
        temp=(struct node *)malloc(sizeof(struct node));
        temp->left=NULL;
        temp->right=NULL;
        temp->val=val;
        cout<<"\nvalue inserted\n";
        return temp;
    }
    else if(val<temp->val)
    {
        temp->left=insert(temp->left,val);
    }
    else
    {
        temp->right=insert(temp->right,val);
    }
    return temp;
}

void inorder(struct node * rt)
{
    if(rt==NULL)
    return ;
    else
    {
        inorder(rt->left);
        cout<<"  "<<rt->val;
        inorder(rt->right);
    }
    return;
}
void preorder(struct node * rt)
{
    if(rt!=NULL)
    {
        cout<<"  "<<rt->val;
        preorder(rt->left);
        preorder(rt->right);
    }
    return;
}
void postorder(struct node * rt)
{
    if(rt!=NULL)
    {
        postorder(rt->left);
        postorder(rt->right);
        cout<<"  "<<rt->val;
    }
    return;
}
void countnodes(struct node * rt,int *ct)
{
    if(rt!=NULL)
    {
        *ct=*ct+1;
        countnodes(rt->left,ct);
        countnodes(rt->right,ct);
    }
    return;
}
int main()
{
    struct node * root=NULL;
    int ch;
    int cn=0;
    while(ch!=6)
    {
        cout<<"\nEnter choice \n1.Insert node \n2.Print Inorder\n3.Print Preorder\n4.Print Postorder\n5.Count Nodes \n6.Exit\n";
        cin>>ch;
        switch(ch)
        {
            case 1:
            int val;
            cout<<"Enter value\n";
            cin>>val;
            if(root==NULL)
            root=insert(root,val);
            else
            insert(root,val);
            break;
            case 2:
            inorder(root);
            break;
            case 3:
            preorder(root);
            break;
            case 4:
            postorder(root);
            break;
            case 5:
            
            countnodes(root,&cn);
            cout<<"Total number of nodes: "<<cn;
            break;
            case 6:
            cout<<"\nExiting...";
            break;
            default:
            cout<<"Enter correct option";
        }
    }
}