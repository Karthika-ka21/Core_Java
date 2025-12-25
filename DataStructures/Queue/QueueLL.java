
public class QueueLL {
	Node first;
	int count=0;
	public void add(Object e) {
		if(first==null) {
			first=new Node(e);
			count++;
		}
		else {
			Node curr=first;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=new Node(e);
			count++;
		}
		
	}
	public Object peek() {
		return first.ele;
	}
	public Object poll() {
		Object item=first.ele;
		first=first.next;
		count--;
		return item;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	
}
