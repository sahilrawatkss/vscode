package dsa.linkedlist.basic.reverselinklist.doublylinklist;

class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
    }
}
public class doublinlist {
    Node head;
    public static void main(String[] args) {
        doublinlist dl=new doublinlist();
        dl.push(5);
        dl.push(4);
        dl.push(3);
        dl.push(2);
        dl.push(1);
        dl.display();

        dl.del(3);
        dl.display();
        dl.del(4);
        dl.display();
        dl.del(1);
        dl.display();
    }
    void push(int data)
    {
        Node nd=new Node(data);
        nd.next=head;
        if(head!=null)
        {
            head.prev=nd;
        }
        nd.prev=null;
        head=nd;
    }

    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println("");
    }

    void del(int x)
    {
        int i=1;
        if(x==1)
        {
           head=head.next;
           head.prev=null;
        }
        else
        {
            Node temp=head;
            while(i!=x)
            {
                temp=temp.next;
                i++;
            }
            if(temp.next==null)
            {
                temp.prev.next=null;
            }
            else
            {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }
}
