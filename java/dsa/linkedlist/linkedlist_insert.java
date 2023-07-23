package dsa.linkedlist;

class node
{
    int data;
    node next;
    node(int new_data)
    {
        data=new_data;
        next=null;
    }
}


public class linkedlist_insert
{
    node head;
    void push(int new_data)
    {
        node nd=new node(new_data);
        nd.next=head;
        head=nd;
    }

    void printlist()
    {
        node tnode=head;
        int i=1;
        while(tnode!=null)
        {
            System.out.println("node "+i+": "+tnode.data);
            tnode=tnode.next;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Linked List");
        linkedlist_insert ll=new linkedlist_insert();
        ll.push(1);
        ll.push(2);
        ll.printlist();
    }
}
