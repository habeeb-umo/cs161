

public class LinkedBookList {

	private BookNode head;
	private int size;
	
	public LinkedBookList(){
		head = null;
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	//IMPLEMENT -- adds a book to the end of the linked list
	public void add(Book b){
		BookNode node = new BookNode(b);
		if(head == null){
		head = new BookNode(b);
		return;
		}
		else{
		BookNode current = head;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(node);
		}
	}
		
	
	//IMPLEMENT -- adds a book at the specific index, or at the end if index is greater than size
	public void add(Book b, int index){
		if(index<0 || index>size)
			add(b);
		if(index == 0) {
		head = new BookNode(b, head);
		}
		else{
		BookNode current = head;
		for(int i = 0; i<index-1; i++){
			current = current.getNext();
			}
		current.setNext(new BookNode(b,current.getNext()));
			}
		size++;
			
	
	}
	
	//IMPLEMENT -- removes a book and returns it, or returns null if it is not present
	public Book remove(Book b){
	BookNode current = head;
		while(current != null){
		current = current.getNext();
		}
		current.setNext(new BookNode(b, current.getNext().getNext()));
		return null;
	}

	//IMPLEMENT -- removes a book at a specific indexand returns it, 
	//or returns null if it is not present
	public Book remove(int index){
		
		return null;
	}
	
	//IMPLEMENT -- returns the total number of pages in the linked list
	public int totalPages(){
	BookNode current = head;
	int numPages = 0;
		while(current != null){
		numPages += current.getNumPages();
		current = current.getNext();	
		}
		return numPages;
	}
	
	public String toString()
	{
		BookNode current = head;
		String res = "";
		while(current != null){
		res += current.getBook().toString();
		current = current.getNext();
		}
		return res;
	}
	
}



