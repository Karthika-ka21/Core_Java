
public class QueueEg2 {

	public static void main(String[] args) {
		QueueLL q=new QueueLL();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.size());
		System.out.println(q.peek());
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}

