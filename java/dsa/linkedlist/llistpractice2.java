package dsa.linkedlist;

class nodes2
{
    int data;
    nodes2 next;
    nodes2(int data)
    {
        this.data=data;
        next=null;
    }
}
public class llistpractice2 {
    nodes2 head;
    public static void main(String[] args) {
        llistpractice2 ll=new llistpractice2();
        ll.push(10);
        ll.appends(20);
        ll.appends(30);
        ll.push(5);
        ll.llprints();
        ll.deletion(20);
        ll.llprints();
    }
    void push(int data)
    {
        nodes2 nd=new nodes2(data);
        nd.next=head;
        head=nd;
    }

    void appends(int data)
    {
        nodes2 temp=head;
        nodes2 nd=new nodes2(data);
        if(head==null)
        {
            temp.next=nd;
            temp=nd;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nd;
    }

    void llprints()
    {
        nodes2 temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }

    void deletion(int data)
    {
        nodes2 prev=head;
        nodes2 temp=head;
        if(head.data==data)
        {
            head=head.next;
        }
        while(temp.data!=data)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
}
