package linkedlistkunal;

public class LL {

    private Node tail;
    private Node head;
    private int size;

    public LL()
    {
        this.size = 0;
    }

    public Node get(int index)
    {
        Node node = head;
        for (int i = 0 ; i < index ; i++)
        {
            node = node.next;
        }

        return node;
    }

    public int deleteindex(int index)
    {
        if(index == 0)
        {
            return deletefirst();
        }

        if(index ==  size - 1)
        {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    public int deleteLast()
    {
        if(size <= 1)
        {
            return deletefirst();
        }

        Node secondLat = get(size-2);
        int val = tail.value;
        tail = secondLat;
        tail.next  = null;
        return val;

    }

    public int deletefirst()
    {
        int val  = head.value;
         head = head.next;
        if (head == null)
        {
            tail = null;
        }

        size--;
        return val;
    }

    public void insertindex(int value, int index)
    {
        if (index == 0)
        {
            insertfirst(value);
            return;

        }
        if (index == size)
        {
            insertLast(value);
            return;
        }

        Node temp  = head;
        for (int i = 1 ; i < index ; i++)
        {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;

    }
    public void insertLast(int value)
    {

        Node node = new Node(value);
        if(tail == null)
        {
            insertfirst(value);
            return;
        }

        tail.next = node;
        tail  = node;
        size++;
    }

    public void insertfirst(int value)
    {
        Node node  = new Node(value);
        node.next = head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }
        size++;
    }

    public void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END .");
    }



    private class Node
    {
        int value;
        Node next;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }

    }


}
