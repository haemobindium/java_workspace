
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStack stack = new IntStack();
		
		if(!stack.isFull()){
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(6);
		}
		
		if(!stack.isEmpty()){
			stack.pop();
			stack.pop();
			stack.pop();
		}

	}

}
