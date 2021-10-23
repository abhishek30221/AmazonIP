class Intersect
{
    int size(Node head)
    {
        int c = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            c++;
        }
        return c;
    }
    Node leveller(Node head , int size)
    {
        int c = 0;
        while(c++ != size)
        {
            head = head.next;
        }
        return head;
    }
    //Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2)
    {
         int sizell1 = size(head1); 
         int sizell2 = size(head2); 
         
         if(sizell1 < sizell2)
            head2 = leveller(head2 , sizell2-sizell1); 
         else
            head1 = leveller(head1 , sizell1-sizell2); 
        
        while(head1 != null || head2 != null)
        {
            head1 = head1.next;
            head2 = head2.next;
            if(head1 == head2)
                return head1.data; 
        }
        return -1; 
    }
}


