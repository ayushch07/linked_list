package Linked_list;

import Linked_list.linked_list_cycle.Node;

public class cycle_removal {
	public class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
		}
	}
	private Node head;
	private int size;

	private Node tail;
	public void addfirst(int item)
	{
		Node nn=new Node(item);
		if(this.size==0)
		{
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else
		{
			nn.next=this.head;
			this.head=nn;
			this.size++;
		}
	}
	public void addlast(int item)
	{
		if(this.size==0)
		{
			addfirst(item);
		}
		else
		{
			Node nn=new Node(item);
			this.tail.next=nn;
			this.tail=nn;
			this.size++;
		}
	}
	 public void createcycle()
     {
     	//this.tail.next=this.head.;;circular;
     	this.tail.next=this.head.next.next;//cycle
     }
     public Node hascycle()
     {
     	Node fast=this.head;
     	Node slow=this.head;
     	while(fast!=null && fast.next!=null)
     	{
     		fast=fast.next.next;
     		slow=slow.next;
     		if(slow==fast)
     			return slow;
     	}
     	return null;
     }
     public void remove_cycle1()
     {
    	 Node meetup=hascycle();
    	 if(meetup==null)
    		 return;
    	 Node start=head;
    	 while(start!=null)
    	 {
    		 Node temp=meetup;
    		 while(temp.next!=meetup)
    		 {
    			 if(temp.next==start)
    			 {
    				temp.next=null; 
    				return;
    			 }
    			 temp=temp.next;
    		 }
    		 start=start.next;
    	 }
     }
     public void removecycle2()
     {
    	 Node meetup=hascycle();
    	 if(meetup==null)
    	 {
    		 return;
    	 }
    	 int count=1;
    	 Node temp=meetup;
    	 while(temp.next!=meetup)
    	 {
    		 count++;
    		 temp=temp.next;
    	 }
    	 Node fast=head;
    	 for(int i=1;i<=count;i++)
    	 {
    		  fast=fast.next;
    	 }
    	 Node start=head;
    	 while(start.next!=fast.next)
    	 {
    		 start=start.next;
    		 fast=fast.next;
    	 }
    	 fast.next=null;
     }
     public void floydcycleremoval()
     {
    	 Node meetup=hascycle();
    	 if(meetup==null)
    	 {
    		 return;
    	 }
    	Node fast=meetup;
    	 Node start=head;
    	 while(start.next!=fast.next)
    	 {
    		 start=start.next;
    		 fast=fast.next;
    	 }
    	 fast.next=null;
    	 
     }
     public void display()
 	{
 		Node temp=this.head;
 		while(temp!=null)
 		{
 			System.out.print(temp.data+"-->");
 			//System.out.print(temp.next+"-->");
 			temp=temp.next;
 		}
 		System.out.println(".");
 	}
     public static void main(String[]args)
     {
    	 cycle_removal cl=new cycle_removal();
    	 cl.addlast(1);
      	 cl.addlast(2);
      	 cl.addlast(3);
      	 cl.addlast(4);
      	 cl.addlast(5);
      	 cl.addlast(6);
      	 cl.addlast(7);
      	 cl.addlast(8);
      	 cl.createcycle();
      	 cl.remove_cycle1();
      	 cl.display();
      	 
     }
     

}
