package sample;

public class sample {
	public static int sizeof(Class dataType)
	{
	    if (dataType == null) throw new NullPointerException();

	    if (dataType == int.class    || dataType == Integer.class)   return 4;
	    if (dataType == short.class  || dataType == Short.class)     return 2;
	    if (dataType == byte.class   || dataType == Byte.class)      return 1;
	    if (dataType == char.class   || dataType == Character.class) return 2;
	    if (dataType == long.class   || dataType == Long.class)      return 8;
	    if (dataType == float.class  || dataType == Float.class)     return 4;
	    if (dataType == double.class || dataType == Double.class)    return 8;

	    return 4; // 32-bit memory pointer... 
	              // (I'm not sure how this works on a 64-bit OS)
	}
	public static void main(String[] args){
		
		int no=99;
		short sno=90;
		char c='A';
		String s = "String";
		boolean b = true ;
		System.out.println(sizeof(int.class));
		
	while(b){
		System.out.println("Integer no "+no);
		
		System.out.println("Short no: "+sno);
		System.out.println("character is "+c);
		System.out.println("String is "+s);
		break;
	}	
		
		System.out.println("Hi, this is println()");
	}
}
