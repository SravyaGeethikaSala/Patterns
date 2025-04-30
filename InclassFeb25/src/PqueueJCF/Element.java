package PqueueJCF;

public class Element implements Comparable{ 
	int value;
	int priority;
	
	public Element(int value,int priority) {
		this.value=value;
		this.priority=priority; 
	}
	
	@Override
	public int compareTo(Element o) {
		return Integer.compare(o.priority, this.priority);
	}
	
	public String toString() {
		return "("+value+","+"Priority" +priority+")";
	}
}
