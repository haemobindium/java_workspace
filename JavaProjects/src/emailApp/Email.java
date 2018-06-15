package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String companySuffix = "blackstraw.com";
	private int mailboxCapacity=500;
	private int defaultPasswordLength=8;
	private String alternateEmail;
	
	//constructor to receive firstname and lastname
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED "+this.firstName+" "+this.lastName);
	
		//ask for the department
		this.department= setDepartment();
		System.out.println("Department: "+this.department);
	
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is "+password);
	
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your email is "+email);
	}
	
	private String setDepartment(){
		System.out.print("DEPARTMENT CODES \n 1 for Sales \n 2 for Development \n 3 for Accounting \n 0 for none");
		Scanner in = new Scanner(System.in);
		int depChoice= in.nextInt();
		switch(depChoice){
		case 1: 
				return "sales";
		case 2:
				return "dev";
		case 3:
				return "acct";
		default:
				return "";		
		}
		
		
	}
	
	//generate random password
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for(int i=0;i<length;i++){
			int rand = (int)(Math.random()* passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity=capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password){
		this.password = password;
	}
	
	public int getMailboxCapacity(){ return mailboxCapacity;}
	public String getAlternateEmail(){ return alternateEmail; }
	public String getPassword(){ return password; }
	
	public String showInfo(){
		return "DISPLAY NAME "+firstName+" "+lastName
				+"COMPANY EMAIL "+email+" MAILBOX CAPACITY "
				+mailboxCapacity+"mb";	
	}
	
}
