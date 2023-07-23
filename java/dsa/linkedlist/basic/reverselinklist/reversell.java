package dsa.linkedlist.basic.reverselinklist;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}

public class reversell {
    Node head;
    public static void main(String[] args) {
        reversell ll=new reversell();
        ll.push(4);
        ll.push(5);
        ll.push(3);
        ll.push(6);
        ll.push(2);
        ll.push(1);
        ll.push(1);
        ll.display();
//        ll.rev(ll.head);
//        ll.revering();
//        ll.display();

//        ll.recrev(ll.head,ll.head);
//        ll.display();
//
//        ll.head=ll.recrev2(ll.head);
//        ll.display();
//
//        ll.delalt();
//        ll.display();
//        reversell ll2=new reversell();
//        ll2.push(5);
//        ll2.push(3);
//        ll2.push(7);
//        ll2.push(10);
//        ll2.push(0);
//        ll2.push(-12);
//
//        ll2.display();

//        ll.midlist(ll.head,9);
//        ll.display();

//        ll.sortAlt(ll.head);
//        ll.display();

        ll.occurance(ll.head,1);

        ll.skipNode(ll.head,2,1);
        ll.display();
}
    void push(int data)
    {
        Node nd=new Node(data);
        nd.next=head;
        head=nd;
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
    void rev(Node temp)
    {
        if(temp.next!=null)
        {
            rev(temp.next);
        }
        System.out.print(temp.data+" ");
    }
    void revering()
    {
        Node next=null;
        Node current=head;
        Node prev=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    void recrev(Node temp, Node hd)
    {
        if(temp.next.next==null)
        {
            head=temp.next;
        }
        if(temp.next.next!=null)
        {
            recrev(temp.next,hd);
        }
        temp.next.next=temp;
        if(hd.next.next==hd)
        {
            hd.next=null;
        }
    }

    Node recrev2(Node temp)
    {
        if(temp.next==null)
            return temp;

        Node rest=recrev2(temp.next);
        temp.next.next=temp;
        temp.next=null;
        return rest;
    }

    void delalt()
    {
        Node temp=head;
        if(temp.next==null)
        {

        }
        else {
            while (temp.next.next != null) {
                temp.next = temp.next.next;
                temp = temp.next;
                if (temp.next == null)
                    break;
            }
            if (temp.next == null || temp.next.next == null) {
                temp.next = null;
            }
        }
    }


    void intersect(Node hd1,Node hd2)
    {
        while(hd1.next!=null&&hd2.next!=null)
        {
            if(hd1.data==hd2.data)
            {
                System.out.println();
            }
        }
    }

    void midlist(Node head,int key)
    {
        Node nd=new Node(key);
        Node temp=head;
        int count=0;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        count=count/2;
        while(count!=0)
        {
            head=head.next;
            count--;
        }
        nd.next=head.next;
        head.next=nd;

    }

    void sortAlt(Node head)
    {
        int flag=1;
        Node temp=head;
        Node prev=head;
        Node hd=head;
        while(head.next!=null&&head.next.next!=null)
        {
            hd=head;
            head=head.next.next;
            temp=hd.next;
            hd.next=temp.next;
            if(flag==1)
            {
                temp.next=null;
                flag=0;
            }
            else
            {
                temp.next=prev;
            }
            prev=temp;
        }
        if(head.next!=null)
        {
            temp=head.next;
            temp.next=prev;
            prev=temp;
        }
        head.next=prev;

    }

    void occurance(Node head,int k)
    {
        int count=0;
        while(head!=null)
        {
            if(head.data==k)
            {
                count++;
            }
            head=head.next;
        }
        System.out.println(count);
    }

    void skipNode(Node head,int M,int N)
    {
        while(head!=null)
        {
            int print=M-1;
            while(print!=0&&head!=null)
            {
                head=head.next;
                print--;
            }
            int skip=N;
            Node temp=head;
            while(skip!=0&&head!=null)
            {
                head=head.next;
                skip--;
            }
            if(N!=0&&head!=null)
            {
                temp.next=head.next;
                head=temp.next;
            }

        }
    }
}
