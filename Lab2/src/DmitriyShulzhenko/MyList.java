package DmitriyShulzhenko;

public class MyList {
	private int size;
	private Node head;
	private Node tail;
	
	public int getSize(){return size;}
	
	public MyList(){
		size=0;
		head=null;
		tail=null;
	}
	
	public void add(int number){
		Node newNode=new Node(number);
		if (head==null){
			head=tail=newNode;
			size++;
		} 
		else {
			tail.next=newNode;
			tail=tail.next;
			size++;	
		}
	}
	
	public int get(int position) throws IndexOutOfListSizeException{
		if (position<0||position+1>size){
			throw new IndexOutOfListSizeException();
		} 
		if (position+1==size){
			return tail.data;
		} 
		if (position==0){
			return head.data;
		} 
		Node current = head;
		for(int i=1;i<position;i++){
			current=current.next;
		}
		return current.data;
	}
	
	public void delete(int position) throws IndexOutOfListSizeException{
		if (position<0||position+1>size){
			throw new IndexOutOfListSizeException();
		} 
		if (position==0){
			head=head.next;
			size--;
			return;
		} 
		if (position+1==size){
			
		} 
		Node current = head;
		for(int i=1;i<position;i++){
			 current=current.next;
		}
		if (position+1==size){
			tail=current;
			current.next=null;
		} else {
		current.next=current.next.next;
		}
		size--;
	}

	@Override
	public String toString() {
		String returningString ="";
		returningString += "Saraksts: \n";
		returningString += "Izmçrs: "+size+"\n";
		returningString += "["+head.data;
		Node current = head;
		for(int i=1;i<size;i++){
			 current=current.next;
			 returningString += ","+current.data;
		}
		return returningString+"]";
	}
	
	
}
