package comparativeCode;

class Queue{
	
	private int f;
	private int r;
	private int capacity; //maximum number of element that queue can hold
	private int count; //number of element the queue has
	private int arr[];
	
	public Queue(int size) {
		arr=new int[size];
		f=0;
		r=-1;
		count=0;
		capacity=size;
		
	}
	
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("queue is overflow");
			System.exit(-1);
		}
		
		System.out.println("Inserting "+ item);
		r=(r+1)%capacity;
		arr[r]=item;
		count++;
		System.out.println("rear : "+ r);
		System.out.println("front : "+ f);
		System.out.println("count : "+ count);
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is underflow");
			System.exit(-1);
		}
		int x=arr[f];
		System.out.println("Removing "+x);
		f=(f+1) % capacity;
		count--;
		System.out.println("rear : "+ r);
		System.out.println("front : "+ f);
		System.out.println("count : "+ count);
		return x;
	}
	
	public boolean isFull() {
		return count==capacity;
	}
	
	public boolean isEmpty(){
		return count==0;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is underflow");
			System.exit(-1);
		}
		
		return arr[f];
	}
	
	public int size() {
		return count;
	}
}


public class QueueDriver {
	public static void main(String[] args) {
		Queue queue=new Queue(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		System.out.println("peek element "+queue.peek());
		queue.dequeue();
		queue.dequeue();
		System.out.println("Queue size "+queue.size());
	}
}
