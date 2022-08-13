
public class merge {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next=node4;
		node4.next = node5;
		node5.next = node6;
		
		
		ListNode rnode1 = new ListNode(1);
		ListNode rnode2 = new ListNode(2);
		ListNode rnode3 = new ListNode(3);
		ListNode rnode4 = new ListNode(4);
		ListNode rnode5 = new ListNode(5);
		ListNode rnode6 = new ListNode(6);
		
		rnode1.next = rnode2;
		rnode2.next = rnode3;
		rnode3.next=rnode4;
		rnode4.next = rnode5;
		rnode5.next = rnode6;
		
		Solution lol = new Solution();
		lol.mergeTwoLists(node1, rnode1);

	}

}
