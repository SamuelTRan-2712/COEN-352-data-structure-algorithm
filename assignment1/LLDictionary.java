package ADTDictionary;

public class LLDictionary<Key, E> implements ADTDictionary<Key, E> {
	
	//declaration of objects key and value
	private LList<Key> klist; 
	private LList<E> vlist; 
	
	//set size (constructor) of the two objects, they should have the same size
	LLDictionary(int size){
		klist = new LList<Key>(size);
		vlist = new LList<E>(size);
	}
	
	// clear the klist and vlist
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		klist.clear();
		vlist.clear();
	}

	//insert function 
	@Override
	public void insert(Key k, E e) {
		// TODO Auto-generated method stub
		
		Link<Key> tempKlist = klist.curr; //create a copy of pointer curr called temp and set that to the node where curr is pointing at
		klist.next(); // move curr to the next node (but temp is not moved)
		tempKlist.setNext(new Link<Key>(k,klist.curr)); //set the node where temp is pointing to to point to where curr is 
		
		//since each value of k is corresponding to each value of v, and given that they are of same size, do the samething for vlist
		Link <E> tempVlist = vlist.curr;
		vlist.next();
		tempVlist.setNext(new Link<E>(e, vlist.curr));
		}

	//remove function 
	@Override
	public E remove(Key k) {
		// TODO Auto-generated method stub
		klist.moveToStart(); //move the curr of klist to index 0
		vlist.moveToStart(); //move the curr of vlist to index 0
		int count = 0; // set a dummy variable to keep track of where curr is in klist, so then we can set curr for vlist to that exact corresponding position
		
		// while current position is not at tail.next(), which is null,(if curr points to null, meaning that we reach the end of klist) keep traversing through the loop 
		while (klist.curr != null) {
			//if the node after where curr is pointing to contain the element we need to find, do the following
			if(klist.curr.next().element() == k) {
				count = klist.currPos(); // set the value of count to the index of which curr is pointing at
				Link<Key>tempKlist = klist.curr.next().next(); //name the node after the one containing k to tempKlist
				klist.curr.setNext(tempKlist); //set curr to point to that tempKlist node
				
				//use that count to be the upper bound to find the value corresponding to k in vlist
				for(int i = 0; i < count; i++) {
					vlist.next(); // keep traversing vlist till you get to the position corssponding to where curr is in klist
				}
				
				E vElementToBeRemove = vlist.curr.next().element(); //save the element to be removed in vList in a generic variable type E and and I name it as vElementToBeRemove
				Link<E>tempVlist = vlist.curr.next().next(); // name the node after the one containing v to tempVlist
				vlist.curr.setNext(tempVlist); // //set curr to point to that tempKlist node
				return vElementToBeRemove; // return the element that you are deleting (in vlist only) 
			}
			klist.next();// if we cant find the element in klist, keep traversing till we find it, then this while loop will break 
		}
		return null;// if k is not there, meaning that v is not there, return nothing cuz theres nothing to be found 
	}

	// wtfffff is going on here, whats the different between this and remove(Key k)????
	@Override
	public E removeAny() {
		// TODO Auto-generated method stub
		return null;
	}

	//find function 
	@Override
	public E find(Key k) {
		// TODO Auto-generated method stub
		klist.moveToStart(); //move the curr to index 0 of klist
		vlist.moveToStart(); //move curr to index 0 of vlist 
		
		while(klist.curr != null) // while current position is not at tail.next(), which is null,(if curr points to null, meaning that we reach the end of klist) keep traversing through the loop 
		{
			//if curr is pointing to a node that has the element we need to find, do the following
			if(klist.curr.element() == k) {
				int index = klist.currPos(); //create an integer called index where it stores the index of the node that contains element k
				
				//use that index to be the upper bound to find the value corresponding to k in vlist
				for(int i = 0; i < index; i++) {
					vlist.next(); // keep traversing vlist till you get to the mentioned corresponding element 
					}
				return vlist.getValue(); // return that value of vlist 
			}
			klist.next(); // if we cant find the element in klist, keep traversing till we find it, then this while loop will break 
		}
		
		return null; // if k is not there, meaning that v is not there, return nothing cuz theres nothing to be found 
	}

	@Override
	//return size of klist. Here the time complexity is O(1) cuz it just returns the lenght of the list
	public int size() {
		// TODO Auto-generated method stub
		return klist.length();
	}
}
