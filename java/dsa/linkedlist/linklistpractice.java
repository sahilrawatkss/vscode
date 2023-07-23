package dsa.linkedlist;

class nodes
{
    int data;
    nodes next;
    nodes(int data)
    {
        this.data=data;
        next=null;
    }

}
public class linklistpractice {
    nodes head;

    void push(int data) {
        nodes nd = new nodes(data);
        nd.next = head;
        head = nd;
    }

    void appends(int new_data) {
        nodes nd = new nodes(new_data);
        if (head == null)
            head = nd;
        nodes temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nd;
    }

    void printing() {
        nodes n = head;
        while (n != null) {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

    void search(int sdata) {
        int flag = 0;
        nodes temp = head;
        while (temp != null) {
            if (sdata == temp.data) {
                System.out.println("Present");
                flag = 1;
                break;
            }
            temp = temp.next;
        }
        if (flag != 1) {
            System.out.println("not present");
        }
    }

    int lengthList()
    {
        nodes temp=head;
        int len=0;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        return len;
    }

    int recsearch(nodes temp, int sdata) {
        if (temp == null)
            return -1;
        if (temp.data == sdata)
            return 1;
        return recsearch(temp.next,sdata);
    }

    int reclen(nodes temp)
    {
        if(temp==null)
            return 0;
        return 1+reclen(temp.next);
    }



    void reverseList()
    {
        nodes current=head;
        nodes prev=null;
        nodes next=null;

        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        printing();
    }
//
//    void recrevList(nodes current)
//    {
//        if(current==null)
//            return ;
//    }

    nodes reverserec(nodes head)
    {
        if (head == null || head.next == null)
            return head;

        /* reverse the rest list and put
        the first element at the end */
        nodes rest = reverserec(head.next);
        System.out.print(" rest:"+head.next.next);
        head.next.next = head;


        /* tricky step -- see the diagram */
        head.next = null;
        System.out.println(" head:"+head.data);
        /* fix the head pointer */
        return rest;
    }
    public static void main(String[] args) {
        linklistpractice ll = new linklistpractice();
        ll.push(5);
        ll.push(3);
        ll.push(1);
        ll.push(-1);
        ll.push(20);
        ll.push(100);

        ll.appends(6);
        ll.appends(7);
        ll.appends(300);
        ll.printing();

        ll.search(-1);
        ll.search(5);


        if (ll.recsearch(ll.head, 300) == 1) {
            System.out.println("Present");
        } else
        {
            System.out.println("Not present");
        }
        if(ll.recsearch(ll.head, -2)==1)
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not Present");
        }

        //finding Length of Linked List
        System.out.println(ll.lengthList());

        System.out.println(ll.reclen(ll.head));

//        ll.reverseList();
//        System.out.println(ll.head.data);

        ll.head=ll.reverserec(ll.head);
        ll.printing();
    }
}