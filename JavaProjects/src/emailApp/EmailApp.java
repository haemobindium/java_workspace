package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Email em1 = new Email("John","Smith");
		
		em1.setMailboxCapacity(350);
		em1.setAlternateEmail("js@gmail.com");
		System.out.print(em1.showInfo());
		
	}

}
