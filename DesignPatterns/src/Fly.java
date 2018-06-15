
public interface Fly {
	String fly();
}

class Itflys implements Fly{

	public String fly() {
		
		return "I can fly";
	}
	
}

class CantFly implements Fly{

	
	public String fly() {
		
		return "I can't fly";
	}
	
	
}