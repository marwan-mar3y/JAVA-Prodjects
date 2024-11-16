
package collegesystem_ds; 

import Collegesystem_ds.node;

 

public class linked_list<T> { 

    node<T> head, tail;  

    public linked_list() { 

        head = tail = null; 

    } 

 

    public void add(T data) { 

        node<T> n = new node<T>(data); 

        if (head == null) { 

            head = tail = n; 

            return; 

        } 

        tail.next = n; 

        tail = n; 

    } 

 

    public node<T> getHead() { 

        return head; 

    } 

 

    public node<T> getTail() { 

        return tail; 

    } 

     

} 
