
package collegesystem_ds; 

 

public class node<T> { 

    node<T> next; 

    T data; 

 

    public node(T data) { 

        this.next = null; 

        this.data = data; 

    } 

 

    public node(node<T> next, T data) { 

        this.next = next; 

        this.data = data; 

    } 

 

    public node<T> getNext() { 

        return next; 

    } 

 

    public T getData() { 

        return data; 

    } 

     

} 
