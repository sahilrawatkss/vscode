package dsa.linkedlist;

class llnode{
    int data;
    llnode next;
    llnode(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class llprac {
    llnode head;
    public static void main(String[] args) {
        llprac ll=new llprac();
        ll.push(2);
        ll.display();
        ll.push(1);
        ll.display();

        //append is a keyword
        ll.appends(5);
        ll.appends(6);
        ll.display();
        ll.insert(10,3);
        ll.display();
        ll.pop();
        ll.display();
        ll.shift();
        ll.display();
        ll.del(3);
        ll.display();
    }
    void display()
    {
        llnode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }

    void push(int data)
    {
        llnode nd=new llnode(data);
        nd.next=head;
        head=nd;
    }

    void appends(int data)
    {
        llnode nd=new llnode(data);
        if(head==null)
        {
            head=nd;
        }
        llnode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nd;
    }

    void insert(int data,int pos)
    {
        llnode temp=head;
        llnode nd=new llnode(data);
        int i=1;
        while(i!=pos-1)
        {
            temp=temp.next;
            i++;
        }
        nd.next=temp.next;
        temp.next=nd;
    }

    void shift()
    {
        head=head.next;
    }

    void pop()
    {
        llnode temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }

    void del(int pos)
    {
        llnode temp=head;
        int i=1;
        if(pos==1)
        {
            head=head.next;
        }
        else {
            while (i != pos - 1) {
                temp = temp.next;
                temp.next=temp.next.next;
                i++;
            }
        }
    }
}
