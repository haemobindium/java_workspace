package example;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.prepend(1);
		list.prepend(2);
		list.prepend(3);
		list.prepend(4);
		System.out.println(list);
		System.out.println(list.getSize());
		list.append(5);
		list.append(6);
		list.append(7);
		System.out.println(list);
		
		list.removeFirst();
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		list.removeLast();
		System.out.println(list);
	}

}
