package ADTDictionary;

public class DLLDictionary<Key,E> implements ADTDictionary<Key,E> {

	private DList<Key> klist; //declaration of object named klist of type Key
	private DList<E> vlist; //declaration of object named vlist of type E

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		klist.clear();
		vlist.clear();
	}

	@Override
	public void insert(Key k, E e) {
		// TODO Auto-generated method stub
		DLink<Key> tempKlist = klist.curr; // save the node where curr is pointing at to tempKlist
		klist.next(); //move the cursor to the next element but tempKlist is not changed
		tempKlist.setNext(new DLink<Key>(k,tempKlist, klist.curr)); //insert a new node of type Key, its previous element is tempKList and its next is where curr is pointing at
		
		DLink<E> tempVlist = vlist.curr; // save the node where curr is pointing at to tempVlist
		vlist.next(); //move the cursor to the next element but tempVlist is not changed
		tempVlist.setNext(new DLink<E>(e,tempVlist, vlist.curr)); //insert a new node of type E, its previous element is tempVList and its next is where curr is pointing at
	}

	@Override
	public E remove(Key k) {
		// TODO Auto-generated method stub
		klist.moveToStart(); //move the curr of klist to index 0
		vlist.moveToStart(); //move the curr of vlist to index 0
		int count = 0; // set a dummy variable to keep track of where curr is in klist, so then we can set curr for vlist to that exact corresponding position
		
		// while current position is not at tail.next(), which is null,(if curr points to null, meaning that we reach the end of klist) keep traversing through the loop
		while(klist.curr != null)
		{
			//if the node after where curr is pointing to contain the element we need to find, do the following
			if(klist.curr.next().element() == k)
			{
				count = klist.currPos(); // set the value of count to the index of which curr is pointing at
				DLink<Key> tempKlist = klist.curr.next().next(); //name the node after the one containing k to tempKlist
				klist.curr.setNext(tempKlist); //set curr to point to that tempKlist node
				tempKlist.setPrev(klist.curr); // since its Double LList, we need to set the previous value of tempKlist too
				
				//use that count to be the upper bound to find the value corresponding to k in vlist
				for(int i = 0; i< count; i++)
				{
					vlist.next(); // keep traversing vlist till you get to the position corresponding to where curr is in klist

				}
				E elementToBeRemoved = vlist.curr.next().element(); //save the element to be removed in vList in a generic variable type E and and I name it as vElementToBeRemov
				DLink<E> tempVlist = vlist.curr.next().next(); // name the node after the one containing v to tempVlist
				vlist.curr.setNext(tempVlist); //set curr to point to that tempKlist node
				tempVlist.setPrev(vlist.curr); // since its Double LList, we need to set the previous value of tempVlist too
				return elementToBeRemoved;// return the element that you are deleting (in vlist only) 
			}
			klist.next(); // if we cant find the element in klist, keep traversing till we find it, then this while loop will break
		}
		
		return null; // if k is not there, meaning that v is not there, return nothing cuz theres nothing to be found
	}

	@Override
	public E removeAny() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E find(Key k) {
		// TODO Auto-generated method stub
		klist.moveToStart(); //move the curr to index 0 of klist
		vlist.moveToStart(); //move the curr to index 0 of klist
		
		while(klist.curr != null) // while current position is not at tail.next(), which is null,(if curr points to null, meaning that we reach the end of klist) keep traversing through the loop 
		{
			//if curr is pointing to a node that has the element we need to find, do the following
			if (klist.curr.element() == k) 
			{
				int index = klist.currPos();//create an integer called index where it stores the index of the node that contains element k
				
				//use that index to be the upper bound to find the value corresponding to k in vlist
				for(int i = 0; i< index; i++) 
				{
					vlist.next(); // keep traversing vlist till you get to the mentioned corresponding element 
				}
				return vlist.getValue(); // return that value of vlist
			}
			klist.next(); // if we cant find the element in klist, keep traversing till we find it, then this while loop will break
			
		}
		return null; // if k is not there, meaning that v is not there, return nothing cuz theres nothing to be found
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return klist.length();
	}
}
	
	