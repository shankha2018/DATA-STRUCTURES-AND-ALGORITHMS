import java.io.BufferedReader;
import java.io.x;

class LinkedList
{
    class Node
    {
        int item;
        Node next;
        Node(int data)
        {
            item=data;
            next=null;
        }
    }
    Node start;
    Node p=start;
    public void Insert_Beginning()
    {
        System.out.println("Enter Item:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int new_item=Integer.parseInt(br.readLine());
        Node temp=new Node(new_item);
        temp.next=start;
        start=temp;
    }
    public void Insert_end()
    {
        System.out.println("Enter Item:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int new_item = Integer.parseInt(br.readLine());
        Node temp = new Node(new_item);
        if(start==null)
        {
            start=temp;
        }
        else
        {
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=temp;
        }
    }
    public void InsertAtLocation()
    {
        System.out.println("Enter Location:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int location = Integer.parseInt(br.readLine());

        System.out.println("Enter Item:");
        int new_item = Integer.parseInt(br.readLine());
        Node temp = new Node(new_item); 
        if (location==1)
        {
            temp.next=p;
            start=temp;
        }
        for (int i=1;i<location;i++)
        {
            p=p.next;
        }
        Node next_node=new Node(p.next.data);
        p.next=temp;
        temp.next=next_node;
    }

    public void InsertAfterValue()
    {
        System.out.println("Enter Value of a node:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine());

    }
}