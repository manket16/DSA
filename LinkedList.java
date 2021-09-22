public class LinkedList{
    static Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data = d;
        }
    }
    
    void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    
    void printlist(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    void delete(int key){
        Node temp = head;
        Node prev = null;
        if(temp!=null && temp.data==key){
            prev.next = temp.next;
            return;
        }
        
        while(temp!=null && temp.data!=key){
            prev = temp;
            temp = temp.next;
            
            
        }
        if(temp==null){
            return;
        }
        
        prev.next = temp.next;
    }
    
    
    public int kth(int pos){
        Node temp = head;
        int curr = 0;
        while(temp!= null){
            if(curr == pos){
                return temp.data;
            }
            curr++;
            temp = temp.next;
            
            
        }
        assert(false);
        return 0;
    }
    
    
    
    Node reverse(Node node){
        
        Node prev = null;
        Node curr = node;
        
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }

    
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.push(7);
        list.push(9);
        list.push(4);
        list.push(2);
        list.printlist(head);
        head=list.reverse(head);
        list.printlist(head);
        
        
        
    }
}