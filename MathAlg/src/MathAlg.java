import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class Math{
	int power(int b, int e){
		int s=1;
		for(int i=0;i<e;i++)
			s*=b;
		return s;
	}
}



public class MathAlg {

	public static void main(String[] args) throws ScriptException {
		// TODO Auto-generated method stub
		
		Math m = new Math();
		 /*	Scanner in = new Scanner(System.in);
			System.out.println("Enter base value");
			int base = in.nextInt();
			System.out.println("Enter exponent value");
			int exponent = in.nextInt(); */
		System.out.println("Power of "+m.power(2,3));
		
		String xyz = "3*3+3";
	    String kkk = "(100 % 6)* 7";
	    ScriptEngineManager manager = new ScriptEngineManager();
	    ScriptEngine se = manager.getEngineByName("JavaScript");
	    Object result1 = se.eval(xyz);
	    Object result2 = se.eval(kkk);
	    System.out.println("result1: " + result1);
	    System.out.println("result2: " + result2);
		

	}

}
