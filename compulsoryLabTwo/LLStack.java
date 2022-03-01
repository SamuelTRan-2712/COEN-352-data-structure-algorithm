package compulsoryLabTwo;

public class LLStack<E> implements ADTStack<E>{

	
	private Link<E> head; // Pointer to list header
	
	private Link<E> top; // Pointer to last element
	
	private int cnt;
	
	public LLStack(int size) {
		this();
	}
	
	public LLStack() {
		// TODO Auto-generated constructor stub
		head = top = new Link<E>(null);
		cnt = 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		head.setNext(null);
		head = top = new Link<E>(null);
		cnt = 0;
		
	}

	@Override
	public void push(E it) {
		// TODO Auto-generated method stub
		if (this.length() == 0)
		{
			Link<E> newNode = new Link<E>(it, null);
			top = head = newNode;
			//top = head.next();
		}
		else
		{
			Link<E> newNode = new Link<E>(it,null);
			top = top.setNext(newNode);
			
		}
		cnt++;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (this.length() == 0) {
			return null;
		}
		
		E it = top.element();
		
		
		Link<E> temp = head;
		while (temp.next() != top)
		{
			temp = temp.next();
		}

		temp.setNext(top.next());
		top.release();
		top = temp;
		
		cnt --;
		return it;
	}

	@Override
	public E topValue() {
		// TODO Auto-generated method stub
		
		if (this.length() == 0) {
			return null;
		}
		
		else
		{
			return top.element();
		}
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return cnt;
	}
	

}
