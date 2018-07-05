package com.codingdojo.doubly_linked_list;

public class DLL {
    public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
    // the push method will add a new node to the end of the list
    public void push(Node newNode) {
        // if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    
    public void printValuesForward() {
        // find the first node, aka head.
        Node current = this.head;
        
        // while the current node exists...
        while(current != null) {
            // print it's value
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.next;
        }
    }
    public void printValuesBackward() {
    	Node current = this.tail;
    	while(current!= null) {
    		System.out.println(current.value);
    		current = current.previous;
    	}
    }
    public Node pop() {
        // if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == this.tail) {
        	Node temp = this.head;
        	this.head = null;
        	this.tail = null;
        	return temp;
        }       	
        	Node last = this.tail;
        	Node second = this.tail.previous;
        	second.next = null;
        	this.tail = second;
        	return last;
    }
    public boolean contains(Integer val) {
    	if(this.head == null) {
    		return false;
    	}
    	Node current = this.head;
    	while(current != null) {
    		if (current.value == val) {
    			return true;
    		}
    		else {
    			current = current.next;
    		}
    	}
    	return false;
    }
    public int size() {
    	if(this.head == null) {
    		return 0;
    	}
    	int count = 0;
    	Node current = this.head;
    	while(current != null) {
    		count++;
    		current= current.next;
    	}
    	return count;
    }
    void removeAt(int index) {
    	if(index == 0) {
    		this.head = this.head.next;
    		this.head.previous = null;
    		return;
    	}
    	int count = 1;
    	Node current = this.head.next;
    	while(current != null) {
    		if (count == index && current.next == null) {
    			this.tail = current.previous;
    			this.tail.next = null;
    			break;
    		}
    		else if(count == index) {
    			Node pre = current.previous;
    			Node nex = current.next;
    			current.next.previous = pre;
    			pre.next = nex;
    			break;
    		}
    		else {
    			current = current.next;
    			count++;
    		}
    	}
    }
   
    
}