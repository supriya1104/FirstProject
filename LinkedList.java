package com.interview.practise;

public class LinkedList {
	
	Node head;
	static class Node{
       int data;
       Node next;
       
       Node(int d)
       {
    	   data = d;
    	   next = null;
       }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList l = new LinkedList();
       l.push(1);
       l.push(4);
       l.push(7);
       
       
//     l.head = new Node(1);
//     Node second = new Node(2);
//     Node third = new Node(3);
//   
//   l.head.next = second;
//   second.next = third;
   print(l.head);
l.deletenode(0);
print(l.head);

  }



	private void deletenode(int i) {
		// TODO Auto-generated method stub
	if(head == null)
		return;
	
	Node temp = head;
	if(i == 0)  //if position is head 
	{
		head = temp.next;
		System.out.println("data in temp " + temp.data);
		
	return;
	}
	
	//traverse till the position before the delete node
	for (int a=0; temp!=null && a<i-1; a++)
	{
        temp = temp.next;
	System.out.println("data in temp " + temp.data);
	}
	
	//if position is more the no. of nodes
	if(temp == null || temp.next == null)
	return;
	
	Node next = temp.next.next;
	temp.next = next;
	
	}



	private void push(int i) {
		// TODO Auto-generated method stub
		Node n = new Node(i);
		n.next = head;
		head = n;
		
	}

	private static void print(Node head2) {
		// TODO Auto-generated method stub
		Node iter = head2;
		 while(iter != null)
		 {
			 System.out.println(iter.data);
			 iter = iter.next;
		 }
		{
			
		}
	}

}
