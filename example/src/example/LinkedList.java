package example;

public class LinkedList {
	private Node header;
	private Node lastNode;
	private int size;
	
	public LinkedList(){
		header= new Node(null);
		lastNode= header;
	}
		
		// case1 : prepend
	public void prepend(Integer data){
		Node n = new Node(data);
		if(size == 0){
			header.next= n;
			lastNode = n;
			size++;
		}
		else{
			Node temp= header.next;
			header.next=n;
			n.next=temp;
			size++;
			
		}
	}
	
	public void append(Integer data){
		Node n = new Node(data);
		if(size == 0){
			header.next= n;
			lastNode = n;
			size++;
		}
		else{
			lastNode.next=n;
			lastNode=n;
			size++;
			
		}
	}
	
	
	//getSize method
	public int getSize(){
		return size;
	}
	
	//tostring method
	public String toString(){
		Node n = header.next;
		String temp="";
		while(n!=null){
			temp=temp+n.data+" ";
			n=n.next;
		}
		return temp;
	}
	
	//removefirst method
	public void removeFirst(){
		if(size!=0){
			header.next= header.next.next;
			size--;
		}
		
	}
	
	//removerLast method
	public void removeLast(){
		if(size==1){
			header.next=null;
			lastNode=header;
			size--;
		}
		else if(size!=0){
			Node n = header.next;
			int count=1;
			while(count != size-1){
				n = n.next;
				count++;
			}
			lastNode=n;
			lastNode.next=null;
			size--;
			 
		}
	}
		
}
