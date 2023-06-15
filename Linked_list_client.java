package Linked_list;

public class Linked_list_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		linked_list ll=new linked_list();
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);
		ll.addfirst(40);
		ll.display();
		ll.addlast(50);
       ll.display();		
        System.out.println(ll.getfirst());

        System.out.println(ll.getlast());
	}

}
