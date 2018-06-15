
public class IntStack {
	
	private int[] my_stack;
	private int size;
	private int top;
	
	public IntStack(){
		top = -1;
		size = 50;
		my_stack = new int [50];
		
	}
	
	public IntStack(int size){
		top = -1;
		this.size = size;
		my_stack = new int[size];
		
	}
	
	public boolean push(int item){
		if(!isFull()){	
			top++;
			my_stack[top]= item;
			return true;
		}
		else
			return false;			
	}
	
	public boolean isFull(){
		return (top == my_stack.length-1);
	}
	
	public int pop(){
			return (top--);
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
}
