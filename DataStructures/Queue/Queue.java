import java.util.ArrayList;
public class Queue {
    ArrayList q=new ArrayList();
    public void add(Object e) {
		q.add(e);
	}
	public Object poll() {
		Object item= q.get(0);
		q.remove(0);
		return item;
	}
	public Object peek() {
		return q.get(0);
	}
	public int size() {
		return q.size();
	}
	public boolean isEmpty() {
		return size()==0;
	}

}
